package entities;

public class CurrencyConvert {

    public static final double DOLLAR_PRICE = 5.44;
    public static final double IOF = 0.06;

    public static double convertReal(double dollar){
        double valor = DOLLAR_PRICE * dollar * IOF;
        return (DOLLAR_PRICE * dollar) + valor;
    }

}
