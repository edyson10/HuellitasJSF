package huellitasjsf.bean;

import javax.faces.bean.ManagedBean;

import huellitasjsf.model.DAO.AdministradorDAO;
import huellitasjsf.model.entities.Administrador;

@ManagedBean
public class LoginBean {

	
	Administrador ad = new Administrador();
	Administrador AdminValidado = null;
	
	public Administrador getAd() {
		return ad;
	}

	public void setAd(Administrador ad) {
		this.ad = ad;
	}

	public Administrador getAdminValidado() {
		return AdminValidado;
	}

	public void setAdminValidado(Administrador adminValidado) {
		AdminValidado = adminValidado;
	}

		public String validar() {
		
		//System.out.println(heroe.getNombre());
		AdministradorDAO adDao = new AdministradorDAO();
		Administrador a = adDao.findByField("usuario", ad.getUsuario());
		
		if(a!=null) {
			if(a.getPassword().contentEquals(ad.getPassword())){
				this.AdminValidado = a;
				return "home";
			}
		}
		this.AdminValidado = null;	
		return "error";
	}
	
	public Boolean permiso(){
		if(this.AdminValidado == null) {
			return false;
		}
		return true;
		
	}
	
}
