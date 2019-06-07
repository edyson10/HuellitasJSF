package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.EnfermedadDAO;
import huellitasjsf.model.entities.Enfermedad;

@ManagedBean
@SessionScoped
public class EnfermedadBean {

	private Enfermedad enfermedad = new Enfermedad();
	private Integer combo;
	
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
	
	
}
