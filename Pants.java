/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
     * print ASCII Art Pants
     */
    public void display() {//draw a skirt in this condition
        System.out.println("        |   | \\/  |  |");
        System.out.println("        /__/  ||  \\__\\");
        System.out.println("       /      ||      \\");
        System.out.println("      /       ||       \\");
        System.out.println("     /        ||        \\");
        System.out.println("    /_________||_________\\");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
