package huellitasjsf.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import huellitasjsf.model.DAO.TratamientoDAO;
import huellitasjsf.model.entities.Tratamiento;

@ManagedBean
@SessionScoped
public class TratamientoBean {
	
	private Tratamiento tratamiento = new Tratamiento();
	private Integer combo;
	
	
	public Tratamiento getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
	public Integer getCombo() {
		return combo;
	}
	public void setCombo(Integer combo) {
		this.combo = combo;
	}
	
	public List<Tratamiento> retornarTratamiento(){
		TratamientoDAO tratamDAO = new TratamientoDAO();
		System.out.println("Tamaño " +  tratamDAO.list().size());
		return tratamDAO.list();
	}
	
}
