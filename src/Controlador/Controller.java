package Controlador;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


import Modelo.BaseDeDatos;
import Vista.Login;
import Vista.VentanaPanConsultar;
import Vista.VentanaPanCrear;
import Vista.home;

public class Controller implements ActionListener {
    private Login inicio;
    private home vistaHome;
    private VentanaPanConsultar ventanaConsulta;
    private VentanaPanCrear crearProducto;
    private BaseDeDatos bd;


    public Controller() {
        inicio = new Login();
        vistaHome = new home();
        ventanaConsulta = new VentanaPanConsultar();
        crearProducto = new VentanaPanCrear();
        asignarOyente();
    }

    public void asignarOyente() {
        inicio.geteLogin().getIngresar().addActionListener(this);

        vistaHome.getPanel().getBotonCrear().addActionListener(this);
        vistaHome.getPanel().getBotonData().addActionListener(this);

        ventanaConsulta.getPanel().getBotonBuscar().addActionListener(this);
        ventanaConsulta.getPanel().getId().addActionListener(this);
        ventanaConsulta.getPanel().getCategoria().addActionListener(this);
        ventanaConsulta.getPanel().getTodos().addActionListener(this);
        ventanaConsulta.getPanel().getBotonEliminar().addActionListener(this);
        ventanaConsulta.getPanel().getBotonRegresar().addActionListener(this);

        ventanaConsulta.getPanel3().getBotonActualizar().addActionListener(this);

        crearProducto.getPanel().getBotonCrear().addActionListener(this);
        crearProducto.getPanel().getBotonRegresar().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        bd = new BaseDeDatos();
        
        if (e.getActionCommand().equals("login")){
            String us = inicio.geteLogin().getInUsuario().getText();
            String pswd = inicio.geteLogin().getInContraseña().getText();
            if(us.equals("admin") && pswd.equals("09876")){
                inicio.setVisible(false);
                vistaHome.setVisible(true);
            }else{
                inicio.geteLogin().getInUsuario().setText("");
                inicio.geteLogin().getInContraseña().setText("");
                vistaHome.mensajeDeError("Usuario o contraseña no está registrado, por favor intente de nuevo");
            }

        }else if (e.getActionCommand().equals("CONSULTAR")){
            vistaHome.setVisible(false);
            ventanaConsulta.setVisible(true);

        }else if (e.getActionCommand().equals("todos")){
                ventanaConsulta.getPanel().getlistaCategoria().setVisible(false);
                ventanaConsulta.getPanel().gettextoIngresarId().setVisible(false);
                ventanaConsulta.getPanel().getBotonEliminar().setVisible(false);
                ventanaConsulta.getPanel3().setVisible(false);
                Object[][] datos = {
                    
                };
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);


        }else if(e.getActionCommand().equals("categoria")){
                ventanaConsulta.getPanel().getlistaCategoria().setVisible(true);
                ventanaConsulta.getPanel().gettextoIngresarId().setVisible(false);
                ventanaConsulta.getPanel().getBotonEliminar().setVisible(false);
                ventanaConsulta.getPanel3().setVisible(false);
                Object[][] datos = {
                    
                };
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);


        }else if(e.getActionCommand().equals("id")){
                ventanaConsulta.getPanel().getlistaCategoria().setVisible(false);
                ventanaConsulta.getPanel().gettextoIngresarId().setVisible(true);
                ventanaConsulta.getPanel().getBotonEliminar().setVisible(false);
                ventanaConsulta.getPanel3().setVisible(false);
                Object[][] datos = {};
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);

        }else if (e.getActionCommand().equals("Buscar") && ventanaConsulta.getPanel().getId().isSelected() ){
            ventanaConsulta.getPanel3().setVisible(true);
            ventanaConsulta.getPanel().getBotonEliminar().setVisible(true);
            ResultSet rs = null;
            Object[][] datos = new Object[1][9] ;
            String obtenerID = ventanaConsulta.getPanel().gettextoIngresarId().getText();
            bd.EstablecerConexion();
            rs = bd.ConsultaPorID(obtenerID);

            try {
                while (rs.next()){
                        datos[0] = new Object[]{rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9)};

                        ventanaConsulta.getPanel3().gettextoNewNombre().setText(rs.getString(2));
                        ventanaConsulta.getPanel3().gettextoNewCantidad().setText(rs.getString(4));
                        ventanaConsulta.getPanel3().gettextoNewValorCompra().setText(rs.getString(5));
                        ventanaConsulta.getPanel3().gettextoNewValorVenta().setText(rs.getString(6));
                        ventanaConsulta.getPanel3().gettextoNewMarca().setText(rs.getString(7));
                        ventanaConsulta.getPanel3().gettextoNewMedida().setText(rs.getString(8));
                        ventanaConsulta.getPanel3().getTextarea1().setText(rs.getString(9));
                    
                }
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);
                
            } 

            catch (Exception ex) {
                
                vistaHome.mensajeDeError("El ID que está buscando no existe");
            }
            bd.CerrarConexion();
        }else if (e.getActionCommand().equals("Buscar") && ventanaConsulta.getPanel().getTodos().isSelected() ){
            ResultSet rs = null;
            Object[][] datos = new Object[75][9] ;
            int cont = 0;

            bd.EstablecerConexion();
            rs = bd.VerTodosLosProductos();
            try {
                while (rs.next()) {
                    

                    datos[cont] = new Object[]{rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9)};

                        cont += 1;
                }
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);
            } catch (Exception ex) {
                vistaHome.mensajeDeError("No existe ningun elemento en la tabla <productos>");
            }
            bd.CerrarConexion();

        }else if (e.getActionCommand().equals("Buscar") && ventanaConsulta.getPanel().getCategoria().isSelected() ){
            ResultSet rs = null;
            Object[][] datos = new Object[14][9] ;
            int cont = 0;
            String categoria = ventanaConsulta.getPanel().getlistaCategoria().getSelectedItem().toString();
            
            bd.EstablecerConexion();
            rs = bd.ConsultaPorCategoria(categoria);
            try {
                while (rs.next()) {

                    datos[cont] = new Object[]{rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9)};

                        cont += 1;
                }
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);
            } catch (Exception ex) {
                vistaHome.mensajeDeError("No existe ningun elemento en la catergoría que seleccionó");
            }
            bd.CerrarConexion();
        }else if(e.getActionCommand().equals("Eliminar") && ventanaConsulta.getPanel().getId().isSelected() ){
            try {
                String obtenerID = ventanaConsulta.getPanel().gettextoIngresarId().getText();
                bd.EstablecerConexion();
                String respuesta = bd.EliminarProductoPorID(obtenerID);
                Object[][] datos = {};
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);

                ventanaConsulta.getPanel3().gettextoNewNombre().setText("");
                ventanaConsulta.getPanel3().gettextoNewCantidad().setText("");
                ventanaConsulta.getPanel3().gettextoNewValorCompra().setText("");
                ventanaConsulta.getPanel3().gettextoNewValorVenta().setText("");
                ventanaConsulta.getPanel3().gettextoNewMarca().setText("");
                ventanaConsulta.getPanel3().gettextoNewMedida().setText("");
                ventanaConsulta.getPanel3().getTextarea1().setText("");

                vistaHome.mensajeDeError(respuesta);
                
            }catch(Exception ex) {
                vistaHome.mensajeDeError("El ID que está buscando no existe");
            }
            bd.CerrarConexion();
        }else if (e.getActionCommand().equals("Actualizar") && ventanaConsulta.getPanel().getId().isSelected() ) {

            try{
                String obtenerID = ventanaConsulta.getPanel().gettextoIngresarId().getText();
                bd.EstablecerConexion();
                String Actualizar = bd.ActualizarProducto(obtenerID, ventanaConsulta.getPanel3().gettextoNewNombre().getText(), 
                Integer.parseInt(ventanaConsulta.getPanel3().gettextoNewCantidad().getText()), Integer.parseInt(ventanaConsulta.getPanel3().gettextoNewValorCompra().getText()), 
                Integer.parseInt(ventanaConsulta.getPanel3().gettextoNewValorVenta().getText()), ventanaConsulta.getPanel3().gettextoNewMarca().getText(), 
                ventanaConsulta.getPanel3().gettextoNewMedida().getText(), ventanaConsulta.getPanel3().getTextarea1().getText());
                
                Object[][] datos = {};
                ventanaConsulta.getPanel2().CargarInformacionTabla(datos);

                ventanaConsulta.getPanel3().gettextoNewNombre().setText("");
                ventanaConsulta.getPanel3().gettextoNewCantidad().setText("");
                ventanaConsulta.getPanel3().gettextoNewValorCompra().setText("");
                ventanaConsulta.getPanel3().gettextoNewValorVenta().setText("");
                ventanaConsulta.getPanel3().gettextoNewMarca().setText("");
                ventanaConsulta.getPanel3().gettextoNewMedida().setText("");
                ventanaConsulta.getPanel3().getTextarea1().setText("");


                vistaHome.mensajeDeError(Actualizar);


            }catch(Exception ex) {
                vistaHome.mensajeDeError("No se pudo actualizar los datos de dicho ID");
            }
        }else if (e.getActionCommand().equals("CREAR")){
            vistaHome.setVisible(false);
            crearProducto.setVisible(true);
        }else if(e.getActionCommand().equals("nuevoProducto")){
            try{
                
                bd.EstablecerConexion();
                
                String productoNuevo = bd.RegistroDeProducto(crearProducto.getPanel().getTextoNewId().getText(), crearProducto.getPanel().gettextoNewNombre().getText(), 
                crearProducto.getPanel().getListaCategoria().getSelectedItem().toString(), Integer.parseInt(crearProducto.getPanel().gettextoNewCantidad().getText()), 
                Integer.parseInt(crearProducto.getPanel().gettextoNewValorCompra().getText()), Integer.parseInt(crearProducto.getPanel().gettextoNewValorVenta().getText()), 
                crearProducto.getPanel().gettextoNewMarca().getText(), crearProducto.getPanel().gettextoNewMedida().getText(), 
                crearProducto.getPanel().getTextarea1().getText());
                
                crearProducto.getPanel().getTextoNewId().setText("");
                crearProducto.getPanel().gettextoNewNombre().setText("");
                crearProducto.getPanel().getListaCategoria().setSelectedIndex(0);
                crearProducto.getPanel().gettextoNewCantidad().setText("");
                crearProducto.getPanel().gettextoNewValorCompra().setText("");
                crearProducto.getPanel().gettextoNewValorVenta().setText("");
                crearProducto.getPanel().gettextoNewMarca().setText("");
                crearProducto.getPanel().gettextoNewMedida().setText("");
                crearProducto.getPanel().getTextarea1().setText("");



                vistaHome.mensajeDeError(productoNuevo);


            }catch(Exception ex) {
                vistaHome.mensajeDeError("No se pudo actualizar los datos de dicho ID");
            }
        }else if(e.getActionCommand().equals("Regresar")){
            vistaHome.setVisible(true);
            crearProducto.setVisible(false);
            ventanaConsulta.setVisible(false);

        }
            
            
        

        



    }

}
