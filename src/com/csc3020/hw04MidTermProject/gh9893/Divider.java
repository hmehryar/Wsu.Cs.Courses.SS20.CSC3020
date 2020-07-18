package hw04MidTermProject.gh9893;
class Divider extends CalculateBase
{

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    //calculate method for Devision
//implement here
    @Override
    public double calculate()
    {
        return this.result = this.leftVal/this.rightVal;
    }

}

