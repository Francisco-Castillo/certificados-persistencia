package ar.edu.unse.persitencia.enums;

import lombok.Getter;

/**
 *
 * @author fcastillo
 */
@Getter
public enum FacultadEnum {

    FACULTAD_DE_CIENCIAS_EXACTAS_Y_TECNOLOGIAS("FCEyT", "Facultad de Ciencias Exactas y Tecnologias"),
    FACULTAD_DE_HUMANIDADES_CIENCIAS_SOCIALES_Y_DE_LA_SALUD("FHCyS", "Facultdad de Humanidades, Ciencias Sociales y de la Salud");

    private String abreviatura;
    private String descripcion;

    FacultadEnum(String abreviatura, String descripcion) {
	this.abreviatura = abreviatura;
	this.descripcion = descripcion;
    }

}
