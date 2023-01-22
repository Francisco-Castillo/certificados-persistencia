

package ar.edu.unse.persitencia.dao.impl;

import ar.edu.unse.persitencia.dao.interfaces.AbstractFacade;
import ar.edu.unse.persitencia.model.entity.Actividad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ar.edu.unse.persitencia.dao.interfaces.ActividadDao;

/**
 *
 * @author fcastillo
 */
@Stateless
public class ActividadDaoImpl extends AbstractFacade<Actividad> implements ActividadDao {

    @PersistenceContext(unitName = "certificados_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }

    public ActividadDaoImpl() {
	super(Actividad.class);
    }

}
