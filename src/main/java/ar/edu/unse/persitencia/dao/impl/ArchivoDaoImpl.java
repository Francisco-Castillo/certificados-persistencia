

package ar.edu.unse.persitencia.dao.impl;

import ar.edu.unse.persitencia.dao.interfaces.AbstractFacade;
import ar.edu.unse.persitencia.dao.interfaces.ArchivoDao;
import ar.edu.unse.persitencia.model.entity.Archivo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fcastillo
 */
@Stateless
public class ArchivoDaoImpl extends AbstractFacade<Archivo> implements ArchivoDao {

    @PersistenceContext(unitName = "certificados_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }

    public ArchivoDaoImpl() {
	super(Archivo.class);
    }

}
