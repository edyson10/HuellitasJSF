package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.CiudadDAO;
import huellitasjsf.model.entities.Ciudad;

@ManagedBean(name="ciudadBean")
@SessionScoped
public class CiudadBean {

	private Ciudad ciudad = new Ciudad();
	private Integer combo;
	String alerta = "";
	String alerta2 = "";
	
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
	
	public String registrarCiudad() {
		CiudadDAO cDao = new CiudadDAO();
		Ciudad c = cDao.findByField("nombreCiudad", ciudad.getNombreCiudad());
		
		if (c != null) {
			this.alerta = "Error al registrarse: ciudad ya existente";
			System.out.println("Ya existe");
			return "registros";
		} else {
			cDao.insert(ciudad);
			this.alerta = "";
			this.alerta2 = "";
			return "admin";
		}	
	}
}
