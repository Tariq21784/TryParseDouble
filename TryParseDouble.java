import java.util.Scanner;

class TryToParseDouble {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user_input;
        Double myDouble = 0.0;
        boolean cont = true;

        while (cont) {
            try {
                System.out.println("Type in a floating point number");
                user_input = scan.nextLine();
                myDouble = Double.parseDouble(user_input);
                cont = false;
            } catch (NumberFormatException e) {
                // The catch block forces the number to 0 and displays an appropriate error
                // message.
                System.out.println("0 Error! Only numbers are accepted");
                myDouble = 0.0;
            }
        }

        System.out.println("The floating point number is:\n" + myDouble);
    }
}