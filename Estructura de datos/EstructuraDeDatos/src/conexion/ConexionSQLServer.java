package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class ConexionSQLServer {
    private Connection  con;
    private Statement enunciadoSQL;
    ResultSet rs;
    public ConexionSQLServer(String origen){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Cagando correctamente driver ...");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+origen,"root","");
            JOptionPane.showMessageDialog(null,"Conexion Exitosa!!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de Conexion!!");
        }  
    }
    public void actualizar(String enunciado){
        int n=0;
        try{
            enunciadoSQL = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
            n = enunciadoSQL.executeUpdate(enunciado);
            JOptionPane.showMessageDialog(
            null,""+n+"Registos actualizados");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al intentar actualizar");
        }
    }
    public void consultar(String enunciado){
        try{
            enunciadoSQL = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            rs = enunciadoSQL.executeQuery(enunciado);
            JOptionPane.showMessageDialog(
            null,"Consulta exitosa");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error en la consuta");
        }
    }
    public boolean irPrimero(){
        try{
            rs.first();
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"no hay registros!!");
            return false;           
        }
    }
    public boolean irSiguiente(){
        try{
            rs.next();
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ultimo registro!!");
            return false;
        }
    }
    public boolean irAnterior(){
        try{
            rs.previous();
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Primer registro");
            return false;
        }
    }
    public boolean irUltimo(){
        try{
            rs.last();
            return true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No hay registros");
            return false;
        }
    }
    public String obtenerCampo(int num){
        try{
            return rs.getString(num);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: el campo"+num+"no existe");
            return null;
        }
    }
    public String obtenerCampo(String campo){
        try{
            return rs.getString(campo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: en el campo" +campo+ "no existe");
            return null;
        }
    }
    public int getNumRegistros(){
        try{
            return rs.getRow();
        }
        catch(Exception e){
            return 0;
        }
    }
        
    public void cerrar(){
        try{
            con.close();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error al intentar cerrar BD");
        }
    }
}
