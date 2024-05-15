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

 // This program includes a method inside the box class.
   class Box {
     double width;
     double height;
     double depth;
     // display volume of a box
     void volume() {
       System.out.print("Volume is ");
       System.out.println(width * height * depth);
     }
}
   class BoxDemo3 {
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
       // display volume of first box
       mybox1.volume();
       // display volume of second box
       mybox2.volume();
     }
}


// Now, volume() returns the volume of a box.
class Box {
  double width;
  double height;
  double depth;
  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}
class BoxDemo4 {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol;
    // assign values to mybox1's instance variables
    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;
    /* assign different values to mybox2's
       instance variables */
    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;
    // get volume of first box
    vol = mybox1.volume();
    System.out.println("Volume is " + vol);
    // get volume of second box
    vol = mybox2.volume();
    System.out.println("Volume is " + vol);
} }


// This program uses a parameterized method.
   class Box {
     double width;
     double height;
     double depth;
     // compute and return volume
     double volume() {
       return width * height * depth;
     }
     // sets dimensions of box
     void setDim(double w, double h, double d) {
       width = w;
       height = h;
       depth = d;
} }
   class BoxDemo5 {
     public static void main(String args[]) {
       Box mybox1 = new Box();
       Box mybox2 = new Box();
       double vol;
       // initialize each box
       mybox1.setDim(10, 20, 15);
       mybox2.setDim(3, 6, 9);
       // get volume of first box
       vol = mybox1.volume();
       System.out.println("Volume is " + vol);
       // get volume of second box
       vol = mybox2.volume();
       System.out.println("Volume is " + vol);
} }


/* Here, Box uses a constructor to initialize the
      dimensions of a box.
*/
class Box {
     double width;
     double height;
      double depth;
     // This is the constructor for Box.
     Box() {
       System.out.println("Constructing Box");
       width = 10;
       height = 10;
       depth = 10;
}
     // compute and return volume
     double volume() {
       return width * height * depth;
     }
}
   class BoxDemo6 {
     public static void main(String args[]) {
       // declare, allocate, and initialize Box objects
       Box mybox1 = new Box();
       Box mybox2 = new Box();
double vol;
       // get volume of first box
       vol = mybox1.volume();
       System.out.println("Volume is " + vol);
       // get volume of second box
       vol = mybox2.volume();
       System.out.println("Volume is " + vol);
} }
