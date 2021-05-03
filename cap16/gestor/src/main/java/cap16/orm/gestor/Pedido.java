package cap16.orm.gestor;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "referencia")
	private String referencia;
	@Column(name = "fecha")
	private LocalDateTime fecha;

	@OneToMany(mappedBy = "pedido")
	private List<Albaran> albaranes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Factura factura;

	public Pedido() {
	}

	public Pedido(String referencia, LocalDateTime fecha) {
		this.referencia = referencia;
		this.fecha = fecha;
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

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) 
	{ 
	}

	public List<Albaran> getAlbaranes() {
		return albaranes;
	}

	public void setAlbaranes(List<Albaran> albaranes) {
		this.albaranes = albaranes;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", referencia=" + referencia + ", fecha=" + fecha + "]";
	}
}