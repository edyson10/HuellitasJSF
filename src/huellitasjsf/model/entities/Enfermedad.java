package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the enfermedad database table.
 * 
 */
@Entity
@NamedQuery(name="Enfermedad.findAll", query="SELECT e FROM Enfermedad e")
public class Enfermedad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_enfermedad")
	private int idEnfermedad;

	@Column(name="nombre_enfermedad")
	private String nombreEnfermedad;

	//bi-directional many-to-one association to Tratamiento
	@OneToMany(mappedBy="enfermedadBean")
	private List<Tratamiento> tratamientos;

	public Enfermedad() {
	}

	public int getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(int idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public String getNombreEnfermedad() {
		return this.nombreEnfermedad;
	}

	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}

	public List<Tratamiento> getTratamientos() {
		return this.tratamientos;
	}

	public void setTratamientos(List<Tratamiento> tratamientos) {
		this.tratamientos = tratamientos;
	}

	public Tratamiento addTratamiento(Tratamiento tratamiento) {
		getTratamientos().add(tratamiento);
		tratamiento.setEnfermedadBean(this);

		return tratamiento;
	}

	public Tratamiento removeTratamiento(Tratamiento tratamiento) {
		getTratamientos().remove(tratamiento);
		tratamiento.setEnfermedadBean(null);

		return tratamiento;
	}

}