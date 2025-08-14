package med.vell.api.domain.paciente;

import med.vell.api.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id,
                                        String nome,
                                        String email,
                                        String telefone,
                                        String documento,
                                        Boolean ativo,
                                        Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getDocumento(), paciente.getTelefone(), paciente.isAtivo(), paciente.getEndereco());
    }
}
