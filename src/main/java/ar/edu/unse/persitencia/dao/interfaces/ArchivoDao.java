/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unse.persitencia.dao.interfaces;

import ar.edu.unse.persitencia.model.entity.Archivo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface ArchivoDao {

    void create(Archivo archivo);

    void edit(Archivo archivo);

    void remove(Archivo archivo);

    Archivo find(Object id);

    List<Archivo> findAll();

    List<Archivo> findRange(int[] range);

    int count();
    
}
