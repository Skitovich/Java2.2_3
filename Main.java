public class Main {
    public static void main(String[] args) {
        CreditPaymentService  service = new CreditPaymentService ();
        float index = service.calculate(12);
        System.out.println(index);

        float index1 = service.calculate(24);
        System.out.println(index1);

        float index2 = service.calculate(36);
        System.out.println(index2);
    }
}
