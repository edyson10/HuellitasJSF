package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the apadrinar database table.
 * 
 */
@Entity
@NamedQuery(name="Apadrinar.findAll", query="SELECT a FROM Apadrinar a")
public class Apadrinar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_padrino")
	private int idPadrino;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	//bi-directional many-to-one association to Perro
	@ManyToOne
	@JoinColumn(name="nombre")
	private Perro perro;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="cedula")
	private Persona persona;

	public Apadrinar() {
	}

	public int getIdPadrino() {
		return this.idPadrino;
	}

	public void setIdPadrino(int idPadrino) {
		this.idPadrino = idPadrino;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Perro getPerro() {
		return this.perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}