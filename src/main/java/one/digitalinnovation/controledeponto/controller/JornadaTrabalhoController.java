package one.digitalinnovation.controledeponto.controller;

import one.digitalinnovation.controledeponto.model.JornadaTrabalho;
import one.digitalinnovation.controledeponto.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    private final JornadaTrabalhoService jornadaTrabalhoService;

    @Autowired
    public JornadaTrabalhoController(JornadaTrabalhoService jornadaTrabalhoService) {
        this.jornadaTrabalhoService = jornadaTrabalhoService;
    }

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.createJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornada(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.findById(idJornada).orElseThrow(NoSuchElementException::new));
    }

    @DeleteMapping("/{idJornada}")
    public void deleteJornada(@PathVariable("idJornada") Long idJornada) {
        jornadaTrabalhoService.deleteJornada(idJornada);
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.updateJornada(jornadaTrabalho);
    }
}
