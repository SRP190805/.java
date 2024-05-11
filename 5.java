/** Demonstrate the block of code.
  Call this file "5.java"
 */

 class BlockTest{
    public static void main(String args[]){
        int x,y;

        y = 30;
        
        //target of this loop is a block
        for(x=0;x<=10;x++){
            System.out.println("The value of x is: " + x);
            System.out.println("The value of y is: " + y);
            y = y-3;
        }    
    }
 }