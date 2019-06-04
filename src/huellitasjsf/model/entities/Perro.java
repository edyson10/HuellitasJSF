package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the perro database table.
 * 
 */
@Entity
@NamedQuery(name="Perro.findAll", query="SELECT p FROM Perro p")
public class Perro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombre;

	@Column(name="costo_apadrinar")
	private int costoApadrinar;

	private int edad;

	private String estado;

	private String foto;

	//bi-directional many-to-one association to Adopcion
	@OneToMany(mappedBy="perro")
	private List<Adopcion> adopcions;

	//bi-directional many-to-one association to Apadrinar
	@OneToMany(mappedBy="perro")
	private List<Apadrinar> apadrinars;

	//bi-directional many-to-one association to Formularioadopcion
	@OneToMany(mappedBy="perro")
	private List<Formularioadopcion> formularioadopcions;

	//bi-directional many-to-one association to Formularioapadrinar
	@OneToMany(mappedBy="perro")
	private List<Formularioapadrinar> formularioapadrinars;

	//bi-directional many-to-one association to Raza
	@ManyToOne
	@JoinColumn(name="id_raza")
	private Raza raza;

	//bi-directional many-to-one association to Tratamiento
	@OneToMany(mappedBy="perro")
	private List<Tratamiento> tratamientos;

	public Perro() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCostoApadrinar() {
		return this.costoApadrinar;
	}

	public void setCostoApadrinar(int costoApadrinar) {
		this.costoApadrinar = costoApadrinar;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Adopcion> getAdopcions() {
		return this.adopcions;
	}

	public void setAdopcions(List<Adopcion> adopcions) {
		this.adopcions = adopcions;
	}

	public Adopcion addAdopcion(Adopcion adopcion) {
		getAdopcions().add(adopcion);
		adopcion.setPerro(this);

		return adopcion;
	}

	public Adopcion removeAdopcion(Adopcion adopcion) {
		getAdopcions().remove(adopcion);
		adopcion.setPerro(null);

		return adopcion;
	}

	public List<Apadrinar> getApadrinars() {
		return this.apadrinars;
	}

	public void setApadrinars(List<Apadrinar> apadrinars) {
		this.apadrinars = apadrinars;
	}

	public Apadrinar addApadrinar(Apadrinar apadrinar) {
		getApadrinars().add(apadrinar);
		apadrinar.setPerro(this);

		return apadrinar;
	}

	public Apadrinar removeApadrinar(Apadrinar apadrinar) {
		getApadrinars().remove(apadrinar);
		apadrinar.setPerro(null);

		return apadrinar;
	}

	public List<Formularioadopcion> getFormularioadopcions() {
		return this.formularioadopcions;
	}

	public void setFormularioadopcions(List<Formularioadopcion> formularioadopcions) {
		this.formularioadopcions = formularioadopcions;
	}

	public Formularioadopcion addFormularioadopcion(Formularioadopcion formularioadopcion) {
		getFormularioadopcions().add(formularioadopcion);
		formularioadopcion.setPerro(this);

		return formularioadopcion;
	}

	public Formularioadopcion removeFormularioadopcion(Formularioadopcion formularioadopcion) {
		getFormularioadopcions().remove(formularioadopcion);
		formularioadopcion.setPerro(null);

		return formularioadopcion;
	}

	public List<Formularioapadrinar> getFormularioapadrinars() {
		return this.formularioapadrinars;
	}

	public void setFormularioapadrinars(List<Formularioapadrinar> formularioapadrinars) {
		this.formularioapadrinars = formularioapadrinars;
	}

	public Formularioapadrinar addFormularioapadrinar(Formularioapadrinar formularioapadrinar) {
		getFormularioapadrinars().add(formularioapadrinar);
		formularioapadrinar.setPerro(this);

		return formularioapadrinar;
	}

	public Formularioapadrinar removeFormularioapadrinar(Formularioapadrinar formularioapadrinar) {
		getFormularioapadrinars().remove(formularioapadrinar);
		formularioapadrinar.setPerro(null);

		return formularioapadrinar;
	}

	public Raza getRaza() {
		return this.raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public List<Tratamiento> getTratamientos() {
		return this.tratamientos;
	}

	public void setTratamientos(List<Tratamiento> tratamientos) {
		this.tratamientos = tratamientos;
	}

	public Tratamiento addTratamiento(Tratamiento tratamiento) {
		getTratamientos().add(tratamiento);
		tratamiento.setPerro(this);

		return tratamiento;
	}

	public Tratamiento removeTratamiento(Tratamiento tratamiento) {
		getTratamientos().remove(tratamiento);
		tratamiento.setPerro(null);

		return tratamiento;
	}

}