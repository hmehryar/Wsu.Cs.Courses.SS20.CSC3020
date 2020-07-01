package csc3020.hw04MidTermProject.gr4381;

public class Subtractor extends CalculateBase{ // Inheritance 5.

    Subtractor(){
        super();
    };
    Subtractor(double lv, double rv) {
        super(lv, rv);
    }

    @Override
    protected void calculate() {
        setResult(getLeftVal() - getRightVal());
    }
}
