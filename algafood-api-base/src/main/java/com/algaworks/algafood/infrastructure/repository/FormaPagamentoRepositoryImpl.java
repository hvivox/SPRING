package com.algaworks.algafood.infrastructure.repository;


import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager manager;


    @Override
    public List<FormaPagamento> listar() {
        return manager.createQuery("From FormaPagamento" ).getResultList();
    }

    @Override
    public FormaPagamento buscar(Long id) {
        return manager.find( FormaPagamento.class, id );
    }

    @Override
    @Transactional
    public FormaPagamento salvar(FormaPagamento formaPagemento) {
        return manager.merge( formaPagemento );
    }

    @Override
    public void remover(FormaPagamento formaPagemento) {
        formaPagemento = buscar( formaPagemento.getId() );
        manager.remove( formaPagemento );
    }
}
