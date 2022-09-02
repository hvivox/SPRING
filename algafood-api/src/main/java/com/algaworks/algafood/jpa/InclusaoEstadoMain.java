package com.algaworks.algafood.jpa;

import com.algaworks.algafood.domain.model.Estado;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.EstadoRepository;

import java.util.List;

public class InclusaoEstadoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        EstadoRepository estadoRepository = applicationContext.getBean( EstadoRepository.class ) ;
        List<Estado> todosEstado = estadoRepository.listar();
        //Estado itemEstado = new Estado();
        for ( Estado itemEstado: todosEstado) {
            System.out.println(   itemEstado.getNome()+ "\n"   );

        }
        System.out.printf("Hermogenes");
    }

}
