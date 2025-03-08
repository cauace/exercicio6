import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento (boleto, cartao, pix): ");
        String paymentType = scanner.nextLine().toLowerCase();

        try {
            PaymentStrategy payment = PaymentFactory.getPaymentMethod(paymentType);

            System.out.print("Digite o valor do pagamento: ");
            double amount = scanner.nextDouble();

            payment.processPayment(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
