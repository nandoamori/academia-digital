package dio.nandoamori.academiadigital.entity.form;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    @NotEmpty(message = "Campo não pode ser vazio.")
    @Size(min = 3, max = 50, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;
    @NotEmpty(message = "Campo não pode ser vazio.")
    @CPF(message = "'${validateValue}' é inválido!")
    private String cpf;
    @NotEmpty(message = "Campo não pode ser vazio.")
    @Size(min = 3, max = 50, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;
    @NotNull(message = "Preencha o campo corretamente")
    @Past(message = "Data '${validateValue}' é inválida.")
    private LocalDate dataNascimento;
}
