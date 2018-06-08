package pacote.Model;

import java.util.Objects;

public class PessoaFisica extends Pessoa {
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cpf);
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                super.toString() + ", " +
                "cpf='" + cpf + '\'' +
                '}';
    }

    private String cpf;
}
