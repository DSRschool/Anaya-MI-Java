package cap18.otrareunionmas.dominio;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String numeroEmpleado;

	private String nombre;
	private String apellidos;

	@ManyToMany
	private Set<Reunion> reuniones;

	public Persona() {
		reuniones = new HashSet();
	}

	public Persona(String numeroEmpleado, String nombre, String apellidos) {
		this();
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Set<Reunion> getReuniones() {
		return reuniones;
	}

	public void addReunion(Reunion reunion) {
		reuniones.add(reunion);
		if (!reunion.getParticipantes().contains(this)) {
			reunion.addParticipante(this);
		}
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", numeroEmpleado=" + numeroEmpleado + ", nombre=" + nombre + ", apellidos="
				+ apellidos + "]";
	}
}
