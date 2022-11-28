Imports System.Threading

Public Class Form1
    'LIST DE PICTURES Y NUMEROS
    Dim pictures As List(Of PictureBox) = New List(Of PictureBox)
    Dim numbers As New List(Of Integer)

    'VARIABLES IMAGENES 1 Y 2
    Private pictureA As PictureBox
    Private pictureB As PictureBox

    'VARIABLES OPCIONES
    Private firstChoice As String
    Private secondChoice As String

    'VARIABLES DE TIEMPO
    Private totalTime = 30
    Private countDown As Integer

    'OTRAS VARIABLES
    Private numLevel As Integer = 1
    Private qtyCards As Integer
    Private score As Integer
    Private tries As Integer
    Private checkGameOver = False

    Public Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        CheckLevel(numLevel)
        LoadPictures()
    End Sub

    Private Sub TimerEvent(sender As Object, e As EventArgs) Handles Timer1.Tick
        'RESTA EL TIEMPO
        countDown -= 1
        LblTime.Text = countDown

        'GIRA LAS CARTAS
        If countDown = 28 Then
            BackCards()
        End If

        'SE ACABA EL TIEMPO
        If countDown < 1 Then
            GameOver("Has perdido. ")
        End If

    End Sub

    Private Sub RestartGameEvent(sender As Object, e As EventArgs) Handles BtnRestart.Click
        RestartGame()
    End Sub

    Private Sub LoadPictures()

        'GENERA LOS NUMEROS (1,1,2,2,3,3...)
        Dim a As Integer = 1
        Dim b As Integer = 1
        For index = 1 To qtyCards
            numbers.Add(a)
            numbers.Add(b)
            a += 1
            b += 1
        Next

        'POSICION DE LAS CARTAS
        Dim leftPos As Integer = 20
        Dim topPos As Integer = 40
        Dim rows As Integer = 0

        'COLOCACIÓN DE LAS CARTAS
        For index = 1 To numbers.Count
            Dim newPic As PictureBox = New PictureBox
            newPic.Height = 250
            newPic.Width = 200
            newPic.Image = Image.FromFile("cards/back.png")
            newPic.SizeMode = PictureBoxSizeMode.StretchImage

            'EL EVENTO CLICK (newPic.Click) LLAMA A LA FUNCIÓN (PictureBox_Click) 
            AddHandler newPic.Click, AddressOf PictureBox_Click
            pictures.Add(newPic)

            If rows < 4 Then
                rows += 1
                newPic.Left = leftPos
                newPic.Top = topPos
                Me.Controls.Add(newPic)
                leftPos += 200
            End If

            If rows = 4 Then
                leftPos = 20
                topPos += 250
                rows = 0
            End If
        Next

        If numLevel > 1 Then
            Shuffle()
            Timer1.Start()
            countDown = totalTime
        Else
            RestartGame()
        End If

    End Sub

    Private Sub PictureBox_Click(picture As PictureBox, e As EventArgs)
        'MOSTRAMOS SOLAMENTE DOS CARTAS MEDIANTE EL TAG

        'PRIMERA OPCIÓN
        If firstChoice Is Nothing Then
            pictureA = picture
            If pictureA.Tag IsNot Nothing Then
                pictureA.Image = Image.FromFile("cards/" & CStr(pictureA.Tag) & ".png")
                firstChoice = CStr(pictureA.Tag)
            End If

            'SEGUNDA OPCIÓN
        ElseIf secondChoice Is Nothing
            pictureB = picture
            If pictureB.Tag IsNot Nothing Then
                pictureB.Image = Image.FromFile("cards/" & CStr(pictureB.Tag) & ".png")
                secondChoice = CStr(pictureB.Tag)
            End If

            'REFRESCAMOS
            Application.DoEvents()

            'LLAMAMOS LA FUNCIÓN QUE COMPRUEBA LAS CARTAS
            CheckPictures(pictureA, pictureB)
        End If

    End Sub

    Private Sub Shuffle()
        'DESORDENAMOS EL ARRAY DE NÚMEROS
        Dim randomList = numbers.OrderBy(Function(x) Guid.NewGuid()).ToList
        numbers = randomList

        'DAMOS TAG Y ASIGNAMOS IMAGEN
        For i = 0 To pictures.Count - 1
            pictures(i).Tag = numbers(i)
            pictures(i).Image = Image.FromFile("cards/" & pictures(i).Tag & ".png")
        Next

    End Sub

    Private Sub RestartGame()
        'BARAJAMOS
        Shuffle()

        'REINICIAMOS
        LblLevel.Text = 1
        LblTime.Text = countDown
        LblScore.Text = 0
        Timer1.Start()
        countDown = totalTime

        checkGameOver = False
    End Sub

    Private Sub BackCards()
        'OCULTAMOS CARTAS
        For i = 0 To pictures.Count - 1
            pictures(i).Image = Image.FromFile("cards/back.png")
        Next
    End Sub

    Private Sub CheckPictures(pictureA As PictureBox, pictureB As PictureBox)
        'COMPARAMOS LAS DOS ELECCIONES
        If firstChoice = secondChoice Then
            pictureA.Tag = Nothing
            pictureB.Tag = Nothing
        Else
            'PENALIZACIÓN
            countDown -= 2
            tries += 1
            LblFail.Text = tries

            'MUESTRA LAS DOS OPCIONES ERRONEAS 1 SEGUNDO
            Thread.Sleep(750)
            pictureA.Image = Image.FromFile("cards/back.png")
            pictureB.Image = Image.FromFile("cards/back.png")
        End If

        'LIMPIAMOS LAS OPCIONES
        firstChoice = Nothing
        secondChoice = Nothing

        'COMPRUEBA SI HA ACERTADO TODAS LAS PAREJAS
        If pictures.All(Function(o) o.Tag = pictures(0).Tag) Then
            'MUCHO CUIDADO CON ESTA CONDICION
            If checkGameOver = False Then
                YouWin()
            End If

        End If

    End Sub

    Private Sub YouWin()
        Timer1.Stop()
        MessageBox.Show("¡Perfecto!", "YouWin")

        'AUMENTO DE LVL
        numLevel += 1
        LblLevel.Text = numLevel

        'SCORE
        LblScore.Text += GetScore(tries)

        'FALLOS
        tries = 0
        LblFail.Text = tries

        'VUELVE A EMPEZAR
        CheckLevel(numLevel)
        LoadPictures()

    End Sub

    Private Function CheckLevel(numLevel As Integer) As Integer
        'LIMPIO LAS LIST PARA GENERARLAS NUEVAMENTE
        If numbers.Count > 0 Then
            'Borro
            For index = 0 To numbers.Count
                numbers(index).remove
            Next
            numbers.Clear()
            pictures.Clear()

            pictures = Nothing

        End If

        Application.DoEvents()


        'SUBE LA CANTIDAD DE CARTAS A 4 CADA 5 LVL HASTA UN MÁXIMO DE 20
        If numLevel >= 1 And numLevel < 5 Then
            qtyCards = 4
        Else
            qtyCards = 6
        End If
        Return qtyCards
    End Function

    Private Function GetScore(tries As Integer) As Integer
        If tries = 0 Then
            score = 100
        Else
            score = 50
        End If
        Return score
    End Function

    Private Sub GameOver(msg As String)
        'GAMEOVER
        Timer1.Stop()
        checkGameOver = True
        MessageBox.Show(msg + "Pulse reiniciar para volver a jugar", "¿Seguimos?")
    End Sub

    Private Sub AcercaDeToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles AcercaDeToolStripMenuItem.Click
        'ACERCA DE
    End Sub

End Class
