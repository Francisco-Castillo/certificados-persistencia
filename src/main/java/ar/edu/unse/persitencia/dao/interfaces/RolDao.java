/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unse.persitencia.dao.interfaces;

import ar.edu.unse.persitencia.model.entity.Rol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface RolDao {

    void create(Rol rol);

    void edit(Rol rol);

    void remove(Rol rol);

    Rol find(Object id);

    List<Rol> findAll();

    List<Rol> findRange(int[] range);

    int count();
    
}
