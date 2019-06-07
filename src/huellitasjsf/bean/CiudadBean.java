package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.CiudadDAO;
import huellitasjsf.model.entities.Ciudad;

@ManagedBean
@SessionScoped
public class CiudadBean {

	private Ciudad ciudad = new Ciudad();
	private Integer combo;
	
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getCombo() {
		return combo;
	}
	public void setCombo(Integer combo) {
		this.combo = combo;
	}
	
	public List<Ciudad> retornarCiudad() {
		CiudadDAO ciuDao = new CiudadDAO();
		System.out.println(this.combo);
		return ciuDao.list();
	}
	
	
}
