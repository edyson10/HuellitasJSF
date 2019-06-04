package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Ciudad;

public class CiudadDAO extends Conexion<Ciudad> implements GenericDAO<Ciudad> {

	public CiudadDAO() {
		super(Ciudad.class);
	}
}