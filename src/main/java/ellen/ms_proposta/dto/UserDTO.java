package ellen.ms_proposta.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
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
public class UserDTO {

    @NotBlank(message = "O campo Nome é obrigatório")
    private String nome;

    @NotBlank(message = "O campo Sobrenome é obrigatório")
    private String sobrenome;

    @NotBlank(message = "O campo Telefone é obrigatório")
    private String telefone;

    @NotBlank(message = "O campo CPF é obrigatório")
    private String cpf;

    @NotNull(message = "O campo Renda é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "A renda deve ser positiva")
    private BigDecimal renda;
}
