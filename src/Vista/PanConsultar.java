package Vista;



import java.awt.*;
import javax.swing.*;




public class PanConsultar extends JPanel {

    private JButton botonBuscar;
    private JButton botonEliminar;
    private JButton botonRegresar;
    

    private JLabel texto1;
    private JLabel piePg;
    private JLabel titulo;
    private JComboBox<String> listaCategoria;
    private JRadioButton id;
    private JRadioButton categoria;
    private JRadioButton todos;
    private ButtonGroup bg;
    private JTextField textoIngresarId;
    
    ImageIcon im;
    
    public PanConsultar() {
        setLayout(null);
        inicializarComponentesPanConsultar();
        setVisible(true);
    }

    public void inicializarComponentesPanConsultar() {
        
        titulo = new JLabel("CONSULTA");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(new Color(234, 235, 237));
        titulo.setBounds(50, 20, 670, 80);
        add(titulo);
        
        texto1 = new JLabel("");
        texto1.setFont(new Font("Arial", Font.BOLD, 15));
        texto1.setForeground(Color.WHITE);
        texto1.setBounds(50, 50, 670, 80);
        String t = "<html><body>Selecione un metodo de busqueda:";
        texto1.setText(t);
        add(texto1);
        
        setLayout(null);

            ButtonGroup bg=new ButtonGroup();
            id=new JRadioButton("     ID     ");
            id.setBounds(50,110,80,20);
            id.setForeground(new Color(234, 235, 237));
            id.setBackground(new Color(36, 59, 87));
            id.setActionCommand("id");
            add(id);
            bg.add(id);

            categoria=new JRadioButton("Categoría");
            categoria.setBounds(150,110,80,20);
            categoria.setForeground(new Color(234, 235, 237));
            categoria.setBackground(new Color(36, 59, 87));
            categoria.setActionCommand("categoria");
            add(categoria);
            bg.add(categoria);

            todos=new JRadioButton("  Todos");
            todos.setBounds(250,110,80,20);
            todos.setForeground(new Color(234, 235, 237));
            todos.setBackground(new Color(36, 59, 87));
            todos.setActionCommand("todos");
            add(todos);
            bg.add(todos);

        textoIngresarId = new JTextField();
        textoIngresarId.setBounds(50, 150, 80, 20);
        textoIngresarId.setVisible(false);
        add(textoIngresarId);

        listaCategoria= new JComboBox<String>();
        listaCategoria.setBounds(150, 150, 130, 20);
        listaCategoria.setActionCommand("listaCategoria");
        // listaCategoria.insertItemAt("Seleccione una catergoría",0);
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
        listaCategoria.setVisible(false);
        add(listaCategoria);

        botonBuscar= new JButton("Buscar");
        botonBuscar.setFont(new Font("Arial", Font.BOLD, 20));
        botonBuscar.setBounds(220, 190, 110, 30);
        botonBuscar.setBackground(new Color(194, 125, 252));
        botonBuscar.setForeground(new Color(36,59,103));
        botonBuscar.setActionCommand("Buscar");
        botonBuscar.setVisible(true);
        add(botonBuscar);

        botonEliminar = new JButton("Eliminar");
        botonEliminar.setFont(new Font("Arial", Font.BOLD, 20));
        botonEliminar.setBounds(50, 190, 110, 30);
        botonEliminar.setBackground(new Color(194, 125, 252));
        botonEliminar.setForeground(new Color(36,59,103));
        botonEliminar.setActionCommand("Eliminar");
        botonEliminar.setVisible(false);
        add(botonEliminar);

        botonRegresar= new JButton("REGRESAR");
        botonRegresar.setFont(new Font("Arial", Font.BOLD, 13));
        botonRegresar.setBounds(5, 5, 140, 30);
        botonRegresar.setBackground(new Color(194, 125, 252));
        botonRegresar.setForeground(new Color(36,59,103));
        botonRegresar.setActionCommand("Regresar");
        add(botonRegresar);

        piePg = new JLabel("Para Actualizar o Eliminar un producto consulte su ID");
        piePg.setFont(new Font("Arial", Font.ITALIC, 11));
        piePg.setForeground(Color.WHITE);
        piePg.setBounds(50, 200, 670, 80);
        add(piePg);
    }
    
    public void paint(Graphics g) {
        Dimension tam = getSize();
        im = new ImageIcon(getClass().getResource("/Assets/fondo.grande.logo.jpg"));
        g.drawImage(im.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paint(g);
    }
    
    
    public JButton getBotonBuscar() {
        return botonBuscar;
    }
    public void setBotonBuscar(JButton botonBuscar) {
        this.botonBuscar = botonBuscar;
    }

        public JComboBox<String> getlistaCategoria() {
        return  listaCategoria;
    }

    public void setlistaCategoria(JComboBox<String> listaCategoria) {
        this. listaCategoria =  listaCategoria;
    }
    
    public JTextField gettextoIngresarId() {
        return textoIngresarId;
    }
    public void settextoIngresarId(JTextField textoIngresarId) {
        this.textoIngresarId = textoIngresarId;
    }

    public JRadioButton getId() {
        return id;
    }

    public void setId(JRadioButton id) {
        this.id = id;
    }
    
    public JRadioButton getCategoria() {
        return categoria;
    }

    public void setCategoria(JRadioButton categoria) {
        this.categoria = categoria;
    }

    public JRadioButton getTodos() {
        return todos;
    }

    public void setTodos(JRadioButton todos) {
        this.todos = todos;
    }

    public JButton getBotonEliminar() {
        return botonEliminar;
    }

    public void setBotonEliminar(JButton botonEliminar) {
        this.botonEliminar = botonEliminar;
    }

    public JButton getBotonRegresar() {
        return botonRegresar;
    }

    public void setBotonRegresar(JButton botonRegresar) {
        this.botonRegresar = botonRegresar;
    }

}
