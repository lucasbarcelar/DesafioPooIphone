package iphone.aparelhoTelefonico;

import java.util.Random;

public class Telefone implements AparelhoTelefonico {

    public void ligar(int numeroDeTelefone) {
        System.out.println("Chamando numero " + numeroDeTelefone);
        atender();
    }

    private void atender() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(2);

        if (numeroAleatorio == 0) {
            System.out.println("Atendeu");
        } else {
            System.out.println("Não atendeu");
            iniciarCorreioVoz();
        }
    }

    private void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado...");
    }
}
