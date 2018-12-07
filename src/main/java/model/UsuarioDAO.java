package model;

import entity.Usuario;

public class UsuarioDAO {
	
	public UsuarioDAO() {
		
	}
	public UsuarioDAO() {
		
	}
	//wea-2
	public UsuarioDAO(Usuario usuario) {

		this.id = usuario.getId();
		this.nombre = usuario.getNombre();
		this.password = usuario.getPassword();
		this.email = usuario.getEmail();
		this.telefono = usuario.getTelefono();
		this.usuario = usuario.getUsuario();
		this.fechaNacimiento = usuario.getFechaNacimiento();
	}

	private int id;
	private String nombre;
	private int password;
	private String email;
	private int telefono;
	private String usuario;	
	private String fechaNacimiento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	

}
