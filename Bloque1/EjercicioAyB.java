package Programación.JAVA.ExamenRecu2ºTrimestre.Bloque1;


public class EjercicioAyB {
    public static void main(String[] args) {
        char[] cuestionarioAlumno = {'a','b','b','d','d','a','c'};
        char[] clavesTest = {'a','c','b','d','d','a','d'};
        System.out.println(puntosCuestionario(cuestionarioAlumno, clavesTest));
    }
    public static int puntosPregunta(char ru, char rc) {
        if (ru == rc) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int puntosCuestionario(char[] respuestas, char[] claves) {
        int puntos = 0;
        for (int i = 0; i < respuestas.length; i++) {
            puntos = puntos + puntosPregunta(respuestas[i], claves[i]);
        }
        return puntos;
    }
}