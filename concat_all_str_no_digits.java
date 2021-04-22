import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        
        // initialize StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // convert arr to sb
        for (String element : strings) {
            sb.append(element);
        }

        return sb.toString().replaceAll("\\d", "").replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
