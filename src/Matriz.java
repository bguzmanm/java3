import java.util.Scanner;

public class Matriz {

    public static int leerEntero(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static int[][] dimensiona(){
        int filas = leerEntero("Ingresa la cantidad de filas que requieres:");
        int columnas = leerEntero("Ingresa la cantidad de columnas que requieres:");

        return new int[filas][columnas];
    }

    public static void buscarOcurrencias(int[][] matriz){
        int num = leerEntero("Ingresa un número a buscar");
        int cantidad = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if (num == matriz[i][j]){
                    cantidad++;
                }
            }
        }
        System.out.println(num + " se repite " + cantidad + " veces.");
    }

    public static int[][] llena(int[][] matriz){
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return matriz;
    }
    public static void muestra(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int notas[][] = dimensiona();
        notas = llena(notas);
        muestra(notas);

        buscarOcurrencias(notas);


        System.out.println("Ahora ordenada de menor a mayor");
        notas = menorAMayor(notas);
        muestra(notas);



    }



    public static int[][] menorAMayor(int[][] matriz){
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz[k].length; l++) {
                        if (matriz[i][j]<matriz[k][l]){
                            aux = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = aux;
                        }
                    }
                }
            }
        }
        return matriz;
    }
}
