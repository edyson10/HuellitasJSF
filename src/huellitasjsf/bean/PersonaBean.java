package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.PersonaDAO;
import huellitasjsf.model.entities.Persona;

@ManagedBean
@SessionScoped
public class PersonaBean {
	
	Persona perso = new Persona();
	private Integer combo;
	
	public Persona getPerso() {
		return perso;
	}
	public void setPerso(Persona perso) {
		this.perso = perso;
	}
	public Integer getCombo() {
		return combo;
	}
	public void setCombo(Integer combo) {
		this.combo = combo;
	}
	
	public List<Persona> listarPersonas() {
		PersonaDAO persDao = new PersonaDAO();
		System.out.println(this.combo);
		return persDao.list();
	}
	
	
}
