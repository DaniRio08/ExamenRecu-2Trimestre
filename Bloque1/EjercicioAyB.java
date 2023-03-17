package Programación.JAVA.ExamenRecu2ºTrimestre.Bloque1;


public class EjercicioAyB {
    public static void main(String[] args) {
        char[] cuestionarioAlumno = {'a','b','b','d','d','a','c'};
        char[] clavesTest = {'a','c','b','d','d','a','d'};
        System.out.println("Has obtenido " + puntosCuestionario(cuestionarioAlumno, clavesTest)+ " puntos");
    }

    //Método ejercicio a) : recibe dos caracteres, si son iguales devuelve 2(entero), en caso contrario devuelve 0(entero).
    public static int puntosPregunta(char ru, char rc) {
        if (ru == rc) {
            return 2;
        } else {
            return 0;
        }
    }

    /*Método ejercicio b) : recibe dos arrays de caracteres una con las respuestas y otra con las claves. No se especifica que pasa
    cuando los arrays no són del mismo tamaño. Se usa el método del ejercicio a y se devuelve el total de puntos conseguidos al
    comparar los dos arrays*/
    public static int puntosCuestionario(char[] respuestas, char[] claves) {
        int puntos = 0;
        for (int i = 0; i < respuestas.length; i++) {
            puntos = puntos + puntosPregunta(respuestas[i], claves[i]);
        }
        return puntos;
    }
}