public class CrecerArreglo {
    public static void main(String[] args){
        int largo = 10;
        int[] arr = new int[largo];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 90) + 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();

        int[] arr2 = new int[largo+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("[" + arr2[i] + "]");
        }
        System.out.println();
    }
}
