package Programación.JAVA.ExamenRecu2ºTrimestre.Bloque2;

public class Estudiante extends Persona{
        
    public Estudiante(String nombre, int edad, String dni, char sexo, float peso, int altura) {
        super(nombre, edad, dni, sexo, peso, altura);
    }

    public void comprobarSexo(char sexo) {
        if (sexo == 'M') {
            System.out.println("Es un hombre");
        } else {
            System.out.println("Es una mujer");
        }
    }
}
