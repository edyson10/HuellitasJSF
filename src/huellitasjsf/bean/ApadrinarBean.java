package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import huellitasjsf.model.DAO.ApadrinarDAO;
import huellitasjsf.model.DAO.PerroDAO;
import huellitasjsf.model.DAO.PersonaDAO;
import huellitasjsf.model.entities.Apadrinar;
import huellitasjsf.model.entities.Perro;
import huellitasjsf.model.entities.Persona;

@ManagedBean(name="apadrinarBean")//agregue esto
@SessionScoped
public class ApadrinarBean {
	
	private Perro perro = new Perro();
	private Persona persona = new Persona();
	private Integer combo1;
	private Integer combo2;
	
	String alerta = "";
	String alerta2 = "";
	public Perro getPerro() {
		return perro;
	}
	public void setPerro(Perro perro) {
		this.perro = perro;
	}
	public Integer getCombo1() {
		return combo1;
	}
	public void setCombo1(Integer combo1) {
		this.combo1 = combo1;
	}
	public Integer getCombo2() {
		return combo2;
	}
	public void setCombo2(Integer combo2) {
		this.combo2 = combo2;
	}
	
	public List<Perro> listarPerros() {
		PerroDAO peDao = new PerroDAO();
		System.out.println(this.combo1);
		return peDao.list();
	}
	
	public List<Persona> listarPersona() {
		PersonaDAO pDao = new PersonaDAO();
		System.out.println(this.combo2);
		return pDao.list();
	}
	
	public String registrarPadrino() {
		PerroDAO pDao = new PerroDAO();
		PersonaDAO peDao= new PersonaDAO();
		Apadrinar a = new Apadrinar();
		ApadrinarDAO aDao = new ApadrinarDAO();
		Perro p = pDao.findByField("nombre", perro.getNombre());
		
		if (p != null) {
			this.alerta = "Error al registrarse: perro ya existe";
			System.out.println("Ya existe");
			return "apadrinar";
		} else {
			Perro pe = pDao.find(combo1);
			Persona per = peDao.find(combo2);
			a.setPersona(per);
			a.setPerro(pe);
			aDao.insert(a);
			this.alerta = "";
			this.alerta2 = "";
			return "admin";
		}
	}
}
