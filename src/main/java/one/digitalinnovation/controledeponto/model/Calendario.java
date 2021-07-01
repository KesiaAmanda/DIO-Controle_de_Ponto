package one.digitalinnovation.controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;
    private String tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

}
