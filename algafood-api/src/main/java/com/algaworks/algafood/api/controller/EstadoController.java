package com.algaworks.algafood.api.controller;


import com.algaworks.algafood.domain.model.Estado;

import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Estados")
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;


    @GetMapping
    public List<Estado> lista(){
        return estadoRepository.listar();
    }


    @GetMapping("/{estadoId}")
    public Estado buscar( @PathVariable Long idEstado ){
        return estadoRepository.buscar(idEstado);
    }


}
