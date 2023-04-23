package dio.nandoamori.academiadigital.controller;

import dio.nandoamori.academiadigital.entity.Aluno;
import dio.nandoamori.academiadigital.entity.form.AlunoForm;
import dio.nandoamori.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;
    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }
    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }
}
