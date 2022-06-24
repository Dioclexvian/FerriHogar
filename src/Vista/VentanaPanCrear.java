package Vista;




import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPanCrear extends JFrame {

    private PanCrear panel;

    public VentanaPanCrear() {
        setTitle("Crear: FerriHogar");
        setSize(1024, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(110,93,207));
        getContentPane().setLayout(null);

        inicializarComponentesPanCrear();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentesPanCrear() {
        panel = new PanCrear();
        panel.setBounds(0, 0, 1024,720);
        getContentPane().add(panel);
    }

    public PanCrear getPanel() {
        return panel;
    }

    public void setPanel(PanCrear panel) {
        this.panel = panel;
    }
}