package apps.graficas;

import javax.swing.*;

/**
 * Contenedor: es el elemento base de la aplicación gráfica, representa la ventana de la aplicación
 * sobre las que se añaden los distintos componentes. Sin este elemento no podríamos hacer nada.
 * <p>
 * Panel: es el elemento que se coloca en el contenedor, sobre este puede haber distintos componentes.
 * Si no añadimos el panel al contenedor no veremos nada, aunque la ventana tenga componentes.
 * <p>
 * Componentes: son los elementos que se añaden al Panel como etiquetas, botones, lista, checkbox, etc.
 */

public class AplicacionGrafica extends JFrame {
    /*
     * Panel de la aplicación
     * */
    private JPanel contentPane;

    public AplicacionGrafica() {
        //Añade un título, no es estrictamente necesario
        setTitle("Titulo de la ventana");

        /*
         * Coordenadas (x, y, width, height) de la aplicación y su altura y longitud,
         * si no lo indicamos aparecerá una ventana muy pequeña
         * */
        setBounds(400, 200, 250, 300);

        /*
         * Indica que cuando se cierre la ventana se acaba la aplicación,
         * si no lo indicamos la aplicación seguirá funcionando
         * */
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Hace visible la ventana, si no lo hacemos no veremos la aplicación
        setVisible(true);

        //Creamos el panel
        contentPane = new JPanel();

        //Indicamos su diseño
        contentPane.setLayout(null);

        //Asigno el panel a la ventana
        setContentPane(contentPane);

        //Creación de componentes

        //Creamos el componente
        JLabel tag = new JLabel("Hola mundo");

        //Colocamos el componente
        tag.setBounds(60, 20, 100, 20);

        //Añadimos el elemento al panel para hacerlo visible
        contentPane.add(tag);

    }

/**
 *  También podemos unir las dos clases
 *
 *     public static void main(String[] args) {
 *         AplicacionGrafica ventana = new AplicacionGrafica();
 *
 *     }
 *
 */


}
