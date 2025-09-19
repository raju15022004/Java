public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12)); // Output: false
        System.out.println(isPrime(7));  // Output: true
    }
}
