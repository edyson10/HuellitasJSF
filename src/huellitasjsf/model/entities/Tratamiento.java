package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tratamiento database table.
 * 
 */
@Entity
@NamedQuery(name="Tratamiento.findAll", query="SELECT t FROM Tratamiento t")
public class Tratamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tratamiento")
	private int idTratamiento;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	//bi-directional many-to-one association to Enfermedad
	@ManyToOne
	@JoinColumn(name="enfermedad")
	private Enfermedad enfermedadBean;

	//bi-directional many-to-one association to Perro
	@ManyToOne
	@JoinColumn(name="nombre")
	private Perro perro;

	public Tratamiento() {
	}

	public int getIdTratamiento() {
		return this.idTratamiento;
	}

	public void setIdTratamiento(int idTratamiento) {
		this.idTratamiento = idTratamiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Enfermedad getEnfermedadBean() {
		return this.enfermedadBean;
	}

	public void setEnfermedadBean(Enfermedad enfermedadBean) {
		this.enfermedadBean = enfermedadBean;
	}

	public Perro getPerro() {
		return this.perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

}