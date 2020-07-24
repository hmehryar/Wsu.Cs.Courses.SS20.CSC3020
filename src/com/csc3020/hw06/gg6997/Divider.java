package csc3020.hw06.gg6997;


//Class extends to take values given and calculate needed operation
public class Divider extends csc3020.hw06.gg6997.CalculateBase {

    //constructor uses super to refer to parent object CalculateBase's values
    public Divider(double leftValue, double rightValue) {
        super(leftValue, rightValue);
    }

    //calculate method for addition
    //override needed to tell compiler we are overriding the method, not making a new method
    //override the calculate method instantiated in CalculateBase to do division
    @Override
    public void calculate() {
        //checks for divide by 0 and avoids throwing number exception
        if(getRightValue()==0){
            setResult(0);
            return;
        }
        double value=getLeftValue()/getRightValue();
        setResult(value);
    }
}
