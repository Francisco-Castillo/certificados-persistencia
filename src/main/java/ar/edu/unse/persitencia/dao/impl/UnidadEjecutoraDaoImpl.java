

package ar.edu.unse.persitencia.dao.impl;

import ar.edu.unse.persitencia.dao.interfaces.AbstractFacade;
import ar.edu.unse.persitencia.dao.interfaces.UnidadEjecutoraDao;
import ar.edu.unse.persitencia.model.entity.UnidadEjecutora;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fcastillo
 */
@Stateless
public class UnidadEjecutoraDaoImpl extends AbstractFacade<UnidadEjecutora> implements UnidadEjecutoraDao {

    @PersistenceContext(unitName = "certificados_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }

    public UnidadEjecutoraDaoImpl() {
	super(UnidadEjecutora.class);
    }

}
