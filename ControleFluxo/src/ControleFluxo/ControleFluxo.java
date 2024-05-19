package ControleFluxo;
import java.util.concurrent.ThreadLocalRandom;

public class ControleFluxo {
    public static void main(String[] args) {
        int salarioBase = 2000; // Salário base em reais
        int salarioPretendido = 1800; // Salário pretendido pelo candidato em reais
        
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        
        int candidatosSelecionados = 0;
        for (String candidato : candidatos) {
            if (valorPretendido1() <= 2200 && candidatosSelecionados < 5) {
                System.out.println(candidato + " selecionado para entrevista.");
                candidatosSelecionados++;
            }
        }
    }

    static double valorPretendido1() {
        return ThreadLocalRandom.current().nextDouble(1800, 2201);
    }

    	public static void main1(String[] args) {
    String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    
    int candidatosSelecionados = 0;
    System.out.println("Candidatos selecionados para entrevista:");
    for (String candidato : candidatos) {
        if (valorPretendido1() <= 2200 && candidatosSelecionados < 5) {
            System.out.println(candidato);
            candidatosSelecionados++;
        }
    }
}

    	static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2201);
}

    
	public static void main2(String[] args) {
    String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

    for (String candidato : candidatos) {
        int tentativas = 0;
        while (tentativas < 3) {
            if (tentativaDeContato(candidato)) {
                System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " APÓS " + (tentativas + 1) + " TENTATIVA(S)");
                break; // Sai do loop while após conseguir contato
            } else {
                tentativas++;
            }
        }
        if (tentativas == 3) {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato);
        }
    }
}

static boolean tentativaDeContato(String candidato) {
    // Simula uma tentativa de contato com uma chance de 50% de sucesso
    return Math.random() < 0.5;
}
}

