import java.util.ArrayList;
import java.util.Date;

public class Coleccion {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();

        lista.add(9);
        lista.add(10);
        lista.add("poto");
        lista.add(new Date());

        System.out.println(lista);

        lista.remove(2);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        /* for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + lista.get(i) + "]");
        }*/

    }
}
