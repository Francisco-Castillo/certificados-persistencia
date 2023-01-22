package ar.edu.unse.persitencia.dao.interfaces;

import ar.edu.unse.persitencia.model.entity.Inscripcion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface InscripcionDao {

    void create(Inscripcion inscripcion);

    void edit(Inscripcion inscripcion);

    void remove(Inscripcion inscripcion);

    Inscripcion find(Object id);

    List<Inscripcion> findAll();

    List<Inscripcion> findRange(int[] range);

    int count();
    
}
