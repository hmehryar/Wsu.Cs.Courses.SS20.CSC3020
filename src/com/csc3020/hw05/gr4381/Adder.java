package csc3020.hw05.gr4381;

public class Adder extends CalculateBase {

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
