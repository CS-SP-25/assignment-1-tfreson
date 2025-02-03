    class state{
        private String name;

        public String getName(){
            return name;
        }

        public void showTax(double value){
            System.out.println("The sales tax for " + name + " is " + value);
        }
        public void setName(String name) {
            this.name = name;
        }


        public double compute(double value) {
            return 0;
        }
    }

