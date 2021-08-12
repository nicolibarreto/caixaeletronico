package caixaeletronico;

        
public class extrato extends Dados {
    double extrato;
    
    void exibir (String nome, double saldo, int qtdSaques){
        System.out.println("nome "+nome);
        System.out.println("saldo "+saldo);
        
        menuOpcao menu = new menuOpcao();
        menu.listarMenu(nome, saldo, qtdSaques);
    }

  
              
}
