package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Tratamiento;

public class TratamientoDAO extends Conexion<Tratamiento> implements GenericDAO<Tratamiento> {
	
	public TratamientoDAO() {
		super(Tratamiento.class);
	}
}