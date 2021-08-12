package caixaeletronico;
import java.util.Scanner;

public class menuOpcao extends Dados {
    int opcao;
    Scanner ler= new Scanner(System.in);
    
    void exibir(int opcao,String nome,double saldo, int qtdSaques){
        
        if(opcao == 1){
            extrato extrato1 = new extrato();
            extrato1.exibir(nome,saldo, qtdSaques);
        }else if(opcao == 2){
            Saque sacar1 = new Saque();
            sacar1.sacar(nome,saldo, qtdSaques);
        }else if(opcao == 3){
            deposito deposito1 = new deposito();
            deposito1.deposito(nome,saldo, qtdSaques);
        }else if(opcao == 0){
            System.out.println("Sair");
        }else{
            System.out.println("Opção inválida");
            listarMenu(nome,saldo, qtdSaques);
        }
        
    }
    void listarMenu(String nome, double saldo, int qtdSaques){
        
        System.out.println("<<< 1 - Extrato >>>");
        System.out.println("<<< 2 - Sacar >>>");
        System.out.println("<<< 3 - Deposito>>>");
        System.out.println("<<< 0 - Sair    >>>");
        
      
        System.out.println("Digite uma opção:");
        opcao = ler.nextInt();
        
        this.exibir(opcao, nome, saldo, qtdSaques);
        
    }
    
}
