package cap16.orm.gestor;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String referencia;

	private String descripcion;
	
	@ManyToMany
	private Set<Pedido> pedidos;
	
	public Producto() {
	}
	
	public Producto(String referencia, String descripcion) {
		this.referencia = referencia;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", referencia=" + referencia + ", descripcion=" + descripcion + "]";
	}
}
