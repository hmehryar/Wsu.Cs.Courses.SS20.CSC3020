package csc3020.hw06.gr4381;

public class Subtractor extends CalculateBase {

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
