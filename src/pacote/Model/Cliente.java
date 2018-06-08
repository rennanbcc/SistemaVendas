package pacote.Model;

import java.util.Objects;

public class Cliente extends PessoaFisica {
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Double.compare(cliente.limiteCredito, limiteCredito) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), limiteCredito);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() + ", " +
                "limiteCredito=" + limiteCredito +
                '}';
    }

    private double limiteCredito;
}
