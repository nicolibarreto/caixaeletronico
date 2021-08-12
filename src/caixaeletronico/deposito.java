package caixaeletronico;
import java.util.Scanner;

public class deposito extends Dados{
    Scanner ler = new Scanner(System.in);
    double valorDeposito;
    double saldoAtual;
	
	
    void deposito(String nome,double saldo,int qtdSaques){
        
        System.out.println("Digite o valor do seu deposito");
        valorDeposito = ler.nextDouble();
        
        System.out.println("==================================================");
        System.out.println("============= Caixa Eletronico ===================");
        System.out.println("==================================================");
        
        if(valorDeposito>0){
            saldoAtual = saldo+valorDeposito;
           System.out.println("nome :"+nome);
           System.out.println("O valor do deposito :"+valorDeposito);
           System.out.println("saldo atual :"+saldoAtual);
           menuOpcao menu = new menuOpcao();
           menu.listarMenu(nome, saldoAtual, qtdSaques);
        }
       menuOpcao menu = new menuOpcao();
       menu.listarMenu(nome, saldo, qtdSaques);
    }
}

			
        
    


