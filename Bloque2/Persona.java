package Programación.JAVA.ExamenRecu2ºTrimestre.Bloque2;

public abstract class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo; //Aquí no sé muy bien como hacer que "hombre" sea una constante por defecto
    private float peso; //suponemos que nos lo dan en kilos
    private int altura; //suponemos que nos lo dan en centímetros

    //Constructor por defecto
    public Persona() {
        this.sexo = 'H';
    }
    //Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    //Constructor con todos los atributos
    public Persona(String nombre, int edad, String dni, char sexo, float peso, int altura) {
        this(nombre, edad, sexo);
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos
    public void calcularIMC() {
        float alturaMetros =  (altura/100.0f);
        double IMC = (peso/(Math.pow(alturaMetros, 2)));
        if (IMC < 18.5) {
            System.out.println("Está por debajo de su peso ideal.");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("Está en su peso ideal.");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println("Tiene sobrepeso.");
        } else {
            System.out.println("Tiene obesidad.");
        }
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public abstract void comprobarSexo(char sexo);


    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "años, dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
                + " kilos, altura=" + altura + " centímetros]";
    }
}