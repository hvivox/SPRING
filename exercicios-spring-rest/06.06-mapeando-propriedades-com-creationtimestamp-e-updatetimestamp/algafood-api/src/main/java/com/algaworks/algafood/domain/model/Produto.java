package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@Entity
public class Produto {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    String nome;
    String descricao;
    BigDecimal preco;
    Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "Restaurante_id", nullable = false)
    Restaurante restaurante;
}
