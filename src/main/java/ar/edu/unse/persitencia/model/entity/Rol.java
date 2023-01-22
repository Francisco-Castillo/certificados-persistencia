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
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Rol")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
public class Rol extends UnseEntity {

    @Id
    @Column(name = "rol_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rol_descripcion")
    @NotNull
    private String descripcion;

    @ManyToOne()
    @JoinColumn(name = "unidad_ejecutora_id")
    private UnidadEjecutora unidadEjecutora;

    @Override
    public Serializable getPrimaryKey() {
	return id;
    }

}
