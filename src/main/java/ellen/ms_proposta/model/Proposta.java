package ellen.ms_proposta.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tab_proposta")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O campo Valor solicitado é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "O valor solicitado deve ser positivo")
    private BigDecimal valorSolicitado;

    @NotNull(message = "O campo Prazo para pagamento é obrigatório")
    @Min(value = 1, message = "O prazo para pagamento deve ser maior que 1 mês")
    private Integer prazoParaPagamento;

    private boolean aprovado = false;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
