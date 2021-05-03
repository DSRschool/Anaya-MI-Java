package cap16.orm.gestor;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "albaran")
public class Albaran {
	private static final String PREFIJO = "ALB-";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String referencia;
	private LocalDateTime fechaEmision;
	private LocalDateTime fechaRecepcion;
	
	public Albaran() {
		
	}
	
	public Albaran(String refPedido) {
		referencia = PREFIJO + refPedido;
		fechaEmision = LocalDateTime.now();
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

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDateTime getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(LocalDateTime fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	@Override
	public String toString() {
		return "Albaran [id=" + id + ", referencia=" + referencia + ", fechaEmision=" + fechaEmision
				+ ", fechaRecepcion=" + fechaRecepcion + "]";
	}
}
