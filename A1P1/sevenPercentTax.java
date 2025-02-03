public class sevenPercentTax implements salesTaxBehavior{
    @Override
    public double compute(double value) {
        return 0.07*value;
    }
}
