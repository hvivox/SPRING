package com.algaworks.algafood.jpa;

import com.algaworks.algafood.domain.model.Estado;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.repository.EstadoRepository;

import java.util.List;

public class EstadoMain {
    static EstadoMain estadoMain = new EstadoMain();
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        EstadoRepository estadoRepository = applicationContext.getBean( EstadoRepository.class ) ;
        //estadoMain.listar(estadoRepository);
        //estadoMain.salvar(estadoRepository);
        //estadoMain.buscar(estadoRepository);
        estadoMain.remover(estadoRepository);
    }

    public void salvar(EstadoRepository estadoRepository){
        Estado estado = new Estado();
        estado.setNome("Rio Grande do Sul");
        estado = estadoRepository.salvar( estado );
        System.out.printf( estado.toString() );
    }

    public void buscar(EstadoRepository estadoRepository){
        Estado estado = estadoRepository.buscar(1L);
        System.out.printf( estado.getNome() + "\n\n\n");
    }

    public void listar( EstadoRepository estadoRepository ){
        List<Estado> todosEstado = estadoRepository.listar();
        //Estado itemEstado = new Estado();
        for ( Estado itemEstado: todosEstado) {
            System.out.println(   itemEstado.getNome()+ "\n"   );

        }
        System.out.printf("Hermogenes");
    }

    public void remover(  EstadoRepository estadoRepository){
        Estado estado = new Estado();
        estado.setId(1L);
        estadoRepository.remover( estado );

        listar( estadoRepository );

    }


}
