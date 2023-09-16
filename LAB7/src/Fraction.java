public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction () {

        this.numerator = 0;
        this.denominator = 0;
    }

    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {

        return numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public void setNumerator(int numerator) {

        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {

        this.denominator = denominator;
    }

    public String toString() {

        return numerator+"/"+denominator;
    }

    public void add(Fraction fraction) {

        int numres = this.numerator*fraction.denominator + fraction.numerator*this.denominator;
        int denomres = this.denominator*fraction.denominator;

        if (numres==denomres) {

            System.out.println(this.toString()+" + "+fraction.toString()+" = 1");
        }
        else {

            System.out.println(this.toString()+" + "+fraction.toString()+" = "+numres+"/"+denomres);
        }
    }

    public void subtract(Fraction fraction) {

        int numres = (this.numerator*fraction.denominator) - (fraction.numerator*this.denominator);
        int denomres = this.denominator * fraction.denominator;

        if (numres==denomres) {

            System.out.println(this.toString()+" + "+fraction.toString()+" = 1");
        }
        else {

            System.out.println(this.toString()+" - "+fraction.toString()+" = "+numres+"/"+denomres);
        }
    }

    public void multiplication(Fraction fraction) {

        int numres = this.numerator * fraction.numerator;
        int denomres = this.denominator * fraction.denominator;

        if (numres==denomres) {

            System.out.println(this.toString()+" + "+fraction.toString()+" = 1");
        }
        else {

            System.out.println(this.toString()+" x "+fraction.toString()+" = "+numres+"/"+denomres);
        }
    }

    public void division(Fraction fraction) {

        int numres = this.numerator * fraction.denominator;
        int denomres = this.denominator * fraction.numerator;

        if (numres==denomres) {

            System.out.println(this.toString()+" ÷ "+fraction.toString()+" = 1");
        }
        else {

            System.out.println(this.toString()+" ÷ "+fraction.toString()+" = "+numres+"/"+denomres);
        }
    }


    public static void main(String[] args) {
        
        Fraction f1 = new Fraction();

        f1.setNumerator(1);
        f1.setDenominator(2);

        Fraction f2 = new Fraction(1,2);

        System.out.println("\nThe fractions we will be using are: "+f1.getNumerator()+"/"+f1.getDenominator()+" and "+f2.getNumerator()+"/"+f2.getDenominator()+"\n");

        System.out.println();

        f1.add(f2);

        System.out.println();

        f1.subtract(f2);

        System.out.println();

        f1.multiplication(f2);

        System.out.println();

        f1.division(f2);

        System.out.println();

    }
    
}
