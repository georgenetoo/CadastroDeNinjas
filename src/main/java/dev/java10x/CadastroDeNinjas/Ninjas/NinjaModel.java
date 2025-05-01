package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Dependência spring JPA, transforma toda essa classe em uma entidade do meu banco de dados.
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {

    // Para o ID ser preenchido.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    // ManyToOne - um ninja tem uma única missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira ou foreing key (junção das duas tabelas).
    private MissoesModel missoes;

}