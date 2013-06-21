/**/


package Util;
import Util.AcessoBD;
import Forms.FormLogin;
import java.awt.Color;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class ClassSplash extends JWindow {

    AbsoluteLayout absoluto;
    AbsoluteConstraints absImagem, absBarra, absTexto;
    ImageIcon imagem;
    JLabel jlabel, jlabel2;
    JProgressBar barra;
    
        public static final String SYSTEM = "TrDoc";

    public ClassSplash() {

        absoluto = new AbsoluteLayout();
        absImagem = new AbsoluteConstraints(0, 0);
        absBarra = new AbsoluteConstraints(0, 265);
        absTexto = new AbsoluteConstraints(10,245);
        imagem = new ImageIcon(this.getClass().getResource("/Icons/logo_TRdoc.jpg"));
        barra = new JProgressBar();
      //  barra.setBackground(new Color(228,153,13));
        barra.setForeground(Color.BLACK);
        barra.setPreferredSize(new Dimension(300, 10));
        jlabel = new JLabel();
        jlabel2 = new JLabel();
        jlabel2.setText("Carregando módulos. Aguarde...");
        jlabel2.setForeground(Color.BLACK);
        jlabel.setIcon(imagem);
        this.getContentPane().setLayout(absoluto);
        this.getContentPane().add(barra, absBarra);
        this.getContentPane().add(jlabel2,absTexto);
        this.getContentPane().add(jlabel, absImagem);


       /* try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        new Thread() {
            public void run() {
                int i = 0;
                while (i < 31) {
                    barra.setValue(i);
                    i++;
                    jlabel2.setText("Carregando módulos. Aguarde... "+i+"%");
                    try {
                        sleep(80);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ClassSplash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                while (i < 51) {
                    barra.setValue(i);
                    i++;

                    jlabel2.setText("Carregando banco de dados. Aguarde... "+i+"%");

                    try {
                        sleep(150);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ClassSplash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                while (i <= 99) {
                    barra.setValue(i);
                    i++;
                    jlabel2.setText("Abrindo sistema. Aguarde... "+i+"%");

                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ClassSplash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                dispose();
                FormLogin principal = new FormLogin();
                principal.setVisible(true);
            }
        }.start();

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new ClassSplash();
        AcessoBD bd = new AcessoBD();
        bd.ConfigBD();
    }
}
