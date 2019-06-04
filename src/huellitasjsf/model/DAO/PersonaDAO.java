package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Persona;

public class PersonaDAO extends Conexion<Persona> implements GenericDAO<Persona> {

	public PersonaDAO() {
		super(Persona.class);
	}
}