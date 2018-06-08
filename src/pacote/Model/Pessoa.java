package pacote.Model;

import java.util.Date;
import java.util.Objects;

public class Pessoa {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(email, pessoa.email) &&
                Objects.equals(telefone, pessoa.telefone) &&
                Objects.equals(endereco, pessoa.endereco) &&
                Objects.equals(dataAniversario, pessoa.dataAniversario);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, email, telefone, endereco, dataAniversario);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataAniversario=" + dataAniversario +
                '}';
    }

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private Date dataAniversario;
}
