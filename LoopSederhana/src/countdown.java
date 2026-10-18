import java.util.Scanner;

public class countdown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        do {
            System.out.print(n + " ");
            n--;
        } while (n >= 1);
        System.out.println("\nStart!");
        in.close();
    }
}
