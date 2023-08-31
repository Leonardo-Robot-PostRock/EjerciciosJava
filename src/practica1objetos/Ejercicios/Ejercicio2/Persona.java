package practica1objetos.Ejercicios.Ejercicio2;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private char letraDNI;
    private int dni;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.letraDNI = generaLetraDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, int dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura) {
        double indiceMasaCorporal = (peso / (Math.pow(altura, 2)));
        if (indiceMasaCorporal < 20) {
            return -1;
        } else if (indiceMasaCorporal >= 20 && indiceMasaCorporal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    private int generaDNI() {
        Random random = new Random();
        return random.nextInt(90000000) + 10000000;
    }

    private char generaLetraDNI() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(this.dni % 23);
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("DNI: " + this.letraDNI + this.dni);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }
}
