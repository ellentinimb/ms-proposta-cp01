package ellen.ms_proposta.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PropostaDTO {

    @NotNull(message = "O campo Valor é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "O valor deve ser positivo")
    private BigDecimal valorSolicitado;

    @NotNull(message = "O campo prazo para pagamento é obrigatório")
    @Min(value = 1, message = "O prazo para pagamento deve ser maior que 1 mês")
    private Integer prazoParaPagamento;

    private boolean aprovado = false;

    @NotNull(message = "O campo ID do usuário é obrigatório")
    private Long userId;
}
