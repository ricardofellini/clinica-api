package med.voll.api.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPaciente(

        @NotBlank String nome,

        @NotBlank @Email String email,

        @NotBlank String telefone,

        @NotBlank String cpf
        //regexp =  "\\\\d{3}\\\\.?\\\\d{3}\\\\.?\\\\d{3}\\\\-?\\\\d{2}"

) {
}
