

package ar.edu.unse.persitencia.dao.impl;

import ar.edu.unse.persitencia.dao.interfaces.AbstractFacade;
import ar.edu.unse.persitencia.model.entity.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ar.edu.unse.persitencia.dao.interfaces.PersonaDao;

/**
 *
 * @author fcastillo
 */
@Stateless
public class PersonaDaoImpl extends AbstractFacade<Persona> implements PersonaDao {

    @PersistenceContext(unitName = "certificados_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }

    public PersonaDaoImpl() {
	super(Persona.class);
    }

}
