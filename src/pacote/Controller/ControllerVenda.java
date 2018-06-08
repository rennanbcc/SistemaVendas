package pacote.Controller;
import pacote.Model.Cliente;
import pacote.Model.Produto;
import pacote.Model.Venda;
import pacote.Model.Vendedor;

import java.util.ArrayList;
import java.util.Date;

public class ControllerVenda {
    ArrayList<Venda> vendas = new ArrayList<>();

    private boolean existeVenda(Venda c){
        int i;
        for(i=0;i<vendas.length;i++){
            if(vendas[i].equals(c)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public Venda buscarVenda(Venda c){
        int i;
        for(i=0;i<vendas.length;i++){
            if(vendas[i].equals(c)){
                return c;
            }
            else{
                System.out.println("Essa venda não esta armazenada.");
            }
        }
    }
    private Venda addVenda (Cliente c, Produto p, Vendedor v, int qtd) {
        Venda ve = new Venda();
        this.ve.dataVenda = new Date();
        if(existeProduto(p)== true){
            ve.setProduto(buscarProduto(p));
        }
        else{
            System.out.println("Este produto não esta cadastrado");
        }
        if(existePessoa(v)== true){
            ve.setPessoa(buscarPessoa(v));
        }
        else{
            System.out.println("Esta vendedor não esta cadastrada");
        }
        if(existePessoa(c)== true){
            ve.setPessoa(buscarPessoa(c));
        }
        else{
            System.out.println("Esta cliente não esta cadastrada");
        }
        if(qtd>estoqueAtual){
            System.out.println("Quantidade do produto insuficiente.");
        }
        else{
            estoqueAtual - qtd = estoqueAtual;
        }
    }

}
