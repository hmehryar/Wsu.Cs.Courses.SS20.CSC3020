package csc3020.hw06.gr4381;

public class Multiplier extends CalculateBase {

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
