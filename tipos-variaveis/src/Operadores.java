public class Operadores {
  public static void main(String[] args) {
    // Operadores 5
    String nomeUM = "GLEYSON";
    String nomeDois = new String("GLEYSON");

    System.out.println(nomeUM.equals(nomeDois));

    int a, b;
    a = 6;
    b = 5;

    String resultado = a == b ? "verdadeiro" : "falso";

    System.out.println(resultado);

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 < numero2){
      System.out.println("a nossa condição é verdadeira");
    }

    System.out.println("numerUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("numeroUm é diferente a numeroDois? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("numeroUm é maior a numeroDois? " + simNao);

    //Operadores 6

    boolean condicao1 = true;
    boolean condicao2 = true;

    if(condicao1 && ( 7 > 4) ) {
      System.out.println("As duas condições são verdadeiras");
    }

    if(condicao1 || condicao2){
      System.out.println("Uma das condições é verdadeira");
    }
  }

}
