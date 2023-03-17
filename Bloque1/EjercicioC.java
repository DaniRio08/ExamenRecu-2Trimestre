package Programación.JAVA.ExamenRecu2ºTrimestre.Bloque1;

public class EjercicioC {
    public static void main(String[] args) {
        int[] dominió = {6,3,3,4,4,5,5,6,6,7,3};
        if (esPseudoDominio(dominió)) {
            System.out.println("Es un pseudodominió");
        } else {
            System.out.println("No es un pseudodominió");
        }
    }
    public static boolean esPseudoDominio(int[] nums) {
        if (nums.length < 3) {
            return true;
        } else if (nums.length % 2 != 0) {
            return false;
        } else {
            for (int i = 1; i < nums.length -2; i+=2) {
                if (nums[i] != nums[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
