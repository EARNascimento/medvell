package med.vell.api.domain.paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String documento) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getDocumento());
    }
}
