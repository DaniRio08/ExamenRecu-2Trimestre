package Programación.JAVA.ExamenRecu2ºTrimestre.Bloque1;

public class EjercicioC {

    //Main para probar el método
    public static void main(String[] args) {
        int[] dominió = {6};
        //Imprime true o false
        System.out.println(esPseudoDominio(dominió));
    }
    public static boolean esPseudoDominio(int[] nums) {
        //Si solo hay un par se cumple que es un Pseudodominio
        if (nums.length == 2) {
            return true;
        //Si no hay un número par de números no se cumple que es un Pseudodomino
        } else if (nums.length % 2 != 0) {
            return false;
        /*Con un bucle for que empiece en la segunda posición(nums[1]), que vaya de dos en dos y que no tenga en cuenta las dos últimas
        posiciones del array, hacemos que se compruebe si el número actual del array no es igual al siguiente, en cuyo caso no es 
        un Pseudodominio*/
        } else {
            for (int i = 1; i < nums.length -2; i+=2) {
                if (nums[i] != nums[i+1]) {
                    return false;
                }
            }
        }
        //En el resto de casos si que será un Pseudodominio
        return true;
    }
}
