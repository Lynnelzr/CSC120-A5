/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {

    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * print a decorative banner, resized to fit the
     * message
     */
    public void display() {
        int n = message.length();
        System.out.print("  ");//create loops for "*" to change its numbers according to the length of the message we want to print out.
        for (int s = 0; s < n+6; s++)
            System.out.print("*");
        System.out.print("  ");

        System.out.print("\n"+"***");
        for (int s = 0; s < n+4; s++)
            System.out.print("~");
        System.out.print("***");

        System.out.println("\n"+"***~ "+this.message +" ~***");

        System.out.print("***");
        for (int s = 0; s < n+4; s++)
            System.out.print("~");
        System.out.println("***");

        System.out.print("  ");
        for (int s = 0; s < n-1; s++)
            System.out.print("*");
        System.out.print("      ");
        System.out.println("***");

        System.out.print("      ");
        for (int s = 0; s < n; s++)
            System.out.print("*");
            
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello World!");
        myBanner.display();
    }
}
