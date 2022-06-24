package Modelo;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos {
    private Connection conexion;
    private Properties propiedades;

    public BaseDeDatos(){
        propiedades = new Properties();
        conexion = null;
        try{
            propiedades.load(new FileReader("data/config.properties"));
        }catch (FileNotFoundException ex){
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EstablecerConexion(){

        String db = propiedades.getProperty("database");
        String ipLocal = propiedades.getProperty("IPLocal");
        String user = propiedades.getProperty("usuario");
        String pass = propiedades.getProperty("pass");
        String url = "jdbc:mysql://" + ipLocal + ":3306/" + db + "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("NO SE ESTABLECIO CONEXION CON LA BASE DE DATOS");
            e.printStackTrace();
        }
    }

    public void CerrarConexion() {
        try{
            conexion.close();
        }catch(SQLException e){
            System.out.println("Problema al cerrar la conexion con la base de datos");
        }
    }

    //(Listar) consultas van aqui: 

    public ResultSet VerTodosLosProductos() {
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT * FROM Productos";
        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
        }catch (SQLException e){
            System.out.println("problema con la recolección de datos");
        }
        return rs;
    }

    public ResultSet ConsultaPorID(String id) {
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT * FROM Productos WHERE Codigo = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
        }catch (SQLException e){
            System.out.println("problema con la recolección de datos, verifique ID");
        }
        return rs;
    }

    public ResultSet ConsultaPorCategoria(String categoria){
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT * FROM Productos WHERE Categoria = ?";
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, categoria);
            rs = ps.executeQuery();
        }catch (SQLException e){
            System.out.println("problema con la recolección de datos, verifique Categoria");
        }
        return rs;
    }


    //(Guardar) Registro de producto aqui:
    public String RegistroDeProducto(String id, String nombre, String catergoria, int cantidad, int valorCompra, int valorVenta, String marca, String medida, String descripcion){
        PreparedStatement ps;
        String sql = "INSERT INTO Productos VALUES(?,?,?,?,?,?,?,?,?)";
        try{
            ps = conexion.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2, nombre);
            ps.setString(3, catergoria);
            ps.setInt(4,cantidad);
            ps.setInt(5,valorCompra);
            ps.setInt(6,valorVenta);
            ps.setString(7, marca);
            ps.setString(8, medida);
            ps.setString(9, descripcion);

            int contador = ps.executeUpdate();
            if (contador > 0){
                return "Se agregró exitosamente el producto";
            }else{
                return "Ocurrió un error al agregar el prodcuto";
            }

        }catch(SQLException e){
            return "Problema al insertar la información";
        }
    }


    //(Eliminar) Elimnar producto por ID aqui:
    public String EliminarProductoPorID(String id){
        PreparedStatement ps;
        String sql = "DELETE FROM Productos WHERE Codigo = ? "; 
        try{
            ps = conexion.prepareStatement(sql);
            ps.setString(1, id);
            int contador = ps.executeUpdate();
            if (contador > 0) {
                return "Se eliminó el producto de manera exitosa";
            } else {
                return "Ocurrio un problema al eliminar el producto";
            }
        }catch(SQLException e){
            return "problema con el ID, por favor verifique el producto que consultó existe";
        }
    }


    //(actualizar) actualizar producto por ID aqui:
    public String ActualizarProducto(String id, String nombre, int cantidad, int valorCompra, int valorVenta, String marca, String medida, String descripcion){
        PreparedStatement ps;
        String sql = "UPDATE Productos SET Nombre = ?, Cantidad = ?, ValorCompra = ?, ValorVenta = ?, Marca = ?, Medida = ?, Descripcion = ? WHERE Codigo = ?";
        try{
            ps = conexion.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ps.setInt(2,cantidad);
            ps.setInt(3,valorCompra);
            ps.setInt(4,valorVenta);
            ps.setString(5, marca);
            ps.setString(6, medida);
            ps.setString(7, descripcion);
            ps.setString(8,id);

            int contador = ps.executeUpdate();
            if (contador > 0){
                return "Se actualizó exitosamente el producto";
            }else{
                return "Ocurrió un error al actualizar el prodcuto";
            }

        }catch(SQLException e){
            return "Problema al insertar la información, verifique los datos de ingreso";
        }
    }
}
