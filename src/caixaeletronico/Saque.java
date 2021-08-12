
package caixaeletronico;
import java.util.Scanner;

public class Saque extends Dados{
    Scanner ler = new Scanner(System.in);
    double valor;
    double saldoAtual;
	
    void sacar(String nome,double saldo, int qtdSaques){
        
        System.out.println("Digite o valor do saque");
        valor = ler.nextDouble();
        
        System.out.println("==================================================");
        System.out.println("============= Caixa Eletronico ===================");
        System.out.println("==================================================");
        
        
        if(valor<saldo){
			if(qtdSaques <=4) {
                                System.out.println("teste mostra qnt saque" + qtdSaques);
				saldoAtual = saldo-valor;
				qtdSaques++;
                                System.out.println("teste mostra qnt saque" + qtdSaques);
				System.out.println("nome "+nome);
				System.out.println("O valor do saque :"+valor);
				System.out.println("saldo atual :"+saldoAtual);
                                menuOpcao menu = new menuOpcao();
                                menu.listarMenu(nome, saldoAtual, qtdSaques);
			} else {
                            System.out.println("Você atingiu o limite diario de saques");
			}
        }
        System.out.println("Você não tem saldo suficiente para esse saque");
        System.out.println("Saldo atual: " + saldo);
        menuOpcao menu = new menuOpcao();
        menu.listarMenu(nome, saldo, qtdSaques);
    }
}


