package org.example.medicamentosprojeto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    private String nome;
    private String dosagem;
    private String horario;
    private String descricao;
    // Construtor vazio necessário para JPA
    public Medicamento() {}

    public Medicamento(String nome, String dosagem, String horario, String descricao) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.horario = horario;
        this.descricao = descricao;
    }


    //Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
