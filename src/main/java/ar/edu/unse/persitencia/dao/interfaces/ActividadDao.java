/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unse.persitencia.dao.interfaces;

import ar.edu.unse.persitencia.model.entity.Actividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface ActividadDao {

    void create(Actividad actividad);

    void edit(Actividad actividad);

    void remove(Actividad actividad);

    Actividad find(Object id);

    List<Actividad> findAll();

    List<Actividad> findRange(int[] range);

    int count();
    
}
