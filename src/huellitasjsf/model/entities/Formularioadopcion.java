package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the formularioadopcion database table.
 * 
 */
@Entity
@NamedQuery(name="Formularioadopcion.findAll", query="SELECT f FROM Formularioadopcion f")
public class Formularioadopcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_formulario")
	private int idFormulario;

	private int adulto;

	private int edadninos;

	private int ninos;

	private String perrosantes;

	private String porqueadoptar;

	private String responsabilidadperro;

	private String tipoperro;

	private String visitas;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="cedula")
	private Persona persona;

	//bi-directional many-to-one association to Perro
	@ManyToOne
	@JoinColumn(name="nombreperro")
	private Perro perro;

	public Formularioadopcion() {
	}

	public int getIdFormulario() {
		return this.idFormulario;
	}

	public void setIdFormulario(int idFormulario) {
		this.idFormulario = idFormulario;
	}

	public int getAdulto() {
		return this.adulto;
	}

	public void setAdulto(int adulto) {
		this.adulto = adulto;
	}

	public int getEdadninos() {
		return this.edadninos;
	}

	public void setEdadninos(int edadninos) {
		this.edadninos = edadninos;
	}

	public int getNinos() {
		return this.ninos;
	}

	public void setNinos(int ninos) {
		this.ninos = ninos;
	}

	public String getPerrosantes() {
		return this.perrosantes;
	}

	public void setPerrosantes(String perrosantes) {
		this.perrosantes = perrosantes;
	}

	public String getPorqueadoptar() {
		return this.porqueadoptar;
	}

	public void setPorqueadoptar(String porqueadoptar) {
		this.porqueadoptar = porqueadoptar;
	}

	public String getResponsabilidadperro() {
		return this.responsabilidadperro;
	}

	public void setResponsabilidadperro(String responsabilidadperro) {
		this.responsabilidadperro = responsabilidadperro;
	}

	public String getTipoperro() {
		return this.tipoperro;
	}

	public void setTipoperro(String tipoperro) {
		this.tipoperro = tipoperro;
	}

	public String getVisitas() {
		return this.visitas;
	}

	public void setVisitas(String visitas) {
		this.visitas = visitas;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Perro getPerro() {
		return this.perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

}