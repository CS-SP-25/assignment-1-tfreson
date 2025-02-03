public class alaska extends state{
    double taxRate;
    String name;
    double value;
    salesTaxBehavior taxBehavior = new noTax();
    public alaska(String name,double value){
        this.value = value;
        this.name = name;
        this.taxRate = taxBehavior.compute(value);
    }

    // limit taxrate to two decimal places
    public double round(double value){
        return Math.round(value * 100.0) / 100.0;
    }
    @Override
    public void showTax(double value) {
        System.out.println("The sales tax on $"+ value +" in "+ name + " is $" + String.format("%.2f", taxRate));
    }
}
