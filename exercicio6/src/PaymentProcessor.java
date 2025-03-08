import java.util.Scanner;

public class PaymentProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento (boleto, cartao, pix): ");
        String paymentType = scanner.nextLine();

        PaymentStrategy payment = PaymentFactory.getPaymentMethod(paymentType);

        System.out.println("Digite o valor do pagamento: ");
        double amount = scanner.nextDouble();

        payment.processPayment(amount);
    }
}
