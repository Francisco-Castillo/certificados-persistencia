package ar.edu.unse.persitencia.model.entity;

import ar.edu.unse.persitencia.enums.EstadoActividadEnum;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author fcastillo
 */
@Entity
@Table(name = "Actividad")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
public class Actividad extends UnseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actividad_id")
    private Long id;

    @Column(name = "actividad_nombre")
    @NotNull
    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unidad_ejecutora_id")
    @NotNull
    private UnidadEjecutora unidadEjecutora;

    @Enumerated(EnumType.STRING)
    @Column(name = "actividad_estado")
    private EstadoActividadEnum estado;

    @Override
    public Serializable getPrimaryKey() {
	return id;
    }

}
