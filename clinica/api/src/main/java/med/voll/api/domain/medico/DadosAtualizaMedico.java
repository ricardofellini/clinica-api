package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaMedico(

        @NotNull Long id,
        String nome,
        String telefone){
}
