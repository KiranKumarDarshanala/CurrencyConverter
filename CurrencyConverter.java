import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdToEurRate = 0.85;
        double eurToUsdRate = 1.18;
        double usdToInrRate = 74.57;
        double inrToUsdRate = 0.013;
        double eurToInrRate = 88.18;
        double inrToEurRate = 0.011;

        System.out.println("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the source currency (USD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();
        System.out.println("Enter the target currency (USD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = 0;

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            convertedAmount = amount * usdToEurRate;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            convertedAmount = amount * eurToUsdRate;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            convertedAmount = amount * usdToInrRate;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            convertedAmount = amount * inrToUsdRate;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            convertedAmount = amount * eurToInrRate;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            convertedAmount = amount * inrToEurRate;
        } else {
            System.out.println("Invalid currency input.");
            return;
        }

        System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
    }
}
