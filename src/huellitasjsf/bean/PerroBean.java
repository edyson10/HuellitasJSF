package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.PerroDAO;
import huellitasjsf.model.DAO.RazaDAO;
import huellitasjsf.model.entities.Perro;
import huellitasjsf.model.entities.Raza;

@ManagedBean(name="perroBean")
@SessionScoped
public class PerroBean {
	
	private Perro perro = new Perro();
	private Integer combo;
	String alerta = "";
	String alerta2 = "";
	
	public Perro getPerro() {
		return perro;
	}
	public void setPerro(Perro perro) {
		this.perro = perro;
	}
	public Integer getCombo() {
		return combo;
	}
	public void setCombo(Integer combo) {
		this.combo = combo;
	}	
	
	public List<Perro> listarPerros() {
		PerroDAO peDao = new PerroDAO();
		System.out.println(this.combo);
		return peDao.list();
	}
	
	public String registrarPerro() {
		PerroDAO pDao = new PerroDAO();
		Perro p = pDao.findByField("nombre", perro.getNombre());
		
		if (p != null) {
			this.alerta = "Error al registrarse: perro ya existe";
			System.out.println("Ya existe");
			return "formPerro";
		} else {
			RazaDAO rDao = new RazaDAO();
			Raza raza = rDao.find(combo);
			System.out.println(combo);
			perro.setRaza(raza);
			pDao.insert(perro);
			this.alerta = "";
			this.alerta2 = "";
			return "admin";
		}
	}
}