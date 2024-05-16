   /* This program demonstrates the difference between
      public and private.
   */
   class Test {
     int a; // default access
     public int b; // public access
     private int c; // private access
     // methods to access c
     void setc(int i) { // set c's value
c = i; }
     int getc() { // get c's value
       return c;
} }
   class AccessTest {
     public static void main(String args[]) {
       Test ob = new Test();
       // These are OK, a and b may be accessed directly
       ob.a = 10;
       ob.b = 20;
       // This is not OK and will cause an error
   //  ob.c = 100; // Error!
       // You must access c through its methods
       ob.setc(100); // OK
   173
 THE JAVA LANGUAGE

 174
JavaTM 2: The Complete Reference
 System.out.println("a, b, and c: " + ob.a + " " +
                   ob.b + " " + ob.getc());
} }


// This class defines an integer stack that can hold 10 values.
   class Stack {
     /* Now, both stck and tos are private.  This means
        that they cannot be accidentally or maliciously
        altered in a way that would be harmful to the stack.
     */
     private int stck[] = new int[10];
     private int tos;
     // Initialize top-of-stack
     Stack() {
tos = -1; }
     // Push an item onto the stack
     void push(int item) {
       if(tos==9)
         System.out.println("Stack is full.");
       else
         stck[++tos] = item;
}
 
Chapter 7: A Closer Look at Methods and Classes
      // Pop an item from the stack
     int pop() {
       if(tos < 0) {
         System.out.println("Stack underflow.");
         return 0;
} else
         return stck[tos--];
     }
}
class TestStack {
     public static void main(String args[]) {
       Stack mystack1 = new Stack();
       Stack mystack2 = new Stack();
       // push some numbers onto the stack
       for(int i=0; i<10; i++) mystack1.push(i);
       for(int i=10; i<20; i++) mystack2.push(i);
       // pop those numbers off the stack
       System.out.println("Stack in mystack1:");
       for(int i=0; i<10; i++)
          System.out.println(mystack1.pop());
       System.out.println("Stack in mystack2:");
       for(int i=0; i<10; i++)
          System.out.println(mystack2.pop());
       // these statements are not legal
       // mystack1.tos = -2;
       // mystack2.stck[3] = 100;
} }
