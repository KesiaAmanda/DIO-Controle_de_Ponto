package one.digitalinnovation.controledeponto.service;

import one.digitalinnovation.controledeponto.model.JornadaTrabalho;
import one.digitalinnovation.controledeponto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {
    private final JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho createJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long id) {
        return jornadaTrabalhoRepository.findById(id);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }
}
