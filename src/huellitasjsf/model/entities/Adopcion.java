package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the adopcion database table.
 * 
 */
@Entity
@NamedQuery(name="Adopcion.findAll", query="SELECT a FROM Adopcion a")
public class Adopcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_adopcion")
	private int idAdopcion;

	@Temporal(TemporalType.DATE)
	private Date fechaFinAdop;

	@Temporal(TemporalType.DATE)
	private Date fechaInicioAdop;

	//bi-directional many-to-one association to Perro
	@ManyToOne
	@JoinColumn(name="nombre")
	private Perro perro;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="cedula")
	private Persona persona;

	public Adopcion() {
	}

	public int getIdAdopcion() {
		return this.idAdopcion;
	}

	public void setIdAdopcion(int idAdopcion) {
		this.idAdopcion = idAdopcion;
	}

	public Date getFechaFinAdop() {
		return this.fechaFinAdop;
	}

	public void setFechaFinAdop(Date fechaFinAdop) {
		this.fechaFinAdop = fechaFinAdop;
	}

	public Date getFechaInicioAdop() {
		return this.fechaInicioAdop;
	}

	public void setFechaInicioAdop(Date fechaInicioAdop) {
		this.fechaInicioAdop = fechaInicioAdop;
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