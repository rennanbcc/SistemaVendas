package pacote.Model;

import java.util.Date;
import java.util.Objects;

public class Vendedor extends PessoaFisica {
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(matricula, vendedor.matricula) &&
                Objects.equals(dataContratacao, vendedor.dataContratacao);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), matricula, dataContratacao);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() + ", " +
                "matricula='" + matricula + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }

    private String matricula;
    private Date dataContratacao;
}
