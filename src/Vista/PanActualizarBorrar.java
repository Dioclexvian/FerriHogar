package Vista;



import java.awt.*;
import javax.swing.*;

public class PanActualizarBorrar extends JPanel {
    private JButton botonActualizar;
    private JLabel titulo;
    private JLabel texto1;
    private JLabel textoNombre;
    private JTextField textoNewNombre;
    private JLabel textoCantidad;
    private JTextField textoNewCantidad;
    private JLabel textoValorCompra;
    private JTextField textoNewValorCompra;
    private JLabel textoValorVenta;
    private JTextField textoNewValorVenta;
    private JLabel textoMarca;
    private JTextField textoNewMarca;
    private JLabel textoMedida;
    private JTextField textoNewMedida;
    private JLabel textoDescripcion;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;

    
    ImageIcon im;
    

    public PanActualizarBorrar() {
        setLayout(null);
        inicializarComponentesPanActualizarBorrar();
        setVisible(true);
    }

    public void inicializarComponentesPanActualizarBorrar() {
        
        titulo = new JLabel("ACTUALIZAR:");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(new Color(234, 235, 237));
        titulo.setBounds(50, 20, 670, 80);
        add(titulo);

        texto1 = new JLabel("Ingrese los nuevos datos del producto");
        texto1.setFont(new Font("Arial", Font.BOLD, 15));
        texto1.setForeground(Color.WHITE);
        texto1.setBounds(260, 25, 670, 80);
        add(texto1);
        
        textoNombre = new JLabel("Nombre: ");
        textoNombre.setForeground(Color.WHITE);;
        textoNombre.setBounds(50, 90, 180, 20);
        add(textoNombre);
        
        textoNewNombre = new JTextField();
        textoNewNombre.setBounds(110, 90, 170, 20);
        add(textoNewNombre);
        
        textoCantidad = new JLabel("Cantidad: ");
        textoCantidad.setForeground(Color.WHITE);
        textoCantidad.setBounds(330, 90, 180, 20);
        add(textoCantidad);

        textoNewCantidad = new JTextField();
        textoNewCantidad.setBounds(390, 90, 170, 20);
        add(textoNewCantidad);

        
        
        textoValorCompra = new JLabel("Valor Compra: ");
        textoValorCompra.setForeground(Color.WHITE);
        textoValorCompra.setBounds(50,120, 180, 20);
        add(textoValorCompra);
        
        textoNewValorCompra = new JTextField();
        textoNewValorCompra.setBounds(140, 120, 140, 20);
        add(textoNewValorCompra);

        textoValorVenta = new JLabel("Valor Venta: ");
        textoValorVenta.setForeground(Color.WHITE);
        textoValorVenta.setBounds(330, 120, 180, 20);
        add(textoValorVenta);

        textoNewValorVenta = new JTextField();
        textoNewValorVenta.setBounds(410, 120, 150, 20);
        add(textoNewValorVenta);
        
        
        
        textoMarca = new JLabel("Marca: ");
        textoMarca.setForeground(new Color(234, 235, 237));
        textoMarca.setBounds(50, 150, 180, 20);
        add(textoMarca);

        textoNewMarca = new JTextField();
        textoNewMarca.setBounds(110, 150, 170, 20);
        add(textoNewMarca);

        textoMedida = new JLabel("Medida: ");
        textoMedida.setForeground(new Color(234, 235, 237));
        textoMedida.setBounds(330, 150, 180, 20);
        add(textoMedida);

        textoNewMedida = new JTextField();
        textoNewMedida.setBounds(390, 150, 170, 20);
        add(textoNewMedida);


        
        textoDescripcion = new JLabel("Descripcion: ");
        textoDescripcion.setForeground(new Color(234, 235, 237));
        textoDescripcion.setBounds(50, 180, 180, 20);
        add(textoDescripcion);

        textarea1=new JTextArea();        
        scrollpane1=new JScrollPane(textarea1);    
        scrollpane1.setBounds(140,185,220,55);
        add(scrollpane1);

        
        
        botonActualizar= new JButton("Actualizar");
        botonActualizar.setFont(new Font("Arial", Font.BOLD, 20));
        botonActualizar.setBounds(410, 210, 150, 30);
        botonActualizar.setBackground(new Color(194, 125, 252));
        botonActualizar.setForeground(new Color(36,59,103));
        botonActualizar.setActionCommand("Actualizar");
        add(botonActualizar);
    }
    
    
    public void paint(Graphics g) {
        Dimension tam = getSize();
        im = new ImageIcon(getClass().getResource("/Assets/fondo.marca.awa.jpg"));
        g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paint(g);
    }
    
    public JButton getBotonActualizar() {
        return botonActualizar;
    }
    public void setBotonActualizar(JButton botonActualizar) {
        this.botonActualizar = botonActualizar;
    }

    
    public JTextField gettextoNewNombre() {
        return textoNewNombre;
    }
    public void settextoNewNombre(JTextField textoNewNombre){
        this.textoNewNombre = textoNewNombre;
    }

    public JTextField gettextoNewCantidad() {
        return textoNewCantidad;
    }
    public void settextoNewCantidad(JTextField textoNewCantidad) {
        this.textoNewCantidad = textoNewCantidad;
    }

    public JTextField gettextoNewValorCompra() {
        return textoNewValorCompra;
    }
    public void settextoNewValorCompra(JTextField textoNewValorCompra) {
        this.textoNewValorCompra = textoNewValorCompra;
    }

    public JTextField gettextoNewValorVenta() {
        return textoNewValorVenta;
    }
    public void settextoNewValorVenta(JTextField textoNewValorVenta) {
        this.textoNewValorVenta = textoNewValorVenta;
    }

    public JTextField gettextoNewMarca() {
        return textoNewMarca;
    }
    public void settextoNewMarca(JTextField textoNewMarca) {
        this.textoNewMarca = textoNewMarca;
    }

    public JTextField gettextoNewMedida() {
        return textoNewMedida;
    }
    public void settextoNewMedida(JTextField textoNewMedida) {
        this.textoNewMedida = textoNewMedida;
    } 

    public JTextArea getTextarea1() {
        return textarea1;
    }

    public void setTextarea1(JTextArea textarea1) {
        this.textarea1 = textarea1;
    }


}