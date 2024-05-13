import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        final int tam = 10;
        int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
        int[] numeros = new int[tam];
        int p = 3;
        int pos;

        Arrays.sort(num);
        pos = Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d esta no array? %s",p,pos > 0 ? "Sim" : "Não");

        // Arrays.sort(num);
        // Arrays.fill(numeros, 10);
        // System.arraycopy(num, 0, numeros, 0, tam);
        // Arrays.equals(num, numeros);
        // System.out.printf("Arrays sào iguais:%s", Arrays.equals(num, numeros) ? "Sim"
        // : "Não");

        // for (int n : numeros) {
        // System.out.printf("%d - ", n);
        // }

    }
}
