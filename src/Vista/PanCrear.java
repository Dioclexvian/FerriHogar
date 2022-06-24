package Vista;



import java.awt.*;
import javax.swing.*;

public class PanCrear extends JPanel {
   private JButton botonCrear;
   private JButton botonRegresar;
   private JLabel titulo;
   private JLabel titulo2;
   private JLabel texto1;
   private JLabel textoId;
   private JTextField textoNewId;
   
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
   private JComboBox<String> listaCategoria;
   private JLabel textoCategoria;
   ImageIcon im;

   public PanCrear () {
      setLayout(null);
      inicializarComponentesPanCrear ();
      setVisible(true);
   }

   public void inicializarComponentesPanCrear () {

      titulo = new JLabel("CREAR NUEVO");
      titulo.setFont(new Font("Arial", Font.BOLD, 35));
      titulo.setForeground(new Color(234, 235, 237));
      titulo.setBounds(140, 30, 670, 80);
      add(titulo);

      titulo2 = new JLabel("PRODUCTO");
      titulo2.setFont(new Font("Arial", Font.BOLD, 47));
      titulo2.setForeground(new Color(194, 125, 252));
      titulo2.setBounds(140, 70, 670, 80);
      add(titulo2);

      texto1 = new JLabel("Ingrese los datos del nuevo producto");
      texto1.setFont(new Font("Arial", Font.BOLD, 17));
      texto1.setForeground(Color.WHITE);
      texto1.setBounds(140, 110, 670, 80);
      add(texto1);

      textoId = new JLabel("ID: ");
      textoId.setForeground(Color.WHITE);;
      textoId.setFont(new Font("Arial", Font.ITALIC, 18));
      textoId.setBounds(140, 180, 180, 25);
      add( textoId);

      textoNewId = new JTextField();
      textoNewId.setFont(new Font("Arial", Font.BOLD, 18));
      textoNewId.setBounds(170, 180, 70, 25);
      add(textoNewId);

      textoNombre = new JLabel("Nombre: ");
      textoNombre.setForeground(Color.WHITE);;
      textoNombre.setFont(new Font("Arial", Font.ITALIC, 18));
      textoNombre.setBounds(300, 180, 210, 25);
      add(textoNombre);

      textoNewNombre = new JTextField();
      textoNewNombre .setFont(new Font("Arial", Font.BOLD, 18));
      textoNewNombre.setBounds(380, 180, 470, 25);
      add(textoNewNombre);

      textoCategoria = new JLabel("Categoria: ");
      textoCategoria.setForeground(Color.WHITE);;
      textoCategoria.setFont(new Font("Arial", Font.ITALIC, 18));
      textoCategoria.setBounds(140, 230, 180, 25);

      listaCategoria= new JComboBox<String>();
      listaCategoria.setBounds(235, 230, 230, 25);
      listaCategoria .setFont(new Font("Arial", Font.BOLD, 18));
      listaCategoria.setActionCommand("listaCategoria");
      listaCategoria.addItem("Arena");
      listaCategoria.addItem("Bisagras");
      listaCategoria.addItem("Cables");
      listaCategoria.addItem("Candados");
      listaCategoria.addItem("Cintas");
      listaCategoria.addItem("Clavos");
      listaCategoria.addItem("Destornilladores");
      listaCategoria.addItem("Herramientas");
      listaCategoria.addItem("Ladrillo");
      listaCategoria.addItem("Lijas");
      listaCategoria.addItem("PVC");
      listaCategoria.addItem("Tornillos"); 
      add(listaCategoria);

      textoCantidad = new JLabel("Cantidad: ");
      textoCantidad.setForeground(Color.WHITE);
      textoCantidad.setFont(new Font("Arial", Font.ITALIC, 18));
      textoCantidad.setBounds(530, 230, 180, 25);
      add(textoCantidad);

      textoNewCantidad = new JTextField();
      textoNewCantidad.setBounds(620, 230, 230, 25);
      textoNewCantidad.setFont(new Font("Arial", Font.BOLD, 18));
      add(textoNewCantidad);

      textoValorCompra = new JLabel("Valor Compra: ");
      textoValorCompra.setForeground(Color.WHITE);
      textoValorCompra.setBounds(140,280, 180, 25);
      textoValorCompra.setFont(new Font("Arial", Font.ITALIC, 18));
      add(textoValorCompra);

      textoNewValorCompra = new JTextField();
      textoNewValorCompra.setBounds(270, 280, 195, 25);
      textoNewValorCompra.setFont(new Font("Arial", Font.BOLD, 18));
      add(textoNewValorCompra);

      textoValorVenta = new JLabel("Valor Venta: ");
      textoValorVenta.setForeground(Color.WHITE);
      textoValorVenta.setBounds(505, 280, 200, 25);
      textoValorVenta.setFont(new Font("Arial", Font.ITALIC, 18));
      add(textoValorVenta);

      textoNewValorVenta = new JTextField();
      textoNewValorVenta.setBounds(620, 280, 230, 25);
      textoNewValorVenta.setFont(new Font("Arial", Font.BOLD, 18));
      add(textoNewValorVenta);

      textoMarca = new JLabel("Marca: ");
      textoMarca.setForeground(new Color(234, 235, 237));
      textoMarca.setBounds(140, 330, 360, 25);
      textoMarca.setFont(new Font("Arial", Font.ITALIC, 18));
      add(textoMarca);

      textoNewMarca = new JTextField();
      textoNewMarca.setBounds(210, 330, 255, 25);
      textoNewMarca.setFont(new Font("Arial", Font.BOLD, 18));
      add(textoNewMarca);

      textoMedida = new JLabel("Medida: ");
      textoMedida.setForeground(new Color(234, 235, 237));
      textoMedida.setBounds(540,330, 200, 25);
      textoMedida.setFont(new Font("Arial", Font.ITALIC, 18));
      add(textoMedida);

      textoNewMedida = new JTextField();
      textoNewMedida.setBounds(620,330,230, 25);
      textoNewMedida.setFont(new Font("Arial", Font.BOLD, 18));
      add(textoNewMedida);

      textoDescripcion = new JLabel("Descripcion: ");
      textoDescripcion.setForeground(new Color(234, 235, 237));
      textoDescripcion.setBounds(140, 380, 180, 20);
      textoDescripcion.setFont(new Font("Arial", Font.ITALIC, 18));
      add(textoDescripcion);

      textarea1=new JTextArea();     
      textarea1.setFont(new Font("Arial", Font.BOLD, 18));
      scrollpane1=new JScrollPane(textarea1);    
      scrollpane1.setBounds(140,410,710,100);
      add(scrollpane1);

      botonCrear= new JButton("CREAR");
      botonCrear.setFont(new Font("Arial", Font.BOLD, 30));
      botonCrear.setBounds(400,550, 170, 50);
      botonCrear.setBackground(new Color(194, 125, 252));
      botonCrear.setForeground(new Color(36,59,103));
      botonCrear.setActionCommand("nuevoProducto");
      add(botonCrear);

      botonRegresar= new JButton("REGRESAR");
      botonRegresar.setFont(new Font("Arial", Font.BOLD, 20));
      botonRegresar.setBounds(700, 55, 150, 30);
      botonRegresar.setBackground(new Color(194, 125, 252));
      botonRegresar.setForeground(new Color(36,59,103));
      botonRegresar.setActionCommand("Regresar");
      add(botonRegresar);
   }

   public void paint(Graphics g) {
      Dimension tam = getSize();
      im = new ImageIcon(getClass().getResource("/Assets/fondo.jpg"));
      g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
      setOpaque(false);
      super.paint(g);
   }

public JButton getBotonCrear() {
      return botonCrear;
   }
public void setBotonCrear(JButton botonCrear) {
      this.botonCrear = botonCrear;
   }

public JButton getBotonRegresar() {
      return botonRegresar;
   }
public void setBotonRegresar(JButton botonRegresar) {
      this.botonRegresar = botonRegresar;
   }

public JTextField getTextoNewId() {
      return textoNewId;
   }
public void setTextoNewId(JTextField textoNewId) {
      this.textoNewId = textoNewId;
   }

public JTextField gettextoNewNombre() {
      return textoNewNombre;
   }
public void settextoNewNombre(JTextField textoNewNombre){
      this.textoNewNombre = textoNewNombre;
   }

public JComboBox<String> getListaCategoria() {
   return listaCategoria;
}
public void setListaCategoria(JComboBox<String> listaCategoria) {
   this.listaCategoria = listaCategoria;
}

public JTextField gettextoNewCantidad() {
      return textoNewCantidad;
   }
public void settextoNewCantidad(JTextField textoNewCantidad) {
      this.textoNewCantidad = textoNewCantidad;
   }

public JTextField gettextoNewValorCompra(){
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