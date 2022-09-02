package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Estado;
import java.util.List;

public interface EstadoRepository {

    public List<Estado> listar();
    public Estado buscar(Long id);
    public Estado salvar( Estado estado);
    public void remover( Estado estado);
}
