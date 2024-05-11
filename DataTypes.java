//compute the area of circle.
class area{
    public static void main(String args[]){
        double pi,r,a;
        r = 21.6;//radius of circle
        pi = 3.1416;//pi, approximate
        a = pi*r*r;//compute area
        System.out.println("Area of circle is: " + a);
    }
}

//demonstrate char data type
class Chardemo{
    public static void main(String args[]){
        char ch1,ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.println("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);

    }
}

//char variables behave like integers
class Chardemo2{
    public static void main(String args[]){
        char ch1;
        ch1 = 'X';
        System.out.println("ch1 contains " + ch1);
        ch1++;
        System.out.println("ch1 is now " + ch1);
    }
}

//Demonstrate boolean values.
class BoolTest{
    public static void main(String args[]){
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        //a boolean value can control the if statement.
        if(b) System.out.println("This is executed.");

        b = false;
        if(b) System.out.println("This is not executed.");

        //outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10>9));
    }
}

//Demonstrate Dynamic initialization
class DynInit{
    public static void main(String args[]){
        double a =3.0,b =4.0;

        //c is dynamically initialized
        double c=Math.sqrt(a*a + b*b);
        System.out.println("Hypotennuse is " + c);
    }
}

//Demonstrate block scope.
class Scope{
    public static void main(String args[]){
        int x;//known to all code within main
        x =10;
        if(x == 10){//started new scope
          int y = 20;//known only to this block

          //x and y both known here
          System.out.println("x and y: " + x + " " + y);
          x=y*2;
        }
        //y=100; error! y not known here

        //x is still known here.
        System.out.println("x is " + x);
    }
}