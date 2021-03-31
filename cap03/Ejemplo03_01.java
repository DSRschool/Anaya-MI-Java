public class Ejemplo03_01 {
    public static void main(String[] args) {
        int temp = Integer.valueOf(args[0]);
        System.out.print("La temperatura es de ");
        if (temp > 0) {
            System.out.println(temp + "ºC positivos.");
        } else {
            System.out.println(temp + "ºC bajo cero.");
        }
    }
}