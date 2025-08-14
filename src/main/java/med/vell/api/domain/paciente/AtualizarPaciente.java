package med.vell.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.vell.api.domain.endereco.DadosEndereco;

public record AtualizarPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
