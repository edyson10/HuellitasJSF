package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.RazaDAO;
import huellitasjsf.model.entities.Raza;

@ManagedBean
@SessionScoped
public class RazaBean {

	RazaDAO rDAO = new RazaDAO();
	public List<Raza> retornarRaza(){
		System.out.println("Tamaño " + rDAO.list().size());
		return rDAO.list();
	}
}
