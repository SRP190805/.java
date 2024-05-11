//Demonstrate One-Dimensional Array
class Array{
    public static void main(String args[]){
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has " + month_days[3] + " days.");
    }
}

//an improved version of the previous program
class AutoArray{
    public static void main(String args[]){
        int month_days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("April has " + month_days[3] + " days.");
    }
}

//Average an array of values.
class Average{
    public static void main(String args[]){
        double nums[] = {10.12,11.23,12.34,13.45,14.56},result =0;
        int i;

        for(i=0;i<5;i++)
          result = result +nums[i];
        System.out.println("Average is " + result/5);
    }
}

//Demonstrate a two-Dimensional Array
class TwoDArray{
    public static void main(String args[]){
        int twoD[][] = new int[4][5],i,j,k=0;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                twoD[i][j] = k;
                k++;
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Manually allocate different sized second dimensions
class TwoDArray2{
    public static void main(String args[]){
        int twoD[][] = new int[4][],i,j,k=1;
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        for(i=0;i<4;i++){
            for(j=0;j<i+1;j++){
                twoD[i][j] = k;
                k++;
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<i+1;j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Demonstrate a three Dimensional Array
class ThreeDMatrix{
    public static void main(String args[]){
        int threeD[][][] = new int[4][5][6],i,j,k;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                for(k=0;k<6;k++){
                    threeD[i][j][k] = i*j*k;
                }
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                for(k=0;k<6;k++){
                    System.out.println(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}