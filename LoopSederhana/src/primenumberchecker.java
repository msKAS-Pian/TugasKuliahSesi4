public class primenumberchecker {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = n >= 2; // Otomatis bernilai false jika di bawah 2

        for (int i = 2; i < n; i++) if (n % i == 0) isPrime = false;

        System.out.println(n + (isPrime ? " Adalah prime number" : " Bukanlah prime number"));
    }
}