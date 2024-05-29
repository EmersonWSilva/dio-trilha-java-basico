package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    //selecaoCandidatos();
    //imprimirSelecionados();
    String [] candidatos = {"FELIPE", "JOANA", "MARCIA", "PAULO", "JOAO"};
    for(String candidato: candidatos){
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentantivasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando)
        tentantivasRealizadas++;
      else
        System.out.println("Contato realizado com sucesso");
    }while(continuarTentando && tentantivasRealizadas < 3);

    if(atendeu)
      System.out.println("Conseguimos contato com " + candidato + " na " + tentantivasRealizadas + "tentativa");
    else
      System.out.println("Não conseguimos contato com " + candidato + ", numero maximo de tentativas atingido");

  }
  static void imprimirSelecionados() {
    String [] candidatos = {"FELIPE", "JOANA", "MARCIA", "PAULO", "JOAO"};

    System.out.println("Imprimindo a lista dfe candidatos informando o indice do elemento");

    for(int i = 0; i < candidatos.length; i++){
      System.out.println("O candidato de nº " + i + " é o " + candidatos[i]);
    }
  }

  static void selecaoCandidatos() {
    String [] candidatos = {"FELIPE", "JOANA", "MARCIA", "PAULO", "JOAO", "LUCAS", "GABRIEL", "VITOR", "OTAVIO", "MARIA"};

    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
      String candidato = candidatos[candidatosAtual];
      double salarioPretendido = valorPretendido();
      System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
      if(salarioBase >= salarioPretendido){
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatosAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800,2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    }else if(salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contra proposta");
    } else {
      System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }

  static boolean atender() {
    return new Random().nextInt(3)==1;
  }
}
