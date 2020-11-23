/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package criarusuariosistemaintegrado;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marcos.junior
 */
public class CriarUsuarioSistemaIntegrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CriarUsuarioSistemaIntegrado.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConectaGeral abrir = new ConectaGeral();
        abrir.setVisible(true);
    }
}
