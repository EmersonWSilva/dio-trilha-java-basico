public class ResultadoEscolar {
    public static void main(String[] args) {
      int nota = 9;

      //IF ELSE comum
      // if(nota >= 7)
      //   System.out.println("Aprovado");

      // else if (nota >=5 && nota <7)
      //   System.out.println("Prova Recuperação");

      // else
      //   System.out.println("Reprovado");

      //Ternario
      String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

      System.out.println(resultado);
    }
}
