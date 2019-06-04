package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Formularioapadrinar;

public class FormularioApadrinarDAO extends Conexion<Formularioapadrinar> implements GenericDAO<Formularioapadrinar> {
	
	public FormularioApadrinarDAO() {
		super(Formularioapadrinar.class);
	}
}
