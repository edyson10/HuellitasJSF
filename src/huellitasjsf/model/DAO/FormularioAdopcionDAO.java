package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Formularioadopcion;

public class FormularioAdopcionDAO extends Conexion<Formularioadopcion> implements GenericDAO<Formularioadopcion> {

	public FormularioAdopcionDAO() {
		super(Formularioadopcion.class);
	}
}
