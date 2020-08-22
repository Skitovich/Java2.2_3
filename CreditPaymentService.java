public class CreditPaymentService {
    public float calculate(int creditTerm) {
        float percent = 9.99f;
        int creditSum = 1_000_000;
        float loanRate = percent / 12 / 100;
        float loanRatePlusOne = 1 + loanRate;
        double pow = Math.pow(loanRatePlusOne, creditTerm);

        double coefLoanRate = (loanRate * pow) / (pow - 1);
        double monthlyPay = creditSum * coefLoanRate;
        return (float) monthlyPay;
    }

}






/*
1. Ставка по кредиту в месяц = годовая процентная ставка / 12 месяцев 20%/12 месяцев/100=0,017.

2. Коэффициент аннуитета = (0,017*(1+0,017)^36/((1+0,017)^36—1)=0,037184.

3. Ежемесячный аннуитетный платеж = 0,037184*1 000 000 рублей = 37 184 рубля.
20%/12 месяцев/100=0,017, по правилам округления
*/