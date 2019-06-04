package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Raza;

public class RazaDAO extends Conexion<Raza> implements GenericDAO<Raza>{

	public RazaDAO() {
		super(Raza.class);
	}
}