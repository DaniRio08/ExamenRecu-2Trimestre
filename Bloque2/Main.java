package Programación.JAVA.ExamenRecu2ºTrimestre.Bloque2;

public class Main {
    public static void main(String[] args) {

        Estudiante Dani = new Estudiante("Dani", 21, "43481383K", 'M', 62.3f, 170);
        System.out.println(Dani);
        Dani.calcularIMC();
        Dani.comprobarSexo('M');
        Dani.esMayorDeEdad();
    }
}
