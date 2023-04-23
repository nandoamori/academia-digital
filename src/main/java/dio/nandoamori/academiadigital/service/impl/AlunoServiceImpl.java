package dio.nandoamori.academiadigital.service.impl;

import dio.nandoamori.academiadigital.entity.Aluno;
import dio.nandoamori.academiadigital.entity.AvaliacaoFisica;
import dio.nandoamori.academiadigital.entity.form.AlunoForm;
import dio.nandoamori.academiadigital.entity.form.AlunoUpdateForm;
import dio.nandoamori.academiadigital.infra.utils.JavaTimeUtils;
import dio.nandoamori.academiadigital.repository.AlunoRepository;
import dio.nandoamori.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements IAlunoService {
    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());

        return repository.save(aluno);
    }

    @Override
    public Optional<Aluno> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Aluno> getAll(String dataNascimento) {
        if (dataNascimento == null) {
            return repository.findAll();
        }else{
            LocalDate localDate = LocalDate.parse(dataNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataNascimento(localDate);
        }

    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {

        return null;
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacao();
    }

}
