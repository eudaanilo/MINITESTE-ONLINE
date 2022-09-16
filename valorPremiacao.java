import java.util.Scanner;

public class valorPremiacao{
  public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   float premio= 0, juros=0, retirada= 0;
   int contador = 0; 
   float porcentagem = 0;
    
    System.out.println("\nPERGUNTAS: ");
    System.out.println("\nQual o valor do premio? ");
    premio = s.nextFloat();
   
    System.out.println("\nQual o valor do juros mensais? ");
    juros = s.nextFloat();
   
    System.out.println("\nQual a porcentagem que será tirada do investimento mensal? ");
    retirada = s.nextFloat();
    
    while(premio > 1000){
      porcentagem = (juros/100) * premio;
      premio = porcentagem + premio;
      porcentagem = (retirada/100) * premio;
      premio = premio - porcentagem; 
      contador += 1;
    }
    System.out.println("\nRESULTADOS: ");
    System.out.println("\nSerá necessário "+ contador + " meses pro saldo do investimento ser  menor que R$1.000.");
    System.out.println("\nEm " + contador + " meses o saldo final cujo investimento foi de R$" + premio);
    System.out.println("\nRESULTADO FINAL: ");
    System.out.println("\n---------------------------------------");
    System.out.println("O valor total do prêmio é de R$" + premio);
    s.close();
  } 
}