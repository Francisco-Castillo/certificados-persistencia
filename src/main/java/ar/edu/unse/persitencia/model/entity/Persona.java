package ar.edu.unse.persitencia.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Persona")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
public class Persona extends UnseEntity {

    @Id
    @Column(name = "persona_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "persona_nombre")
    private String nombre;

    @Column(name = "persona_apellido")
    private String apellido;

    @Column(name = "persona_correo")
    private String correo;

    @Override
    public Serializable getPrimaryKey() {
	return id;
    }
}
