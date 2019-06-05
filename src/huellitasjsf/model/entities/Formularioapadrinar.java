package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the formularioapadrinar database table.
 * 
 */
@Entity
@NamedQuery(name="Formularioapadrinar.findAll", query="SELECT f FROM Formularioapadrinar f")
public class Formularioapadrinar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_apadrinar")
	private int idApadrinar;

	private String diamensualidad;

	private String perroantes;

	private String porqueadoptar;

	private String tipoperro;

	private String visitaspormes;

	//bi-directional many-to-one association to Perro
	@ManyToOne
	@JoinColumn(name="nombreperro")
	private Perro perro;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="cedula")
	private Persona persona;

	public Formularioapadrinar() {
	}

	public int getIdApadrinar() {
		return this.idApadrinar;
	}

	public void setIdApadrinar(int idApadrinar) {
		this.idApadrinar = idApadrinar;
	}

	public String getDiamensualidad() {
		return this.diamensualidad;
	}

	public void setDiamensualidad(String diamensualidad) {
		this.diamensualidad = diamensualidad;
	}

	public String getPerroantes() {
		return this.perroantes;
	}

	public void setPerroantes(String perroantes) {
		this.perroantes = perroantes;
	}

	public String getPorqueadoptar() {
		return this.porqueadoptar;
	}

	public void setPorqueadoptar(String porqueadoptar) {
		this.porqueadoptar = porqueadoptar;
	}

	public String getTipoperro() {
		return this.tipoperro;
	}

	public void setTipoperro(String tipoperro) {
		this.tipoperro = tipoperro;
	}

	public String getVisitaspormes() {
		return this.visitaspormes;
	}

	public void setVisitaspormes(String visitaspormes) {
		this.visitaspormes = visitaspormes;
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