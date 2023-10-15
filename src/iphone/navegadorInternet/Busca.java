package iphone.navegadorInternet;

import java.util.ArrayList;
import java.util.List;

public class Busca implements NavegadorInternet {

    private List<Internet> internetList;

    public Busca() {
        this.internetList = new ArrayList<>();
    }

    public void adicionarNovaAba(String aba) {
        Internet internet = new Internet(aba);
        this.internetList.add(internet);
    }

    public void exibirPagina(String aba) {
        Internet abaParaExibir = null;
        if (!internetList.isEmpty()) {
            for (Internet i : internetList) {
                if (i.getAba().equalsIgnoreCase(aba)) {
                    abaParaExibir = i;
                    System.out.println("Aba atual: " + abaParaExibir);
                }
            }
        }
    }

    public void atualizarPagina(String aba){
        Internet abaParaExibir = null;
        if (!internetList.isEmpty()) {
            for (Internet i : internetList) {
                if (i.getAba().equalsIgnoreCase(aba)) {
                    abaParaExibir = i;
                    System.out.println("Aba: " + abaParaExibir + " atualizada.");
                }
            }
        }
    }
}
