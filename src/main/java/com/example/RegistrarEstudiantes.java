package main.java.com.example;
import java.util.Scanner;

public class RegistrarEstudiantes {


static String [] nombres = new String[100];
static int [] edades = new int[100];
static double [] notas = new double[100];
static int contador = 0;
static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

    }

    public static void registrarEstudiante(){
        System.out.println("Por favor ingresa el nombre: ");
        nombres[contador] = sc.nextLine();

        System.out.println("Por favor ingresa la edad: ");
        edades[contador] = sc.nextInt();
        System.out.println("Por favor ingresa la calificacion: ");
        notas[contador] = sc.nextDouble();

        contador ++;

    }

    public static  void mostrarEstudiantes(){
        for (int i = 0; i < contador; i++){
            System.out.println(nombres[i] + "-" + edades[i] + "-" + notas[i]);
        }
    }

    
}
