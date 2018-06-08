package pacote.Controller;

import pacote.Model.Pessoa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ControllerPessoa {
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    private boolean existePessoa(String cpf){
        int i;
        for(i=0;i<pessoas.length;i++){
            if(pessoas[i].cpf.equals(cpf)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public Pessoa buscarPessoa(String cpf){
        int i;
        for(i=0;i<pessoas.length;i++){
            if(pessoas[i].cpf.equals(cpf)){
                return pessoas[i];
            }
            else{
                System.out.println("Essa pessoa não esta registrada.");
            }
        }
    }
    private Pessoa addPessoa(){
        Pessoa c = new Pessoa();
        System.out.println("Digite o nome da pessoa: ");
        Scanner scan = new Scanner(System.in);
        c.setNome(scan.nextLine());
        System.out.println("Digite o email da pessoa: ");
        c.setEmail(scan.nextLine());
        System.out.println("Digite o telefone da pessoa: ");
        c.setTelefone(scan.nextLine());
        System.out.println("Digite o endereço da pessoa: ");
        c.setEndereco(scan.nextLine());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/aaaa");
        System.out.println("Digite a data do seu aniversario da seguinte forma. Ex:dd/mm/aaaa\n: ");
        String dataRecebida = scan.nextLine();
        Date dataFormatada = formato.parse(dataRecebida);
        c.setDataAniversario(dataFormatada);
        pessoas.add(c);
    }
}
