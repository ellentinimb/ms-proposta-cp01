package ellen.ms_proposta.service;

import ellen.ms_proposta.repository.PropostaRepository;
import ellen.ms_proposta.model.Proposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    public List<Proposta> findAll() {
        return propostaRepository.findAll();
    }
    public Optional<Proposta> findById(Long id) {
        return propostaRepository.findById(id);
    }

    public Proposta insert(Proposta proposta) {
        proposta.setAprovado(false);
        return propostaRepository.save(proposta);
    }

    public Proposta update(Long id, Proposta proposta) {
        Optional<Proposta> existingProposta = propostaRepository.findById(id);
        if (existingProposta.isPresent()) {
            proposta.setId(id);
            return propostaRepository.save(proposta);
        }
        return null;
    }

    public void delete(Long id) {
        propostaRepository.deleteById(id);
    }
}
