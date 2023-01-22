/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unse.persitencia.dao.interfaces;

import ar.edu.unse.persitencia.model.entity.Persona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface PersonaDao {

    void create(Persona persona);

    void edit(Persona persona);

    void remove(Persona persona);

    Persona find(Object id);

    List<Persona> findAll();

    List<Persona> findRange(int[] range);

    int count();
    
}
