package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="usuarios")
@Entity

public class Usuario {
	
	public Usuario() {
		
	}
	public Usuario(int id, String nombre, int password, String email, int telefono, String usuario,
			String fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
		this.usuario = usuario;
		this.fechaNacimiento = fechaNacimiento;
	}
	@GeneratedValue
	@Id
	@Column(name="Id")
	private int id;
	@Column(name="Nombre_Completo")
	private String nombre;
	@Column(name="Password")
	private int password;
	@Column(name="Corrreo")
	private String email;
	@Column(name="Telefono")
	private int telefono;
	@Column(name="Usuario")
	private String usuario;
	@Column(name="Fecha_Nacimiento")	
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
