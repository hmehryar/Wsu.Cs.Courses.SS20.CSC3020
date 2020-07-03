package hw04MidTermProject.gg6997;

//Class extends to take values given and calculate needed operation
class Multiplier extends hw04MidTermProject.gg6997.CalculateBase {

    //constructor uses super to refer to parent object CalculateBase's values
    public Multiplier(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    //calculate method for addition
    //override needed to tell compiler we are overriding the method, not making a new method
    //override the calculate method instantiated in CalculateBase to do multiplication
    @Override
    public double calculate(){
        return this.result = this.leftVal * this.rightVal;
    }
}