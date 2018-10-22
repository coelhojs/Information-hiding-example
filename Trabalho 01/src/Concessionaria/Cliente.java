package Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private int idade;
    private String cpf;
    private Concessionaria concessionaria;

    List<Automovel> automoveis = new ArrayList<>();
    List<PeçaUsada> pecasUsadas = new ArrayList<>();
    List<PeçaNova> pecasNovas = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adquirirAutomovel (Automovel automovel) {
        automoveis.add(automovel);
    }
    public void adquirirPeçaUsada (PeçaUsada peçaUsada) {
        pecasUsadas.add(peçaUsada);
    }
    public void adquirirPeçaNova (PeçaNova peçaNova) {
        pecasNovas.add(peçaNova);
    }


}
