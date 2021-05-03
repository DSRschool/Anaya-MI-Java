package cap16.orm.gestor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Date fecha;

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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) 
	{ 
	}
}