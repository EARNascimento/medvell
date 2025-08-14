package med.vell.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface MedicoRepository extends JpaRepository<Medico, Long> {

    @Query("SELECT m.ativo FROM Medico m WHERE m.id = :id")
    Page<Medico> findAllbyAtivoTrue(Pageable paginacao);
}
