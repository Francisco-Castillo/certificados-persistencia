package ar.edu.unse.persitencia.model.entity;

import java.io.Serializable;

/**
 *
 * @author fcastillo
 */
public abstract class UnseEntity implements Serializable{

    public abstract Serializable getPrimaryKey();
}
