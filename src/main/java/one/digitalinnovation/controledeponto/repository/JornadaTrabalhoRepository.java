package one.digitalinnovation.controledeponto.repository;


import one.digitalinnovation.controledeponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho,Long> {
}
