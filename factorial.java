public static long factorial(long n) {
    if (n == 0 || n == 1) {
        return 1; // the trivial case
    } else {
        return n * factorial(n - 1); // the recursive call
    }
}