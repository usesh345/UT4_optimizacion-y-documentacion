/**
 * The type Mainb.
 */
public class Mainb {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int inicio = 2008;
        int fin = 2033;

        int primerAnioPrimo = buscarPrimerAnioPrimo(inicio, fin);

        mostrarResultados(primerAnioPrimo, inicio, fin);
    }

    /**
     * Es primo boolean.
     *
     * @param numero the numero
     * @return the boolean
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;

        for (int divisor = 2; divisor <= numero - 1; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Buscar primer anio primo int.
     *
     * @param inicio the inicio
     * @param fin    the fin
     * @return the int
     */
    public static int buscarPrimerAnioPrimo(int inicio, int fin) {
        for (int anio = inicio; anio <= fin; anio++) {
            if (esPrimo(anio)) {
                return anio;
            }
        }
        return 0;
    }

    /**
     * Mostrar resultados.
     *
     * @param anioPrimo the anio primo
     * @param inicio    the inicio
     * @param fin       the fin
     */
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
