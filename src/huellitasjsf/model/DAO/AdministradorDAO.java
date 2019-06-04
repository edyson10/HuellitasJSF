package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Administrador;

public class AdministradorDAO extends Conexion<Administrador> implements GenericDAO<Administrador> {

	public AdministradorDAO() {
		super(Administrador.class);
	}
}
