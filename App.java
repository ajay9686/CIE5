package CIE4;

public class App {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        double principal = 10000; // Example value
        double rate = 5.5;        // Example rate
        double time = 2;          // Example time in years

        double interest = calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest is: " + interest);
    }
}