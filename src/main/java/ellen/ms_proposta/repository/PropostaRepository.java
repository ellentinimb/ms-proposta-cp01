package ellen.ms_proposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ellen.ms_proposta.model.Proposta;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {
}
