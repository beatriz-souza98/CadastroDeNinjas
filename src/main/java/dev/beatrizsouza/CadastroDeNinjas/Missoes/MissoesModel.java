package dev.beatrizsouza.CadastroDeNinjas.Missoes;

import dev.beatrizsouza.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

public class MissoesModel {

    @Entity
    @Table(name = "tb_missoes")
    public static class Missoes {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany = Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}}
