package csc3020.hw04MidTermProject.gr4381;

public class Divider extends CalculateBase{ // Inheritance 7.

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
