//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hw04MidTermProject.gh9893;

class Hw04MidTermSource {
    Hw04MidTermSource() {
    }

    public static void main(String[] args) {
        MathEquation math = new MathEquation('d');
        CalculateBase[] calculators = new CalculateBase[4];
        calculators[0] = new Divider(100.0D, 50.0D);
        double division = calculators[0].calculate();
        calculators[1] = new Adder(25.0D, 92.0D);
        double addition = calculators[1].calculate();
        calculators[2] = new Subtractor(225.0D, 17.0D);
        double subtraction = calculators[2].calculate();
        calculators[3] = new Multiplier(11.0D, 3.0D);
        double multiplication = calculators[3].calculate();
        System.out.println("\nUsing Inheritance");
        System.out.println("\nresult=" + division);
        System.out.println("\nresult=" + addition);
        System.out.println("\nresult=" + subtraction);
        System.out.println("\nresult=" + multiplication);
    }
}
