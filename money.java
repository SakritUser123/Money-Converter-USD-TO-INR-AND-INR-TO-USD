import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("This is the USD to INR converter!");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Would you like to start from USD or INR, type USD for Dollars and INR for rupees.Case Sensitive.");
        String choice = scanner.nextLine();
        if (choice.equals("USD")) {
            System.out.println("Enter Your value in this format (x.xx)");
            double aumont = scanner.nextDouble();
            double wal = aumont*84.84;
            double wals = Double.parseDouble(String.format("%.2f", wal));
            System.out.println("With the Current Exchnage rate of 1 USD to 84.84, INR "+ aumont + " dollars is " + aumont*84.84 + " rupees."+ "So, it would be approx " + wals + " rupees.");
            
        } else if (choice.equals("INR")) {
            System.out.println("Enter Your value in this format (x.xx)");
            double aumont = scanner.nextDouble();
            double val = aumont/84.84;
            double vals = Double.parseDouble(String.format("%.2f", val));

            System.out.println("With the Current Exchnage rate of 84.84 INR to 1 USD "+ aumont + " rupees is " + aumont/84.84 + " dollars."+"So, it would be approx. " + vals + " rupees");
        }
       

    }
}
