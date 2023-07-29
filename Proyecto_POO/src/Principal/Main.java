package Principal;
import Vista.FAutenticacion;
import javax.swing.UIManager;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {
    public static void main(String[] args) {
        // Establecer el LookAndFeel Nimbus
        //Mejora visual como cuando ejecutas directamente desde la ventana 
        //Si no se establece esto las ventanas cargan en lookandFell (Metal) desde este main por default, no tan agradable visualmente
        //Nimbus da una apariencia mucho mejor :)
        try {
            for (LookAndFeelInfo nombre : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(nombre.getName())) {
                    UIManager.setLookAndFeel(nombre.getClassName());
                    System.out.println("Se cargo el LookAndFell 'Nimbus' Correctamente");
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    FAutenticacion usuario = new FAutenticacion();
    usuario.setVisible(true);
    // Nombres de los lookAndFell 
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    System.out.println(info.getName());}

    }
}


 