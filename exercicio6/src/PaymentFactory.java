public class PaymentFactory {
    public static PaymentStrategy getPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "boleto":
                return new BoletoPayment();
            case "cartao":
                return new CreditCardPayment();
            case "pix":
                return new PixPayment();
            default:
                throw new IllegalArgumentException("Método de pagamento inválido!");
        }
    }
}
