//Demonstrate if-elseif statements
class IfElse{
    public static void main(String args[]){
        int month = 8;//august
        String season;

        if(month == 12||month == 1||month == 2){
            season="Winter";
        }
        else if(month == 3||month == 4||month == 5){
            season="Spring";
        }
        else if(month == 6||month == 7||month == 8){
            season="Summer";
        }
        else if(month == 9||month == 10||month == 11){
            season="Autumn";
        }
        else
         season = "Bogus Month";

         System.out.println("august is in the " + season + " season."); 
    }
}

//A simple switch statement
class SampleSwitch{
    public static void main(String args[]){
        for(int i=0;i<=6;i++){
            switch(i){
                case 0:
                System.out.println("i is zero.");
                break;
                case 1:
                System.out.println("i is one.");
                break;
                case 2:
                System.out.println("i is two.");
                break;
                case 3:
                System.out.println("i is three.");
                break;
                case 4:
                System.out.println("i is four.");
                break;
                default:
                System.out.println("i is greater than 4.");
            }
        }
    }
}

//In a switch, break statements are optional
class Missingbreak{
    public static void main(String args[]){
        for(int i=0;i<12;i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                System.out.println("i is less than 5");
                break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                System.out.println("i is less than 10.");
                break;
                default:
                System.out.println("i is more than 10.");
            }
        }
    }
}

//An improved version of season program
class Switch{
    public static void main(String args[]){
        int month=8;//august
        String season;
        switch(month){
            case 12:
            case 1:
            case 2:
            season = "Winter";
            break;
            case 3:
            case 4:
            case 5:
            season = "Spring";
            break;
            case 6:
            case 7:
            case 8:
            season = "Summer";
            break;
            case 9:
            case 10:
            case 11:
            season ="Autumn";
            break;
            default:
            season ="Bogus Month";
        }
        System.out.println("August is in the " + season + " season.");
    }
}

//Demonstrate the while loop
class While{
    public static void main(String args[]){
        int n = 10;

        while(n > 0){
            System.out.println("tick " + n);
            n--;
        }
    }
}

//The target of a loop can be empty
class NoBody{
    public static void main(String args[]){
        int i =100,j =150;
        //find midpoint between i and j
        while(i++ < j--);//no body in this loop

        System.out.println("midpoint is " + i);
    }
}

//Demonstrate the do-while loop
class DoWhile{
    public static void main(String args[]){
        int n=10;

        do{
            System.out.println("tick " + n);
            n--;
        }while(n>0);
    }
}

//Using a do-while to process a menu selection
class Menu{
    public static void main(String args[])
    throws java.io.IOException{
        char choice;

        do{
            System.out.println("Help on: ");
            System.out.println("   1. if ");
            System.out.println("   2. switch ");
            System.out.println("   3. while ");
            System.out.println("   4. do-while ");
            System.out.println("   5. for\n ");
            System.out.println("choose one: ");
            choice = (char) System.in.read(); 
        }while(choice < '1'||choice > '5');

        System.out.println("\n");

        switch(choice){
            case '1':
            System.out.println("The if:\n");
            System.out.println("if(condition) statement;");
            System.out.println("else statement;");
            break;
            case '2':
            System.out.println("The switch:\n");
            System.out.println("switch(condition) {");
            System.out.println("   case constant:");
            System.out.println("      statement sequence;");
            System.out.println("      break;");
            System.out.println("      //....");
            System.out.println("}");
            break;
            case '3':
            System.out.println("The while:\n");
            System.out.println("while(condition) statement;");
            break;
            case '4':
            System.out.println("The do-while:\n");
            System.out.println("do {");
            System.out.println("statement;");
            System.out.println("}while(condition);");
            break;
            case '5':
            System.out.println("The for:\n");
            System.out.println("for(init;condition;iteration");
            System.out.println("statement;");
            break;
        }
    }
}

//Demonstrate the for loop
class For{
    public static void main(String args[]){
        //here n is being declared inside of the for loop
        for(int n=10;n>0;n--){
            System.out.println("tick " + n);
        }
    }
}

//test for primes
class Findprime{
    public static void main(String args[]){
        int n;
        boolean isPrime = true;
        n = 3;
        for(int i=2;i <= n/2;i++){
            if((n%i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}

//Parts of the for loop can be empty
class Forvar{
    public static void main(String args[]){
        int i;
        boolean done = false;
        i=0;
        for(;!done;){
            System.out.println("i is " + i);
            if(i==10) done = true;
            i++;
        }
    }
}

//Loops may be nested
class Nested{
    public static void main(String args[]){
        int i,j;
        for(i=0;i<10;i++){
            for(j=i;j<10;j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}

//Using break to exit a loop
class Breakloop{
    public static void main(String args[]){
        for(int i=0;i<100;i++){
            if(i ==10) break;//terminate loop if i is 10.
            System.out.println("i: " + i);
        }
        System.out.println("loop completed.");
    }
}

//Using break as acivilized form of go-to
class Break{
    public static void main(String args[]){
        boolean t =true;
        first:{
            second:{
                third:{
                    System.out.println("Before the break,");
                    if(t) break second;//break out of second block
                    System.out.println("This won't execute.");
                }
                System.out.println("this won't execute.");
            }
            System.out.println("This is after second block.");
        }
    }
}

//Demonstrate continue
class Continue{
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            System.out.print(i + " ");
            if(i%2==0) continue;
            System.out.println();
        }
    }
}

//Using continue with label
class ContinueLabel{
    public static void main(String args[]){
        outer: for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j>i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
        }
        System.out.println();
    }
}

//Demonstrate return
class Return{
    public static void main(String args[]){
        boolean t =true;
        System.out.println("befor the return.");
        if(t) return;//return to the caller;
        System.out.println("This won't execute.");
    }
}