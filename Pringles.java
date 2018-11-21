public class YouKnowYouWantedThis {

  

  public void run() {

     TubeOfPringles myPringles = new TubeOfPringles("spicy bacon");

     TubeOfPringles yourPringles = new TubeOfPringles("violent cheese");

 

     myPringles.pop();

     myPringles.nosh(3);

     yourPringles.nosh(5);

        

  System.out.println(myPringles);

  System.out.println(yourPringles);

     }

 

}

 

public class TubeOfPringles {

   private int numChipsLeft = 50;

   private String flavour;

   private boolean isOpen;

 

   public TubeOfPringles() {

     flavour = "dilled salmon";

     isOpen = false;

   }

 

   public TubeOfPringles(String flavour) {

     this.flavour = flavour;

     isOpen = false;

}

 

   public void pop() {

     System.out.println("Popped open a can of delicious " + flavour + " Pringles!");

     isOpen = true;

}          

 

public void nosh(int numChipsToNosh) {

  if (isOpen) {

    numChipsLeft -= numChipsToNosh;

  }

}

 

   public String toString() {

     return String.format("Just can’t stop! %d %s chips left!", numChipsLeft, flavour);

}

}