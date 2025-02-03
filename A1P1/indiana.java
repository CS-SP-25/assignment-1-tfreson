public class indiana extends state{
    double taxRate;
    String name;
    double value;
    salesTaxBehavior taxBehavior = new sevenPercentTax();

    public indiana(String name,double value){
        this.value = value;
        this.name = name;
        this.taxRate = taxBehavior.compute(value);
    }


    @Override
    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.println(String.format("The sales tax on $" + value + " in " + name + " is $" + String.format("%.2f", tax)));
    }
}
