import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class App4{
    public static void main(String[] args) {
    //     String nombre = JOptionPane.showInputDialog(
    //     null,
    //     "Introduce tu nombre:",
    //     "Entrada",
    //     JOptionPane.QUESTION_MESSAGE
    // );

    // JOptionPane.showMessageDialog(
    //     null,                  // ventana padre
    //     "Nombre introducido: "+nombre,   // mensaje
    //     "Información",           // título
    //     JOptionPane.INFORMATION_MESSAGE // tipo de mensaje
    // );

//     String[] opciones = {"Rojo", "Verde", "Azul"};
// String color = (String) JOptionPane.showInputDialog(
//     null,
//     "Selecciona un color:",
//     "Selector de color",
//     JOptionPane.QUESTION_MESSAGE,
//     null,       // icono
//     opciones,   // opciones
//     opciones[0] // valor por defecto
// );
//     JOptionPane.showMessageDialog(
//         null,                  // ventana padre
//         "Color introducido: "+color,   // mensaje
//         "Información",           // título
//         JOptionPane.INFORMATION_MESSAGE // tipo de mensaje
//     );

        //EJEMPLO FILECHOOSER
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecciona un fichero");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter( "Imágenes (*.jpg, *.png)", "jpg", "png");
	    chooser.setFileFilter(filtro);
        int resultado = chooser.showOpenDialog(null); // null = ventana padre
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File fichero = chooser.getSelectedFile();
            System.out.println("Fichero seleccionado: " + fichero.getAbsolutePath());
        } else {
            System.out.println("No se seleccionó ningún fichero");
        }
    }
}