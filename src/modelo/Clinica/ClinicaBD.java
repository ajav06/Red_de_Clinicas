package modelo.Clinica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.ConexionBD;

public class ClinicaBD extends ConexionBD
{
	private ResultSet resultSet;
	
	public ClinicaBD()
	{
		super();
	}
	
	public void registrarClinica(Clinica clinica) 
	{
		this.crearRegistro("clinica", "codigo,nombre,estado,direccion,telefono,email", "'"+clinica.getCodigo()
				+"','"+clinica.getNombre()+"','"+clinica.getEstado()+"','"+clinica.getDireccion()+"','"+clinica.getTelefono()+","+clinica.getCorreo());
	}
	
	public List<Clinica> consultarClinicas() throws SQLException {
		List<Clinica> Clinicas = new ArrayList<Clinica>();
		resultSet = this.consultarTabla("clinica", " WHERE estatus='a' ");
		try {
			while (resultSet.next()) {
				String codigo = resultSet.getString("codigo");
				String nombre = resultSet.getString("nombre");
				String estado = resultSet.getString("estado");
				String direccion = resultSet.getString("direccion");
				String telefono = resultSet.getString("telefono");
				String correo = resultSet.getString("e-mail");
				Clinica Clinica = new Clinica(codigo,nombre,estado,direccion,telefono,correo);
				Clinicas.add(Clinica);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.cerrarComando();
		return Clinicas;
	}
	
	public void actualizarClinica(Clinica clinica) {
		this.actuRegistro("clinica", "nombre='"+clinica.getNombre()+"',estado='"+clinica.getEstado()+"',direccion='"+
				clinica.getDireccion()+"',telefono='"+clinica.getTelefono()+"',e-mail="+clinica.getCorreo(),"codigo", "'"+clinica.getCodigo()+"'");
	}
	
	public Clinica buscarClinica(String cod) throws SQLException 
	{
		Clinica clinica = null;
		resultSet = this.buscarRegistro("clinica", "codigo", "'"+cod+"'");
		
		try {
			while (resultSet.next()) {
				String codigo = resultSet.getString("codigo");
				String nombre = resultSet.getString("nombres");
				String estado = resultSet.getString("estado");
				String direccion = resultSet.getString("direccion");
				String telefono = resultSet.getString("telefono");
				String correo = resultSet.getString("email");
				clinica = new Clinica(codigo,nombre, estado,direccion,telefono,correo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.cerrarComando();
		return clinica;
	}
	public void eliminarClinica(String cod) {
		this.elimLogica("clinica", "codigo",  "'"+cod+"'");
	}
	
	public List<Clinica> consultarFiltrarClinicas(String filtro) throws SQLException {
		List<Clinica> clinicas = new ArrayList<Clinica>();
		resultSet = this.consultarTabla("clinica", " WHERE "+filtro);
		try {
			while (resultSet.next()) {
				String codigo = resultSet.getString("codido");
				String nombre = resultSet.getString("nombre");
				String estado = resultSet.getString("estado");
				String direccion = resultSet.getString("direccion");
				String telefono = resultSet.getString("telefono");
				String correo = resultSet.getString("email");
				Clinica clinica = new Clinica(codigo,nombre,estado,direccion,telefono,correo);
				clinicas.add(clinica);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.cerrarComando();
		return clinicas;
	}

	public List<String> nombresClinicas() throws SQLException{
		List<String> nombres = new ArrayList<String>();
		resultSet = this.ejecutarQuery("SELECT nombre FROM clinica WHERE estatus = 'A' ORDER BY codigo DESC");
		try {
			while (resultSet.next())
				nombres.add(resultSet.getString(0));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.cerrarComando();
		return nombres;
	}
}

