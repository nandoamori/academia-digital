package dio.nandoamori.academiadigital.service;

import dio.nandoamori.academiadigital.entity.Aluno;
import dio.nandoamori.academiadigital.entity.form.AlunoForm;
import dio.nandoamori.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);
    Aluno get(Long id);
    List<Aluno> getAll();
    Aluno update(Long id, AlunoUpdateForm formUpdate);
    void delete(Long id);
}
