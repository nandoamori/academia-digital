package dio.nandoamori.academiadigital.service;

import dio.nandoamori.academiadigital.entity.Matricula;
import dio.nandoamori.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll();
    void delete(Long id);


}
