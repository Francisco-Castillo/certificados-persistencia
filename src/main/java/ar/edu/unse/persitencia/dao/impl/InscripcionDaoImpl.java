

package ar.edu.unse.persitencia.dao.impl;

import ar.edu.unse.persitencia.dao.interfaces.AbstractFacade;
import ar.edu.unse.persitencia.model.entity.Inscripcion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ar.edu.unse.persitencia.dao.interfaces.InscripcionDao;

/**
 *
 * @author fcastillo
 */
@Stateless
public class InscripcionDaoImpl extends AbstractFacade<Inscripcion> implements InscripcionDao {

    @PersistenceContext(unitName = "certificados_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }

    public InscripcionDaoImpl() {
	super(Inscripcion.class);
    }

}
