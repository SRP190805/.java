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
