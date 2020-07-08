package hw04MidTermProject.ee7708;

public class Hw05Source {
    public static void main(String[] args) {

        //String Array representing equations which will be used later
        //to instantiate instances of the CalulateHelper class
        String[] calulationInputs = new String[]{
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        //A for loop to send the strings from the calulationInputs array to the CalculateHelper class.
        //We then immediately call the overloaded toString method to print the equation and result from the CalculateHelper class.
        for (String base : calulationInputs) {
            System.out.println(new CalculateHelper(base).toString());
        }
    }
}
