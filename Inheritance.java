// A simple example of inheritance.
   // Create a superclass.
   class A {
int i, j;
     void showij() {
       System.out.println("i and j: " + i + " " + j);
} }
   // Create a subclass by extending class A.
   class B extends A {
int k;
     void showk() {
       System.out.println("k: " + k);
}
void sum() {
       System.out.println("i+j+k: " + (i+j+k));
     }
}
   class SimpleInheritance {
     public static void main(String args[]) {
       A superOb = new A();
   
Chapter 8:
Inheritance
        B subOb = new B();
       // The superclass may be used by itself.
       superOb.i = 10;
       superOb.j = 20;
       System.out.println("Contents of superOb: ");
       superOb.showij();
       System.out.println();
       /* The subclass has access to all public members of
          its superclass. */
       subOb.i = 7;
       subOb.j = 8;
       subOb.k = 9;
       System.out.println("Contents of subOb: ");
       subOb.showij();
       subOb.showk();
       System.out.println();
       System.out.println("Sum of i, j and k in subOb:");
       subOb.sum();
     }
}


/* In a class hierarchy, private members remain
          private to their class.
          This program contains an error and will not
compile. */
       // Create a superclass.
       class A {
         int i; // public by default
         private int j; // private to A
         void setij(int x, int y) {
           i = x;
           j = y; }
}
       // A's j is not accessible here.
       class B extends A {
int total;
 
          void sum() {
           total = i + j; // ERROR, j is not accessible here
} }
       class Access {
         public static void main(String args[]) {
           B subOb = new B();
           subOb.setij(10, 12);
           subOb.sum();
           System.out.println("Total is " + subOb.total);
         }
}


 // This program uses inheritance to extend Box.
       class Box {
         double width;
         double height;
         double depth;
         // construct clone of an object
         Box(Box ob) { // pass object to constructor
           width = ob.width;
           height = ob.height;
           depth = ob.depth;
  }
  // constructor used when all dimensions specified
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}
  // constructor used when no dimensions specified
  Box() {
    width = -1;  // use -1 to indicate
    height = -1; // an uninitialized
    depth = -1;  // box
}
  // constructor used when cube is created
  Box(double len) {
    width = height = depth = len;
  }
  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}
// Here, Box is extended to include weight.
class BoxWeight extends Box {
  double weight; // weight of box
  // constructor for BoxWeight
  BoxWeight(double w, double h, double d, double m) {
    width = w;
    height = h;
    depth = d;
    weight = m;
} }

   class DemoBoxWeight {
     public static void main(String args[]) {
       BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
       BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
       double vol;
       vol = mybox1.volume();
       System.out.println("Volume of mybox1 is " + vol);
       System.out.println("Weight of mybox1 is " + mybox1.weight);
       System.out.println();
       vol = mybox2.volume();
       System.out.println("Volume of mybox2 is " + vol);
       System.out.println("Weight of mybox2 is " + mybox2.weight);
} }


// Here, Box is extended to include color.
   class ColorBox extends Box {
     int color; // color of box
     ColorBox(double w, double h, double d, int c) {
       width = w;

 height = h;
depth = d;
color = c;
} }

