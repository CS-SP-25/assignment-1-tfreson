import java.util.Objects;
import java.util.Scanner;


public class SalesTaxCalculator{
    public static void main(String[] args) {

        String state = args[0];
        double value = Double.parseDouble(args[1]);
        if(state.equals("alaska")){
            alaska alaska = new alaska(state,value);
            alaska.showTax(value);
        }
        else if(state.equals( "hawaii")){
            Hawaii hawaii = new Hawaii(state,value);
            hawaii.showTax(value);
        }
        else if(state.equals("indiana")){
            indiana indiana = new indiana(state,value);
            indiana.showTax(value);
        }
        else{
            System.out.println("Invalid state");
        }
    }

}
