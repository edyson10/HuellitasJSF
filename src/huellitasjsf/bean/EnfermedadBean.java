package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.EnfermedadDAO;
import huellitasjsf.model.entities.Enfermedad;

@ManagedBean(name="enfermedadBean")
@SessionScoped
public class EnfermedadBean {

	private Enfermedad enfermedad = new Enfermedad();
	private Integer combo;
	String alerta = "";
	String alerta2 = "";
	
	public Enfermedad getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	public Integer getCombo() {
		return combo;
	}
	public void setCombo(Integer combo) {
		this.combo = combo;
	}
	
	public List<Enfermedad> retornarEnfermedad() {
		EnfermedadDAO enferDao = new EnfermedadDAO();
		System.out.println(this.combo);
		return enferDao.list();
	}
	
	public String registrarEnfermedad() {
		EnfermedadDAO eDao = new EnfermedadDAO();
		Enfermedad e = eDao.findByField("nombreEnfermedad", enfermedad.getNombreEnfermedad());
		
		if (e != null) {
			this.alerta = "Error al registrarse: enfermedad ya existente";
			System.out.println("Ya existe");
			return "registros";
		} else {
			eDao.insert(enfermedad);
			this.alerta = "";
			this.alerta2 = "";
			return "admin";
		}	
	}
}
