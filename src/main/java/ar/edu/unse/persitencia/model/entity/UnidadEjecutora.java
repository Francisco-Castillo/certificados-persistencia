package ar.edu.unse.persitencia.model.entity;

import ar.edu.unse.persitencia.enums.FacultadEnum;
import ar.edu.unse.persitencia.enums.TipoArchivoEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Unidad_Ejecutora")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
public class UnidadEjecutora extends UnseEntity {

    @Id
    @Column(name = "unidad_ejecutora_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "unidad_ejecutora_facultad")
    private FacultadEnum facultad;

    @Override
    public Serializable getPrimaryKey() {
	return id;
    }

}
