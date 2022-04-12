package VO;

public class Amount
{
    private int value;


    public Amount(int amount) {
    }

    public static Amount amountOf(int amount){
        return  new Amount(amount);
    }

    public Amount adition(Amount amount){
        return amountOf(this.value +amount.value);
    }


}
