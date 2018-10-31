import java.util.Scanner;

public class LumpedArr {

    public static void main(String[] args) {
        int[] a1 = new int[3];
        int[] a2 = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a1["+i+"]: ");
            a1[i]=sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a2["+i+"]: ");
            a2[i]=sc.nextInt();
        }
        int[] a3 = new int[a1.length + a2.length];

        for (int i = 0; i < 3; i++) {
            a3[i]=a1[i];
        }

        for (int i = 3; i < a3.length; i++) {
            a3[i]=a2[i-3];
        }

        for(int x : a3){
            System.out.print(x+"\t");
        }
    }

}