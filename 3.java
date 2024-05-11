/*Demonstrate the if.
  Call this file "3.java"
 */

 class IFSample{
    public static void main(String args[]){
        int x,y;
        x=4;
        y=8;

        if(x<y) System.out.println("x is less than y.");

        x =x*2;
        if(x==y) System.out.println("x is equal to y now.");

        x =x*2;
        if(x>y) System.out.println("x is now greater than y.");

        //This won't display anything
        if(x==y) System.out.println("you won't see this.");
    }
 }