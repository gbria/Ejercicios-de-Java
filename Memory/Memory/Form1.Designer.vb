<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Me.LblFail = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.BtnRestart = New System.Windows.Forms.Button()
        Me.LblTime = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.LblLevel = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.LblScore = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.AyudaToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.AcercaDeToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.Timer1 = New System.Windows.Forms.Timer(Me.components)
        Me.MenuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'LblFail
        '
        Me.LblFail.AutoSize = True
        Me.LblFail.Font = New System.Drawing.Font("Noto Sans", 21.75!, System.Drawing.FontStyle.Bold)
        Me.LblFail.Location = New System.Drawing.Point(955, 324)
        Me.LblFail.Name = "LblFail"
        Me.LblFail.Size = New System.Drawing.Size(34, 39)
        Me.LblFail.TabIndex = 30
        Me.LblFail.Text = "0"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Font = New System.Drawing.Font("Noto Sans", 14.25!, System.Drawing.FontStyle.Bold)
        Me.Label7.Location = New System.Drawing.Point(939, 276)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(66, 26)
        Me.Label7.TabIndex = 29
        Me.Label7.Text = "Fallos"
        '
        'BtnRestart
        '
        Me.BtnRestart.AutoSize = True
        Me.BtnRestart.Font = New System.Drawing.Font("Noto Sans", 12.0!, System.Drawing.FontStyle.Bold)
        Me.BtnRestart.Location = New System.Drawing.Point(927, 517)
        Me.BtnRestart.Name = "BtnRestart"
        Me.BtnRestart.Size = New System.Drawing.Size(91, 32)
        Me.BtnRestart.TabIndex = 28
        Me.BtnRestart.Text = "Reiniciar"
        Me.BtnRestart.UseVisualStyleBackColor = True
        '
        'LblTime
        '
        Me.LblTime.AutoSize = True
        Me.LblTime.Font = New System.Drawing.Font("Noto Sans", 21.75!, System.Drawing.FontStyle.Bold)
        Me.LblTime.ForeColor = System.Drawing.SystemColors.ControlText
        Me.LblTime.Location = New System.Drawing.Point(947, 433)
        Me.LblTime.Name = "LblTime"
        Me.LblTime.Size = New System.Drawing.Size(51, 39)
        Me.LblTime.TabIndex = 25
        Me.LblTime.Text = "30"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Noto Sans", 14.25!, System.Drawing.FontStyle.Bold)
        Me.Label6.Location = New System.Drawing.Point(931, 385)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(83, 26)
        Me.Label6.TabIndex = 24
        Me.Label6.Text = "Tiempo"
        '
        'LblLevel
        '
        Me.LblLevel.AutoSize = True
        Me.LblLevel.Font = New System.Drawing.Font("Noto Sans", 21.75!, System.Drawing.FontStyle.Bold)
        Me.LblLevel.Location = New System.Drawing.Point(955, 215)
        Me.LblLevel.Name = "LblLevel"
        Me.LblLevel.Size = New System.Drawing.Size(34, 39)
        Me.LblLevel.TabIndex = 27
        Me.LblLevel.Text = "1"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Noto Sans", 14.25!, System.Drawing.FontStyle.Bold)
        Me.Label2.Location = New System.Drawing.Point(942, 167)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(61, 26)
        Me.Label2.TabIndex = 26
        Me.Label2.Text = "Nivel"
        '
        'LblScore
        '
        Me.LblScore.AutoSize = True
        Me.LblScore.Font = New System.Drawing.Font("Noto Sans", 21.75!, System.Drawing.FontStyle.Bold)
        Me.LblScore.Location = New System.Drawing.Point(955, 106)
        Me.LblScore.Name = "LblScore"
        Me.LblScore.Size = New System.Drawing.Size(34, 39)
        Me.LblScore.TabIndex = 23
        Me.LblScore.Text = "0"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Noto Sans", 14.25!, System.Drawing.FontStyle.Bold)
        Me.Label3.Location = New System.Drawing.Point(913, 58)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(119, 26)
        Me.Label3.TabIndex = 22
        Me.Label3.Text = "Puntuación"
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.AyudaToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.MenuStrip1.Size = New System.Drawing.Size(1044, 24)
        Me.MenuStrip1.TabIndex = 31
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'AyudaToolStripMenuItem
        '
        Me.AyudaToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.AcercaDeToolStripMenuItem})
        Me.AyudaToolStripMenuItem.Name = "AyudaToolStripMenuItem"
        Me.AyudaToolStripMenuItem.Size = New System.Drawing.Size(53, 20)
        Me.AyudaToolStripMenuItem.Text = "Ayuda"
        '
        'AcercaDeToolStripMenuItem
        '
        Me.AcercaDeToolStripMenuItem.Name = "AcercaDeToolStripMenuItem"
        Me.AcercaDeToolStripMenuItem.Size = New System.Drawing.Size(152, 22)
        Me.AcercaDeToolStripMenuItem.Text = "Acerca de"
        '
        'Timer1
        '
        Me.Timer1.Interval = 1000
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1044, 761)
        Me.Controls.Add(Me.LblFail)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.BtnRestart)
        Me.Controls.Add(Me.LblTime)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.LblLevel)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.LblScore)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.MenuStrip1)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents LblFail As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents BtnRestart As Button
    Friend WithEvents LblTime As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents LblLevel As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents LblScore As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents MenuStrip1 As MenuStrip
    Friend WithEvents AyudaToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents AcercaDeToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents Timer1 As Timer
End Class
