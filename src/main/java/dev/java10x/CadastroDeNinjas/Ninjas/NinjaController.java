package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotações principais do controller feito para mediar a comunicação
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") // pegar informações da rota de boas vindas
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
