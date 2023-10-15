package iphone.navegadorInternet;

import java.util.List;

public class Internet {

    private String aba;

    public Internet(String aba) {
        this.aba = aba;
    }

    public String getAba() {
        return aba;
    }

    @Override
    public String toString() {
        return aba;
    }
}
