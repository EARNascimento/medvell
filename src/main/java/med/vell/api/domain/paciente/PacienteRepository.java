package med.vell.api.domain.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Page<Paciente> findAllByAtivoTrue(Pageable page);

//    @Query("SELECT p.ativo FROM paciente p WHERE p.id = :id")
//    boolean findAtivoById(Long id);
}
