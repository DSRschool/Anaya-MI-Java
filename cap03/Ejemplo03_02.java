public class Ejemplo03_02 {
    public static void main(String[] args) {
        int temp = Integer.valueOf(args[0]); 
        if (haceFrio(temp)) {
            ponerCalefaccion();
            abrigarse();
        }
    }

    private static boolean haceFrio(int temp) {
        return temp <= 15;
    }

    private static void ponerCalefaccion() {
        System.out.println("Calefacción a tope!!");
    }

    private static void abrigarse() {
        System.out.println("¿Dónde está mi batamanta?");
    }
}