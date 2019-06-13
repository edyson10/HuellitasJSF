package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import huellitasjsf.model.DAO.CiudadDAO;
import huellitasjsf.model.DAO.RazaDAO;
import huellitasjsf.model.entities.Ciudad;
import huellitasjsf.model.entities.Raza;

@ManagedBean(name="razaBean")//agregue esto
@SessionScoped
public class RazaBean {
	@ManagedProperty(value = "#{raza}")//agregue esto
	private Raza raza = new Raza();
	@ManagedProperty(value = "#{razaR}")//agregue esto
	private Raza razaR = new Raza();
	@ManagedProperty(value = "#{combo}")//agregue esto
	private Integer combo;
	String alerta = "";
	String alerta2 = "";
	
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
	
	public Raza getRazaR() {
		return razaR;
	}
	public void setRazaR(Raza razaR) {
		this.razaR = razaR;
	}
	public List<Raza> retornarRaza(){
		RazaDAO rDAO = new RazaDAO();
		return rDAO.list();
	}
	
	public String registrarRaza() {
		System.out.println("Llego");
		RazaDAO rDao = new RazaDAO();
		Raza r = rDao.findByField("nombreRaza", razaR.getNombreRaza());
		System.out.println(r.getNombreRaza());
		
		if (r != null) {
			this.alerta = "Error al registrarse: raza ya existente";
			System.out.println("Ya existe");
			return "registros";
		} else {
			rDao.insert(razaR);
			this.alerta = "";
			this.alerta2 = "";
			return "admin";
		}	
	}
}
