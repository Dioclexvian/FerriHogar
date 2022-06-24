package Vista;



import javax.swing.*;
import java.awt.*;

public class elementosLogin extends JPanel {
    private JButton Ingresar;
    // private JButton Registro;
    private JLabel txUsuario;
    private JLabel txContraseña;
    private JTextField inUsuario;
    private JPasswordField inContraseña;
    ImageIcon im;
    


    public elementosLogin(){
        setLayout(null);
        setBackground(new Color(36,59,103));
        
        componentesInicio();
    }
    

    public void componentesInicio() {
        txUsuario = new JLabel("USUARIO:");
        txUsuario.setFont(new Font("Arial Narrow",Font.BOLD, 20));
        txUsuario.setBounds(500, 192,160,20);
        txUsuario.setForeground(new Color(234,235 ,237 ));
        add(txUsuario);

        inUsuario = new JTextField();
        inUsuario.setBounds(660, 192,200,20);
        inUsuario.setFont(new Font("Arial",Font.BOLD, 16));
        inUsuario.setBackground(new Color(234,235 ,237 ));
        add(inUsuario);

        txContraseña = new JLabel("CONTRASEÑA:");
        txContraseña.setFont(new Font("Arial",Font.BOLD, 20));
        txContraseña.setBounds(500, 288,160,20);
        txContraseña.setForeground(new Color(234,235 ,237 ));
        add(txContraseña);

        inContraseña = new JPasswordField();
        inContraseña.setBounds(660, 288,200,20);
        inContraseña.setFont(new Font("Arial",Font.BOLD, 16));
        inContraseña.setBackground(new Color(234,235 ,237 ));
        add(inContraseña);

        Ingresar = new JButton("Ingresar");
        Ingresar.setBounds(600, 384, 200, 80);
        Ingresar.setFont(new Font("Arial",Font.BOLD, 20));
        Ingresar.setBackground(new Color(194, 125, 252));
        Ingresar.setForeground(new Color(36,59,103));
        Ingresar.setActionCommand("login");
        Ingresar.setOpaque(true);
        add(Ingresar);
        
    }




    public JLabel getTxUsuario() {
        return txUsuario;
    }
    public void setTxUsuario(JLabel txUsuario) {
        this.txUsuario = txUsuario;
    }

    public JLabel getTxContraseña() {
        return txContraseña;
    }
    public void setTxContraseña(JLabel txContraseña) {
        this.txContraseña = txContraseña;
    }

    public JTextField getInUsuario() {
        return inUsuario;
    }
    public void setInUsuario(JTextField inUsuario) {
        this.inUsuario = inUsuario;
    }

    public JPasswordField getInContraseña() {
        return inContraseña;
    }


    public void setInContraseña(JPasswordField inContraseña) {
        this.inContraseña = inContraseña;
    }


    public JButton getIngresar() {
        return Ingresar;
    }
    public void setIngresar(JButton ingresar) {
        Ingresar = ingresar;
    }

    public void paint(Graphics g) {
        Dimension tam = getSize();
        im = new ImageIcon(getClass().getResource("/Assets/fondo.logo.jpg"));
        g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paint(g);
    }
}
