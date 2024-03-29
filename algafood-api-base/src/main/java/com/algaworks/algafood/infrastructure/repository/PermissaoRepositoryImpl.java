package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PermissaoRepositoryImpl implements PermissaoRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> listar() {
        return manager.createQuery("From Permissao").getResultList();
    }

    @Override
    public Permissao buscar(Long id) {
        return manager.find( Permissao.class, id );
    }

    @Override
   @Transactional
    public Permissao salvar(Permissao permissao) {

        return manager.merge(permissao);
    }

    @Override
    public void remover(Permissao permissao) {
        permissao = buscar(permissao.getId());
        manager.remove(permissao);
    }


}
