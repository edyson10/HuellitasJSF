package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cedula;

	private String apellido;

	private String barrio;

	private String celular;

	private String direccion;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	private String nombre;

	private String profesion;

	private String telefono;

	private String trabajo;

	//bi-directional many-to-one association to Adopcion
	@OneToMany(mappedBy="persona")
	private List<Adopcion> adopcions;

	//bi-directional many-to-one association to Apadrinar
	@OneToMany(mappedBy="persona")
	private List<Apadrinar> apadrinars;

	//bi-directional many-to-one association to Formularioadopcion
	@OneToMany(mappedBy="persona")
	private List<Formularioadopcion> formularioadopcions;

	//bi-directional many-to-one association to Formularioapadrinar
	@OneToMany(mappedBy="persona")
	private List<Formularioapadrinar> formularioapadrinars;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="id_ciudad")
	private Ciudad ciudad;

	public Persona() {
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getBarrio() {
		return this.barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesion() {
		return this.profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTrabajo() {
		return this.trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public List<Adopcion> getAdopcions() {
		return this.adopcions;
	}

	public void setAdopcions(List<Adopcion> adopcions) {
		this.adopcions = adopcions;
	}

	public Adopcion addAdopcion(Adopcion adopcion) {
		getAdopcions().add(adopcion);
		adopcion.setPersona(this);

		return adopcion;
	}

	public Adopcion removeAdopcion(Adopcion adopcion) {
		getAdopcions().remove(adopcion);
		adopcion.setPersona(null);

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
		apadrinar.setPersona(this);

		return apadrinar;
	}

	public Apadrinar removeApadrinar(Apadrinar apadrinar) {
		getApadrinars().remove(apadrinar);
		apadrinar.setPersona(null);

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
		formularioadopcion.setPersona(this);

		return formularioadopcion;
	}

	public Formularioadopcion removeFormularioadopcion(Formularioadopcion formularioadopcion) {
		getFormularioadopcions().remove(formularioadopcion);
		formularioadopcion.setPersona(null);

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
		formularioapadrinar.setPersona(this);

		return formularioapadrinar;
	}

	public Formularioapadrinar removeFormularioapadrinar(Formularioapadrinar formularioapadrinar) {
		getFormularioapadrinars().remove(formularioapadrinar);
		formularioapadrinar.setPersona(null);

		return formularioapadrinar;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}