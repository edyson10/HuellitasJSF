package huellitasjsf.model.DAO;

import huellitasjsf.util.Conexion;
import huellitasjsf.model.entities.Perro;

public class PerroDAO extends Conexion<Perro> implements GenericDAO<Perro> {

	public PerroDAO() {
		super(Perro.class);
	}
}