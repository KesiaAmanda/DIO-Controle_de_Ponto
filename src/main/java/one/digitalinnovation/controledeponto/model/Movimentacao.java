package one.digitalinnovation.controledeponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private Long idMovimentacao;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private BigDecimal permanencia;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private TipoData tipoData;

}
