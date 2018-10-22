package Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String nome;
    private String telefone;
    private Cliente cliente;

    List<Automovel> automoveis = new ArrayList<>();
    List<PeçaUsada> pecasUsadas = new ArrayList<>();
    List<PeçaNova> pecasNovas = new ArrayList<>();


    public Concessionaria() {
    }

    public Concessionaria(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addAutomovel(Automovel automovel) {
        automoveis.add(automovel);
    }

    public void removeAutomovel(Automovel automovel) {
        automoveis.remove(automovel);
    }

    public void addPeçaUsada(PeçaUsada peçaUsada) {
        pecasUsadas.add(peçaUsada);
    }

    public void removePeçaUsada(PeçaUsada peçaUsada) {
        pecasUsadas.remove(peçaUsada);
    }
    public void addPeçaNova(PeçaNova peçaNova) {
        pecasNovas.add(peçaNova);
    }

    public void removePeçaNova(PeçaNova peçaNova) {
        pecasNovas.remove(peçaNova);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<PeçaUsada> getPecasUsadas() {
        return pecasUsadas;
    }

    public List<PeçaNova> getPecasNovas() {
        return pecasNovas;
    }

    public void venderPecaUsada(PeçaUsada peçaUsada) {
        cliente.adquirirPeçaUsada(peçaUsada);
        removePeçaUsada(peçaUsada);
    }
    public void venderPecaNova(PeçaNova peçaNova) {
        cliente.adquirirPeçaNova(peçaNova);
        removePeçaNova(peçaNova);
    }
    public void venderAutomovel(Automovel automovel) {
        cliente.adquirirAutomovel(automovel);
        removeAutomovel(automovel);
    }
}
