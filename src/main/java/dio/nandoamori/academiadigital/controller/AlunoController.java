package dio.nandoamori.academiadigital.controller;

import dio.nandoamori.academiadigital.entity.Aluno;
import dio.nandoamori.academiadigital.entity.AvaliacaoFisica;
import dio.nandoamori.academiadigital.entity.form.AlunoForm;
import dio.nandoamori.academiadigital.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;
    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataNascimento", required = false) String dataNascimento){
        return service.getAll(dataNascimento);
    }
    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return service.create(form);
    }
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacoesId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

}
