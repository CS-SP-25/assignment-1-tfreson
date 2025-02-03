public class noTax implements salesTaxBehavior{
    @Override
    public double compute(double value) {
        return 0.0*value;
    }
}
