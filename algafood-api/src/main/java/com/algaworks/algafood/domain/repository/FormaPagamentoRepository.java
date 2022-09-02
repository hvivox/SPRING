package com.algaworks.algafood.domain.repository;


import com.algaworks.algafood.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {

    public List<FormaPagamento> listar();
    public FormaPagamento buscar(Long id);
    public FormaPagamento salvar(FormaPagamento formaPagemento);
    public void remover( FormaPagamento formaPagemento);

}
