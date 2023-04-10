package br.com.dio.model;

import java.util.Objects;
import java.util.jar.Attributes.Name;

public class gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {}

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, idade, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null)
        return false;
        if (getClass() != obj.getClass())
        return false;
        Gato other = (Gato) obj;
        return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(name, other.name);
    }

    @Override
    public String toString () {
        return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
    }

}
