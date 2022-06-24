package Vista;


import java.awt.*;
import javax.swing.*;


public class home extends JFrame{
    private PanelPrincipal panel;

    public home() {
        setTitle("Home: FerriHogar");
        setPreferredSize(new Dimension(1024, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        inicioComponentes();
        pack();
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicioComponentes() {

        panel = new PanelPrincipal();
        panel.setBounds(30, 30, 950, 615);
        getContentPane().add(panel);

    }

    public PanelPrincipal getPanel() {
        return panel;
    }

    public void setPanel(PanelPrincipal panel) {
        this.panel = panel;
    }

    public void mensajeDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }


}
