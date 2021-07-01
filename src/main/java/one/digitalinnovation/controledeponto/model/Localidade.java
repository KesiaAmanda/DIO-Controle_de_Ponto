package one.digitalinnovation.controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    private Long id;
    @ManyToOne
    public NivelAcesso nivelAcesso;
    private String descricao;
}
