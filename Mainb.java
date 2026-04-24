public class Mainb {

    public static void main(String[] args) {

        int inicio = 2008;
        int fin = 2033;

        int primerAnioPrimo = buscarPrimerAnioPrimo(inicio, fin);

        mostrarResultados(primerAnioPrimo, inicio, fin);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;

        for (int divisor = 2; divisor <= numero - 1; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int buscarPrimerAnioPrimo(int inicio, int fin) {
        for (int anio = inicio; anio <= fin; anio++) {
            if (esPrimo(anio)) {
                return anio;
            }
        }
        return 0;
    }

    public static void mostrarResultados(int anioPrimo, int inicio, int fin) {
        System.out.println("El primer año primo encontrado es " + anioPrimo);

        if (anioPrimo % 2 == 0) {
            System.out.println("que es un año par");
        }

        if (anioPrimo > inicio && anioPrimo < fin) {
            System.out.println("y está comprendido entre " + inicio + " y " + fin);
        }
    }
}
