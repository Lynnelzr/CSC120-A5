/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * print ASCII Art Boot
     */
    public void display() {//create left and right boot individually
        if (this.direction.equals("left")) {
          System.out.print("       |______|");
        } else if (this.direction.equals("right")) {
          System.out.print("|______|");
        } else {
          System.out.println("Which boot?");
      }
        }
    

    /* main method (for testing) */
    public static void main(String[] args) {//print out both boots
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
  }