package csc3020.hw04MidTermProject.gr4381;

public class Multiplier extends CalculateBase{ // Inheritance 6.

    Multiplier(){
        super();
    };
    Multiplier(double lv, double rv) {
        super(lv, rv);
    }

    @Override
    protected void calculate() {
        setResult(getLeftVal() * getRightVal());
    }
}
