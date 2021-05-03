package cap18.otrareunionmas.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name = "sala")
public class Sala {
	@Id
	@Column(length = 20)
	private String id;

	private String descripcion;

	private int capacidad;

	@OneToMany(mappedBy = "sala")
	private List<Reunion> reuniones;

	public Sala() {
	}

	public Sala(String id, String descripcion, int capacidad) {
		this.id = id;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Reunion> getReuniones() {
		return reuniones;
	}

	public void setReuniones(List<Reunion> reuniones) {
		this.reuniones = reuniones;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", descripcion=" + descripcion + ", capacidad=" + capacidad + "]";
	}
}
