package main.java.com.example;
import java.util.Scanner;

public class RegistrarEstudiantes {


static String [] nombres = new String[100];
static int [] edades = new int[100];
static double [] notas = new double[100];
static int contador = 0;
static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
int opcion;
do {
mostrarMenu();
opcion = sc.nextInt();
sc.nextLine();
switch (opcion){
    case  1:
        registrarEstudiante();
        break;
    case 2:
        mostrarEstudiantes();
        break;
    case 3:
        buscarEstudiante();
        break;

    case 4:
        calcularPromedio();
        break;

    case 5:
       System.out.println("Saliendo del sistema");
        break;

    default:
        System.out.println("Opcion invalida");
        break;
}


}while (opcion != 5);


    }
    public static void mostrarMenu(){
        System.out.println(" \n ***Menu Principal ***");
        System.out.println("1. Registrar estudiante");
        System.out.println("3. Mostrar estudiante");
        System.out.println("4. Promedio de notas");
        System.out.println("5. Salir del  sistema");
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

    public static void  buscarEstudiante(){
        System.out.println("Nombre a bucar: ");
        String nombreBuscar = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < contador; i++){
            if (nombres[i].equalsIgnoreCase(nombreBuscar)){
                System.out.println("Registro encontrado");
                System.out.println(nombres[i]);
                encontrado = true;

            }
        }

        if (!encontrado){
            System.out.println("Registro no encontrado");
        }
    }

    public static void calcularPromedio(){
        double suma = 0;
        for (int i = 0; i < contador; i++){
            suma += notas[i];
        }

        double promedio = suma / contador;
        System.out.println("Promedio : "+ promedio);
    }
}
