import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String test = scanner.nextLine();
        String[] testToArr = test.split("");
        String[] reverseArr = new String[testToArr.length];
        
        for (int i = testToArr.length - 1, j = 0; j < testToArr.length; i--, j++) {
            reverseArr[i] = testToArr[j];
        }
        
        if (Arrays.equals(testToArr, reverseArr)) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
