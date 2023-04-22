package dio.nandoamori.academiadigital.service;

import dio.nandoamori.academiadigital.entity.AvaliacaoFisica;
import dio.nandoamori.academiadigital.entity.form.AvaliacaoFisicaForm;
import dio.nandoamori.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica> getAll();
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
    void delete(Long id);
}
