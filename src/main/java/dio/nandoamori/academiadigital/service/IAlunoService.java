package dio.nandoamori.academiadigital.service;

import dio.nandoamori.academiadigital.entity.Aluno;
import dio.nandoamori.academiadigital.entity.AvaliacaoFisica;
import dio.nandoamori.academiadigital.entity.form.AlunoForm;
import dio.nandoamori.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;
import java.util.Optional;

public interface IAlunoService {
    Aluno create(AlunoForm form);
    Optional<Aluno> get(Long id);
    List<Aluno> getAll(String dataNascimento);
    Aluno update(Long id, AlunoUpdateForm formUpdate);
    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
