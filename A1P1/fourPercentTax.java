public class fourPercentTax implements salesTaxBehavior{
    @Override
    public double compute(double value) {
        return 0.045*value;
    }
}
