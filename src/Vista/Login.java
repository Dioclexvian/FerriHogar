package Vista;



import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
    
    private elementosLogin eLogin;
    
    public Login() {
        setTitle("Ferrtería: FerriHogar");
        setPreferredSize(new Dimension(1024, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        iniciaComponentes();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void iniciaComponentes() {
        eLogin = new elementosLogin();
        getContentPane().add(eLogin);
    
    }
    public elementosLogin geteLogin() {
        return eLogin;
    }

    public void seteLogin(elementosLogin eLogin) {
        this.eLogin = eLogin;
    }

    
    
}
