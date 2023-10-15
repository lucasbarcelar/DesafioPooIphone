package iphone.reprodutorMusical;

public class Musica implements ReprodutorMusical{

    public void tocarMusica() {
        System.out.println("tocando musica.");
    }

    public void pausarMusica() {
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica(String nomeMusica) {
        System.out.println("Tocando " + nomeMusica + ".");
    }
}
