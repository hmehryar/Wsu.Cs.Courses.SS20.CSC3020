package lecture11.gn8271;
//Lecture 11
// Author: Raisa Zaman
public class Lecture11Source {
    public static void main(String[] args) {

        // String Class
        String name =  "Jim";
        System.out.println("Hi " + name);

        String greeting = "Hello";
        greeting += " ";
        greeting += "World";
        System.out.println(greeting);
        greeting.length();
        Integer count = 1;

        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";
        boolean equal = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    equal = false;
                    System.out.println("They are NOT equal");
                }
            }
        }
        String s3 = s1.intern();
        String s4 = s2.intern();

        if (s1.length() == s2.length()) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are NOT equal");
        }

        if (s1.equals(s2)) {
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are NOT equal");
        }

        // Converting non-string to string
        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);
        int i = 2, j = 3;
        int result = i * j;
        System.out.println(i + " * " + j + " = " + result);

        Flight oFlight = new Flight(175);
        System.out.println(oFlight.toString());

        // String Builder
        StringBuilder oStringBuilder = new StringBuilder(40);
        Flight myFlight = new Flight(175);
        String location = "Florida";
        oStringBuilder.append("I flew to ");
        oStringBuilder.append(location);
        oStringBuilder.append(" on ");
        oStringBuilder.append(myFlight);
        System.out.println(oStringBuilder.toString());

        int time = 9;
        int pos = oStringBuilder.length() - " on ".length()-myFlight.toString().length();
        oStringBuilder.insert(pos, " at ");
        oStringBuilder.insert(pos+4, time);

        String message = oStringBuilder.toString();
        System.out.println(message);

        // Wrapper classes
        Integer a = 100;
        int b = a;
        Integer c = b;


        Integer d = Integer.valueOf(100);
        Integer f = Integer.valueOf(d);
        int e = d.intValue();
        f = Integer.valueOf(e);
        Float g = Float.valueOf(18.125f);
        float h = g.floatValue();

        String s = "87.44";
        double dbl1 = Double.valueOf(s);
        Double dbl2 = Double.parseDouble(s);

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0, 2);
        stuff[2] = 100;

        for (Object obj:stuff) {
            System.out.println(obj.toString());
            System.out.println(obj.hashCode());
        }

    }
}

