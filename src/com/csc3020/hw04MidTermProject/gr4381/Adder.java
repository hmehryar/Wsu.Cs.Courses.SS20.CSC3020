package csc3020.hw04MidTermProject.gr4381;

public class Adder extends CalculateBase{ // Inheritance 4.

    Adder(){
        super();
    };
    Adder(double lv, double rv) {
        super(lv, rv);
    }

    @Override
    protected void calculate() {
        setResult(getLeftVal() + getRightVal());
    }
}
