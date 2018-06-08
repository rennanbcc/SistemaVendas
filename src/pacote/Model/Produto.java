package pacote.Model;

import java.util.Objects;

public class Produto {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 &&
                Double.compare(produto.peso, peso) == 0 &&
                estoqueMinimo == produto.estoqueMinimo &&
                estoqueAtual == produto.estoqueAtual &&
                Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, preco, peso, estoqueMinimo, estoqueAtual);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                ", estoqueMinimo=" + estoqueMinimo +
                ", estoqueAtual=" + estoqueAtual +
                '}';
    }

    private String nome;
    private double preco;
    private double peso;
    private int estoqueMinimo;
    private int estoqueAtual = 0;
}
