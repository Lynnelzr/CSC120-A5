/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /*
     * Parts of the Scarecrow
     * implement each class
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    // private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /*
     * Constructor
     * initialize remaining parts
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants l, Boot le, Boot r, Banner s) {
        sign = s;
        head = h;
        body = b;
        legs = l;
        leftFoot = le;
        rightFoot = r;
    }

    /*
     * Displays the Scarecrow
     * call the .display() method of each part from the topper banner to the boots
     * ...in the right order!
     */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* 
     * Main method (for testing) 
     */
    public static void main(String[] args) {

        // update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"),
                new Boot("right"), new Banner(""));

        // If a message was passed in on the command line, extract and store it
        // pass this value along to your Banner constructor
        if (args.length > 0) { //print out the provided banner
            myScarecrow.sign = new Banner(args[0]);
        } else {//print out the provided default message.
            myScarecrow.sign = new Banner ("Hello World!");
        }

        myScarecrow.display();
    }

}
