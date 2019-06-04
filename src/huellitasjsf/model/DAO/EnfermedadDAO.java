package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Enfermedad;

public class EnfermedadDAO extends Conexion<Enfermedad> implements GenericDAO<Enfermedad> {

	public EnfermedadDAO() {
		super(Enfermedad.class);
	}
}
