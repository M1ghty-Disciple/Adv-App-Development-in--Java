import java.util.Scanner;

class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for two integer numbers
        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        // Ask the user to choose an operation
        System.out.println("Choose an operation: +, -, /, %, &, |, ^, ?");

        String op = input.next();
        switch (op) {
            case "+":
                int sum = a + b;
                System.out.println("Result: " + sum);
                break;

            case "-":
                int diff = a - b;
                System.out.println("Result: " + diff);
                break;

            case "*":
                int prod = a * b;
                System.out.println("Result: " + prod);
                break;

            case "/":

                if (b != 0) {
                    int quot = a / b;
                    System.out.println("Result: " + quot);
                } else
                    System.out.println("Cannot divide by zero");
                break;

            case "%":
                if (b != 0) {
                    int quot = a % b;
                    System.out.println("Result: " + quot);
                } else
                    System.out.println("Cannot divide by zero");
                break;

            case "&":
                int and = a & b;
                System.out.println("Result: " + and);
                break;

            case "|":
                int or = a | b;
                System.out.println("Result: " + or);
                break;

            case "^":
                int xor = a ^ b;
                System.out.println("Result: " + xor);
                break;

            case "?":
                int max = (a > b) ? a : b;
                System.out.println("Result: " + max);
                break;

        }
    }
}