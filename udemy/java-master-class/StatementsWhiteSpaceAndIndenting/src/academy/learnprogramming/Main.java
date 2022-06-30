package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // the entire line including the datatype and semicolon are statements
	    int myVariable = 50;
        // other statements examples
        myVariable++;
        myVariable--;
        System.out.println("This whole line is a statement");

        System.out.println("This " +
                "is" +
                "another" +
                "statement" +
                "but " +
                "on " +
                "multiple" +
                "lines.");

        // this is valid to java as two separate statements, but isn't very readable
        int anotherVariable = 50;myVariable--;System.out.println("This is another one");

        // white space and indentation make the code more readable
    }
}
