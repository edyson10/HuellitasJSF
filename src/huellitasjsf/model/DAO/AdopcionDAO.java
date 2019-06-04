package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Adopcion;

public class AdopcionDAO extends Conexion<Adopcion> implements GenericDAO<Adopcion>{

	public AdopcionDAO() {
		super(Adopcion.class);
	}
}