public class Mainb {
    public static void main(String[] args) {
        int añoPrimo = 0;
        int añoIncial = 2008;
        while (añoIncial <= 2033) {
            if (añoPrimo == 0) {
                boolean esPrimo = true;
                for (int i = añoIncial - 1; i > 1; i--) {
                    if (añoIncial % i == 0) {
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    añoPrimo = añoIncial;
                }
            }
            añoIncial++;
            continue;
        }
        System.out.println("El primer año primo encontrado es " + añoPrimo);
        if (añoPrimo % 2 != 0) {
        } else System.out.println("que es un año par");
        if (añoPrimo > 2008) {
            if (añoPrimo < 2033) {
                System.out.println("y está comprendido entre 2008 y 2033");
            }

        }
        return;
    }
}