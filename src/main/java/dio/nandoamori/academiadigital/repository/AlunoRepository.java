package dio.nandoamori.academiadigital.repository;

import dio.nandoamori.academiadigital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByDataNascimento(LocalDate dataNascimento);
}
