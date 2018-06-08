package pacote.Controller;

import pacote.Model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerProduto {
    ArrayList<Produto> produtos = new ArrayList<>();

    private boolean existeProduto(String nome){
        int i;
        for(i=0;i<produtos.length;i++){

            if(produtos[i].nome.equals(nome)){
                if(estoqueAtual>0){
                    return true;
                }
            }
            else{
                return false;
            }
        }
    }
    public Produto buscarProduto(String nome){
        int i;
        for(i=0;i<produtos.length;i++){
            if(produtos[i].nome.equals(nome)){
                return produtos[i];
            }
            else{
                System.out.println("Esse produto não esta registrada.");
            }
        }
    }
    private Produto addProduto () {
        Produto c = new Produto();
        System.out.println("Digite o nome do produto: ");
        Scanner scan = new Scanner(System.in);
        c.setNome(scan.nextLine());
        System.out.println("Digite o preco do produto: ");
        c.setPreco(scan.nextDouble());
        System.out.println("Digite o peso do produto: ");
        c.setPeso(scan.nextDouble());
        System.out.println("Digite o estoque minimo do produto: ");
        c.setEstoqueMinimo(scan.nextInt());
        System.out.println("Digite o estoque atual do produto: ");
        c.setEstoqueAtual(scan.nextInt());
        produtos.add(c);
}
