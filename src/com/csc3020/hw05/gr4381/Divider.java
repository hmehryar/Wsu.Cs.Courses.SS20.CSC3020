package csc3020.hw05.gr4381;

public class Divider extends CalculateBase {

    Divider(){
        super();
    }
    Divider(double lv, double rv) {
        super(lv, rv);
    }

    @Override
    protected void calculate() {
        if (getRightVal() == 0){
            System.out.println("Error: divide by 0");
            setResult(0);
        } else{
            setResult(getLeftVal() / getRightVal());
        }
    }
}
