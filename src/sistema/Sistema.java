package sistema;

import funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidades.aparelhoTelefonico.Atender;
import funcionalidades.aparelhoTelefonico.Ligar;

public class Sistema {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new Ligar();

        aparelhoTelefonico.ligar();

    }
}
