// Simple types are passed by value.
   class Test {
     void meth(int i, int j) {
       i *= 2;
j /= 2; }
}
    class CallByValue {
     public static void main(String args[]) {
       Test ob = new Test();
       int a = 15, b = 20;
       System.out.println("a and b before call: " +
a + " " + b);
       ob.meth(a, b);
       System.out.println("a and b after call: " +
                          a + " " + b);
} }


// Objects are passed by reference.
   class Test {
     int a, b;
     Test(int i, int j) {
       a = i;
       b = j; }
      // pass an object
     void meth(Test o) {
     o.a *= 2;
     o.b /= 2; }
   }
   class CallByRef {
     public static void main(String args[]) {
       Test ob = new Test(15, 20);
       System.out.println("ob.a and ob.b before call: " +
                          ob.a + " " + ob.b);
       ob.meth(ob);
       System.out.println("ob.a and ob.b after call: " +
                          ob.a + " " + ob.b);
} }
