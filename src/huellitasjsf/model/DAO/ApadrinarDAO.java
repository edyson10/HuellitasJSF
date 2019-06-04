package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Apadrinar;

public class ApadrinarDAO extends Conexion<Apadrinar> implements GenericDAO<Apadrinar> {

	public ApadrinarDAO() {
		super(Apadrinar.class);
	}
}