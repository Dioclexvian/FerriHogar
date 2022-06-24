package Vista;


import java.awt.*;
import javax.swing.*;

public class VentanaPanConsultar extends JFrame {

    private PanConsultar panel;
    private PanConsultarTabla panel2;
    private PanActualizarBorrar panel3;

    public VentanaPanConsultar() {
        setTitle("Consuta: FerriHogar");
        setSize(1024, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(110,93,207));
        getContentPane().setLayout(null);

        inicializarComponentesPanConsultar();
        inicializarComponentesPanActualizarBorrar();
        inicializarComponentesPanConsultarTabla();
        
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentesPanConsultar() {
        panel = new PanConsultar();
        panel.setBounds(10, 10, 380, 270);
        getContentPane().add(panel);
    }

    public PanConsultar getPanel() {
        return panel;
    }

    public void setPanel(PanConsultar panel) {
        this.panel = panel;
    }

    public void inicializarComponentesPanConsultarTabla() {
        panel2 = new PanConsultarTabla();
        panel2.setBounds(0, 290, 1020, 390);
        
        getContentPane().add(panel2);
    }


    public PanConsultarTabla getPanel2() {
        return panel2;
    }
    public void setPanel2(PanConsultarTabla panel2) {
        this.panel2 = panel2;
    }

    public void inicializarComponentesPanActualizarBorrar() {
        panel3 = new PanActualizarBorrar();
        panel3.setBounds(400, 10, 600, 270);
        getContentPane().add(panel3);
        panel3.setVisible(false);
    }

    public PanActualizarBorrar getPanel3() {
        return panel3;
    }
    public void setPanel3(PanActualizarBorrar panel3) {
        this.panel3 = panel3;
    }
}
