package com.algaworks.algafood.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.math.BigDecimal;

@
@Entity
public class Produto {
    @GeneratedValue
    Long id;
    String nome;
    String descricao;
    BigDecimal preco;
    boolean ativo;
}
