package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        // returns 1; which is not precise because int double not handle floating decimals
        float myFloatValue = 5F / 3F;
        // returns 1.6666666; which is more precise than int
        double myDoubleValue = 5D / 3D;
        // returns 1.6666666666666667; which is more precise than the float
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloat = " + myFloatValue);
        System.out.println("MyDouble = " + myDoubleValue);

        double poundsToKilograms = 0.45359237;
        double myWeightInPounds = 210;
        double myWeightInKilograms = myWeightInPounds * poundsToKilograms;
        System.out.println("My weight in kilograms is = " + myWeightInKilograms);
    }
}
