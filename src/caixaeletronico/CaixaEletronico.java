
package caixaeletronico;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        menuOpcao menu = new menuOpcao();
        int qtdSaques = 0;
        
        System.out.println("Informe seu nome..:");
        String nome = ler.nextLine();
        
        System.out.println("Informe o saldo inicial..:");
        double saldo = ler.nextDouble();
        
        System.out.println("==================================================");
        System.out.println("============= Caixa Eletronico ===================");
        System.out.println("==================================================");
        
        menu.CadastroPessoa(nome, saldo);
        int opcao = 0;
        menu.listarMenu(nome, saldo, qtdSaques);
              
    
    }
}
