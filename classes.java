/* A program that uses the Box class.
      Call this file BoxDemo.java
   */
   class Box {
     double width;
     double height;
     double depth;
}
   // This class declares an object of type Box.
   class BoxDemo {
     public static void main(String args[]) {
       Box mybox = new Box();
       double vol;
       // assign values to mybox's instance variables
       mybox.width = 10;
 
       mybox.height = 20;
       mybox.depth = 15;
       // compute volume of box
       vol = mybox.width * mybox.height * mybox.depth;
       System.out.println("Volume is " + vol);
     }
}

// This program declares two Box objects.
   class Box {
     double width;
     double height;
     double depth;
}
   class BoxDemo2 {
     public static void main(String args[]) {
       Box mybox1 = new Box();
       Box mybox2 = new Box();
// assign values to mybox1's instance variables
mybox1.width = 10;
mybox1.height = 20;
mybox1.depth = 15;
/* assign different values to mybox2's
   instance variables */
mybox2.width = 3;
mybox2.height = 6;
mybox2.depth = 9;
// compute volume of first box
vol = mybox1.width * mybox1.height * mybox1.depth;
System.out.println("Volume is " + vol);
// compute volume of second box
vol = mybox2.width * mybox2.height * mybox2.depth;
System.out.println("Volume is " + vol);
} 
}
