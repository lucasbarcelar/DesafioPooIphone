package iphone;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.aparelhoTelefonico.Telefone;
import iphone.navegadorInternet.Busca;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusical.Musica;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {

        AparelhoTelefonico telefone = new Telefone();
        NavegadorInternet google = new Busca();
        ReprodutorMusical player = new Musica();

        //ligando
        telefone.ligar(12345);

        //Adicionando as abas
        google.adicionarNovaAba("youtube");
        google.adicionarNovaAba("Twitch");
        //Exibindo e atualizando as abas
        google.exibirPagina("twitch");
        google.atualizarPagina("twitch");

        //Tocando musica
        player.tocarMusica();
        //Pausando a musica
        player.pausarMusica();
        //Selecionando a musica
        player.selecionarMusica("Forrozeia");
    }
}
