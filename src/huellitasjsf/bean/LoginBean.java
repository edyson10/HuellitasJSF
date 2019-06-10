package huellitasjsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import huellitasjsf.model.DAO.AdministradorDAO;
import huellitasjsf.model.entities.Administrador;
import javax.servlet.http.HttpSession;

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {

	
	Administrador ad = new Administrador();
	Administrador AdminValidado = null;
	String alerta = "";
	String alerta2 = "";
	
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
	
	public String getAlerta() {
		return alerta;
	}

	public void setAlerta(String alerta) {
		this.alerta = alerta;
	}
	
	public String getAlerta2() {
		return alerta2;
	}

	public void setAlerta2(String alerta2) {
		this.alerta2 = alerta2;
	}
	

	public Boolean permiso(){
		if(this.AdminValidado == null) {
			return false;
		}
		return true;	
	}
	
	public String iniciarSesion() {
		System.out.println("Entro");
		System.out.println(ad.getUsuario());
		AdministradorDAO adDao = new AdministradorDAO();
		Administrador a = adDao.findByField("usuario", ad.getUsuario());
		System.out.println(a.getUsuario());

		if (a != null) {
			if (a.getUsuario().contentEquals(ad.getUsuario())) {
				if (a.getPassword().contentEquals(ad.getPassword())) {
					this.AdminValidado = a;
					
					HttpSession session = (HttpSession) javax.faces.context.FacesContext.getCurrentInstance().getExternalContext()
							.getSession(true);
					session.setAttribute("usuario", AdminValidado.getUsuario());
					session.setAttribute("password", AdminValidado.getPassword());
					System.out.println("Session");
					System.out.println(session.getAttribute("password"));
					return "admin";
				} else {
					this.AdminValidado = null;
					this.alerta = "Error al iniciar sesión: credenciales inválidas";
					return "login";
				}
			} else {
				this.AdminValidado = null;
				this.alerta = "Error al iniciar sesión: credenciales inválidas";
				return "login";
			}
		} else {
			this.AdminValidado = null;
			this.alerta = "Error al iniciar sesión: credenciales inválidas";
			return "login";
		}
	}
	
	public String cerrarSesion() {
		if (this.AdminValidado != null) {
			HttpSession session = (HttpSession) javax.faces.context.FacesContext.getCurrentInstance().getExternalContext()
					.getSession(false);
			session.invalidate();
			this.AdminValidado = null;
			this.alerta = "";
			this.alerta2 = "";
			System.out.println("Cerrar Sesiom");
			return "index";
			// return "index?faces-redirect=true";
		} else {
			System.out.println("No hay Sesiom");
			return "iniciarSesion";
		}
	}
	
	public String registrar() {
		AdministradorDAO adDao = new AdministradorDAO();
		ad = adDao.findByField("usuario", ad.getUsuario());

		if (ad != null) {
			this.alerta = "Error al registrarse: usuario ya existe";
			return "error";
		} else {
			adDao.insert(ad);
			this.alerta = "";
			this.alerta2 = "";
			return "iniciarSesion";
		}
	}
	
}
