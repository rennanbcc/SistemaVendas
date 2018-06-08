package pacote.Model;

import java.util.Objects;

public class PessoaJuridica extends Pessoa {
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cnpj);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                super.toString() + ", " +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

    private String cnpj;
}
