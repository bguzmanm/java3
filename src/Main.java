import java.util.Scanner;

public class Main {


    public static int[] registraEnteros(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de registros:");
        int largo = entrada.nextInt();
        int datos[] = new int[largo];
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingresa el número:");
            datos[i] = entrada.nextInt();
        }
        return datos;
    }
    public static String[] registraStrings(){
        System.out.println("Ingresa la cantidad de registros:");

        Scanner entrada = new Scanner(System.in);
        int largo = entrada.nextInt();
        entrada.nextLine();

        String datos[] = new String[largo];
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingresa la palabra");
            datos[i] = entrada.nextLine();
        }
        return datos;
    }

    public static void main(String[] args) {

        int edades[] = registraEnteros();

        System.out.println("Esto ingresaste:");
        muestraArreglo(edades);

        String nombres[] = registraStrings();

        muestraArreglo(nombres);

    }
    // muestraArreglo(int[])
    public static void muestraArreglo(int[] arreglo){
        for (int dato: arreglo) {
            System.out.println("[" + dato + "]");
        }
    }

    // muestraArreglo(String[])
    public static void muestraArreglo(String[] arreglo){
        for(String dato: arreglo){
            System.out.println("[" + dato + "]");
        }
    }
}