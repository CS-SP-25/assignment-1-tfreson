public class Hawaii extends state {
    double taxRate;
    String name;
    double value;
    salesTaxBehavior taxBehavior = new fourPercentTax();
    public Hawaii(String name,double value){
        this.value = value;
        this.name = name;
        this.taxRate = taxBehavior.compute(value);
    }

    @Override
    public void showTax(double value) {
        System.out.println("The sales tax on $" + value + " in " + name + " is $" + String.format("%.2f", taxRate));
    }
}
