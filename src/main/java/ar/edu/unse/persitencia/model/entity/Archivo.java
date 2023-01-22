package ar.edu.unse.persitencia.model.entity;

import ar.edu.unse.persitencia.enums.TipoArchivoEnum;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

@Entity
@Table(name = "Archivo")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"}, callSuper = false)
public class Archivo extends UnseEntity {

    @Id
    @Column(name = "archivo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "archivo_nombre")
    private String nombre;

    @Column(name = "archivo_ubicacion")
    private String ubicacion;

    @Column(name = "archivo_extension")
    private String extension;

    @Enumerated(EnumType.STRING)
    @Column(name = "archivo_tipo")
    private TipoArchivoEnum tipo;
    
    @Column(name = "archivo_fecha_hora_subida")
    private LocalDateTime fechaHoraSubida;

    @ManyToOne()
    @JoinColumn(name = "actividad_id")
    private Actividad actividad;

    @Override
    public Serializable getPrimaryKey() {
	return id;
    }

}
