

package ar.edu.unse.persitencia.dao.impl;

import ar.edu.unse.persitencia.dao.interfaces.AbstractFacade;
import ar.edu.unse.persitencia.dao.interfaces.CertificadoDao;
import ar.edu.unse.persitencia.model.entity.Certificado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fcastillo
 */
@Stateless
public class CertificadoDaoImpl extends AbstractFacade<Certificado> implements CertificadoDao {

    @PersistenceContext(unitName = "certificados_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }

    public CertificadoDaoImpl() {
	super(Certificado.class);
    }

}
