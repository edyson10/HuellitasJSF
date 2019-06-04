package huellitasjsf.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the raza database table.
 * 
 */
@Entity
@NamedQuery(name="Raza.findAll", query="SELECT r FROM Raza r")
public class Raza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_raza")
	private int idRaza;

	@Column(name="nombre_raza")
	private String nombreRaza;

	//bi-directional many-to-one association to Perro
	@OneToMany(mappedBy="raza")
	private List<Perro> perros;

	public Raza() {
	}

	public int getIdRaza() {
		return this.idRaza;
	}

	public void setIdRaza(int idRaza) {
		this.idRaza = idRaza;
	}

	public String getNombreRaza() {
		return this.nombreRaza;
	}

	public void setNombreRaza(String nombreRaza) {
		this.nombreRaza = nombreRaza;
	}

	public List<Perro> getPerros() {
		return this.perros;
	}

	public void setPerros(List<Perro> perros) {
		this.perros = perros;
	}

	public Perro addPerro(Perro perro) {
		getPerros().add(perro);
		perro.setRaza(this);

		return perro;
	}

	public Perro removePerro(Perro perro) {
		getPerros().remove(perro);
		perro.setRaza(null);

		return perro;
	}

}