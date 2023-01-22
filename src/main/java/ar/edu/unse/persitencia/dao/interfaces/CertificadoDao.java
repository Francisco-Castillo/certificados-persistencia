/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unse.persitencia.dao.interfaces;

import ar.edu.unse.persitencia.model.entity.Certificado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface CertificadoDao {

    void create(Certificado certificado);

    void edit(Certificado certificado);

    void remove(Certificado certificado);

    Certificado find(Object id);

    List<Certificado> findAll();

    List<Certificado> findRange(int[] range);

    int count();
    
}
