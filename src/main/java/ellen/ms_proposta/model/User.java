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
@Table(name = "tab_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo Nome é obrigatório")
    private String nome;

    @NotBlank(message = "O campo Sobrenome é obrigatório")
    private String sobrenome;

    @NotBlank(message = "O campo CPF é obrigatório")
    @Column(unique = true)
    private String cpf;

    @NotBlank(message = "O campo Telefone é obrigatório")
    private String telefone;

    @NotNull(message = "O campo Renda é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "A renda deve ser positiva")
    private BigDecimal renda;


}
