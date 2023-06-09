package dio.nandoamori.academiadigital.service.impl;

import dio.nandoamori.academiadigital.entity.Aluno;
import dio.nandoamori.academiadigital.entity.Matricula;
import dio.nandoamori.academiadigital.entity.form.MatriculaForm;
import dio.nandoamori.academiadigital.repository.AlunoRepository;
import dio.nandoamori.academiadigital.repository.MatriculaRepository;
import dio.nandoamori.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private MatriculaRepository repository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll(String bairro) {

        if (bairro == null) {
            return repository.findAll();
        }else{
            return repository.findByAlunoBairro(bairro);
        }
    }

    @Override
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
