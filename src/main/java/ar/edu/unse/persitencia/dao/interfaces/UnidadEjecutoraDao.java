/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unse.persitencia.dao.interfaces;

import ar.edu.unse.persitencia.model.entity.UnidadEjecutora;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface UnidadEjecutoraDao {

    void create(UnidadEjecutora unidadEjecutora);

    void edit(UnidadEjecutora unidadEjecutora);

    void remove(UnidadEjecutora unidadEjecutora);

    UnidadEjecutora find(Object id);

    List<UnidadEjecutora> findAll();

    List<UnidadEjecutora> findRange(int[] range);

    int count();
    
}
