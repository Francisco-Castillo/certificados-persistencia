package ar.edu.unse.persitencia.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name = "Inscripcion")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
public class Inscripcion extends UnseEntity {

    @Id
    @Column(name = "inscripcion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "actividad_id")
    private Actividad actividad;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    @Override
    public Serializable getPrimaryKey() {
	return id;
    }

}
