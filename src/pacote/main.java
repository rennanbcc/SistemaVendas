package pacote;

import pacote.Controller.ControllerPessoa;
import pacote.Controller.ControllerProduto;
import pacote.Controller.ControllerVenda;

import java.util.Scanner;

public class main {
    menu();
    Scanner scan = new Scanner(System.in);
    int opcao = scan.nextInt();
    Switch(opcao){
        case 1 : {
            System.out.println("Digite o nome do cliente:");
            Scanner scan = new Scanner(System.in);
            String inf = scan.nextLine();
            if(existePessoa(inf)==true) {
                addPessoa();
        }
        case 2: {

        }
        case 3: {
            System.out.println("Digite o nome do vendedor:");
            Scanner scan = new Scanner(System.in);
            String inf = scan.nextLine();
            if(existePessoa(inf)==true) {
                addPessoa();
        }
        case 4: {

        }
        case 5: {
            System.out.println("Digite o nome do produto:");
            Scanner scan = new Scanner(System.in);
            String inf = scan.nextLine();
            if(existeProduto(inf)==true) {
                addProduto();
            }
        }
        case 6: {

        }
        case 7: {
            Scanner scan = new Scanner();
            System.out.println("Digite o cpf do cliente:");
            String inf1 = scan.nextLine();
            if(existePessoa(inf)== true){
                buscarPessoa(inf);
            }
            System.out.println("Digite o nome do produto:");
            String inf2 = scan.nextLine();
            if(existeProduto(inf2)== true){
                buscarProduto(inf2);
            }
            System.out.println("Digite o nome do vendedor:");
            String inf3 = scan.nextLine();
            if(existeVendedor(inf3)== true){
                buscarVendedor(inf3);
            }
            System.out.println("Digite a quantidade do produto comprado:");
            int qnt = scan.nextInt();
            addVenda(buscarPessoa(inf),buscarProduto(inf2),buscarVendedor(inf3),int qtd);
        }
            case 8: {
                
            }
    }
}
