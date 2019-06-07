package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.RazaDAO;
import huellitasjsf.model.entities.Raza;

@ManagedBean
@SessionScoped
public class RazaaBean {
	
	private Raza raza = new Raza();
	private Integer combo;
	
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public Integer getCombo() {
		return combo;
	}
	public void setCombo(Integer combo) {
		this.combo = combo;
	}
	
	public List<Raza> retornarRaza(){
		RazaDAO rDAO = new RazaDAO();
		return rDAO.list();
	}
}
