package Vista;



import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PanConsultarTabla extends JPanel {

    private String[] nombresColumnas = {"ID", "Producto", "Categoria", "Cantidad", "Valor de compra", "Valor de venta", "Marca", "Medida", "Descripción"};
    private Object[][] data;
    private DefaultTableModel tablaDeDatos;
    private JTable tablaCargada;
    private JScrollPane scrollTabla;
    
    ImageIcon im;
                
    public PanConsultarTabla() {
        setLayout(null);
        inicializarComponentesPanConsultarTabla();
        setVisible(true);
        
    }

    public void inicializarComponentesPanConsultarTabla() {
        tablaCargada = new JTable();
        tablaDeDatos = (DefaultTableModel) tablaCargada.getModel();
        CargarInformacionTabla(data);
        scrollTabla = new JScrollPane(tablaCargada);
        scrollTabla.setBounds(0, 0, 1024, 390);
        add(scrollTabla);
    }
    
    public void CargarInformacionTabla(Object [][] datos){
        
        tablaDeDatos.setDataVector(datos, nombresColumnas);
    }
    
    public void paint(Graphics g) {
        Dimension tam = getSize();
        im = new ImageIcon(getClass().getResource("/Assets/fondo.jpg"));
        g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paint(g);
    }

    public DefaultTableModel getTablaDeDatos() {
        return tablaDeDatos;
    }

    public void setTablaDeDatos(DefaultTableModel tablaDeDatos) {
        this.tablaDeDatos = tablaDeDatos;
    }


}
