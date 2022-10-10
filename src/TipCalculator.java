public class TipCalculator {
    //instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    //constructor
    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    //methods
    public double getTotalBillBeforeTip(){
        return totalBillBeforeTip;
    }

    public int getTipPercentage(){
        return tipPercentage;
    }

    public void addMeal (double cost){
        totalBillBeforeTip += cost;
    }

    public double tipAmount(){
        return totalBillBeforeTip * (tipPercentage / 100);
    }

    public double totalBill(){
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount(){
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost(){
        return totalBill() / numPeople;
    }
}
