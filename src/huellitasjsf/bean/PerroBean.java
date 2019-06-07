package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.PerroDAO;
import huellitasjsf.model.entities.Perro;;

@ManagedBean
@SessionScoped
public class PerroBean {
	
	private Perro perro = new Perro();
	private Integer combo;
	
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
	public static int test() {return 0;}
	public List<Perro> listarPerros() {
		PerroDAO peDao = new PerroDAO();
		System.out.println(this.combo);
		return peDao.list();
	}
}