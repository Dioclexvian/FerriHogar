package Vista;



import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {

    private JButton botonCrear;
    private JButton botonData;
    private JLabel texto1;
    private JLabel texto2;
    private JLabel piePg;
    private JLabel titulo;
    private JLabel titulo2;
    ImageIcon im;

    public PanelPrincipal() {
        setLayout(null);
        inicializarComponentes();
        setVisible(true);
    }
    

    
    public void inicializarComponentes() {
        
        titulo = new JLabel("ADMINISTRADOR DEL");
        titulo.setFont(new Font("Arial Narrow", Font.BOLD, 30));
        titulo.setForeground(new Color(234, 235, 237));
        titulo.setBounds(410, 20, 670, 80);
        add(titulo);
        
        titulo2 = new JLabel("INVENTARIO");
        titulo2.setFont(new Font("Arial Narrow", Font.BOLD, 52));
        titulo2.setForeground(new Color(194, 125, 252));
        titulo2.setBounds(410, 65, 670, 80);
        add(titulo2);

        
        texto1 = new JLabel("");
        texto1.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        texto1.setForeground(Color.WHITE);
        texto1.setBounds(410, 140, 670, 80);
        String t = "<html><body>Bienvenido a Helioferroso, su sistema de confianza en "
                    + "<br> la administración más oportuna y practica de su negocio</body></html>";
        texto1.setText(t);
        add(texto1);

        botonData = new JButton("CONSULTAR");
        botonData.setActionCommand("CONSULTAR");
        botonData.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        botonData.setBounds(420, 250, 200, 40);
        botonData.setBackground(new Color(194, 125, 252));
        botonData.setForeground(new Color(36,59,103));
        add(botonData);

        texto2 = new JLabel("");
        texto2.setFont(new Font("Arial Narrow", Font.BOLD, 16));
        texto2.setForeground(Color.WHITE);
        texto2.setBounds(420, 300, 250, 100);
        String t2 = "<html><body>En Consultar puedes: listar, actualizar o eliminar los productos "
                    + "</body></html>";
        texto2.setText(t2);
        add(texto2);

        botonCrear = new JButton("CREAR");
        botonCrear.setActionCommand("CREAR");
        botonCrear.setFont(new Font("Arial Narrow", Font.BOLD, 20));
        botonCrear.setBounds(700, 250, 200, 40);
        botonCrear.setBackground(new Color(194, 125, 252));
        botonCrear.setForeground(new Color(36,59,103));
        add(botonCrear);

        piePg = new JLabel("RECUERDE: CADA TORNILLO CUENTA");
        piePg.setFont(new Font("berlinsans", Font.BOLD, 25));
        piePg.setForeground(new Color(234, 235, 237));
        piePg.setBounds(110, 500, 670, 80);
        add(piePg);
    }


    public JButton getBotonCrear() {
        return botonCrear;
    }
    public void setBotonCrear(JButton botonCrear) {
        this.botonCrear = botonCrear;
    }
    


    public JButton getBotonData() {
        return botonData;
    }
    public void setBotonData(JButton botonData) {
        this.botonData = botonData;
    }

    public void paint(Graphics g) {
        Dimension tam = getSize();
        im = new ImageIcon(getClass().getResource("/Assets/fondo.home.jpg"));
        g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paint(g);
    }
    
    
}
