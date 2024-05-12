//Demonstrate the basic arithmatic operators
class BasicMath{
    public static void main(String args[]){
        //arithmatic using integers
        System.out.println("Integer Arithmatic");
        int a = 1+1;
        int b = a*2;
        int c = b/4;
        int d = c-a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

                //arithmatic using doubles
                System.out.println("\nFloating Point Arithmatic");
                double da = 1+1;
                double db = da*2;
                double dc = db/4;
                double dd = dc-a;
                double de = -dd;
                System.out.println("a = " + da);
                System.out.println("b = " + db);
                System.out.println("c = " + dc);
                System.out.println("d = " + dd);
                System.out.println("e = " + de);
    }
}

//Demonstrate the % Operator
class Modulus{
    public static void main(String args[]){
        int x = 43;
        double y = 43.78;

        System.out.println("x mod 10 = " + x%10);
        System.out.println("y mod 10 = " + y%10);
    }
}

//Demonstrate various assignment Operator
class OpEquals{
    public static void main(String args[]){
        int a = 4,b = 8,c = 16;

        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

//Demonstrate the bitwise logical Operators
class Bitlogic{
    public static void main(String args[]){
        //arithmatic using integers
        String Binary[] = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};

        int a = 3;//0+2+1 or 0011 in binary
        int b = 6;//4+2+0 or 0110 in binary
        int c = a|b;
        int d = a&b;
        int e = a^b;
        int f = (~a&b)|(a&~b);
        int g = ~a&0x0f;
        System.out.println("           a = " + Binary[a]);
        System.out.println("           b = " + Binary[b]);
        System.out.println("         a|b = " + Binary[c]);
        System.out.println("         a&b = " + Binary[d]);
        System.out.println("         a^b = " + Binary[e]);
        System.out.println("   ~a&b|a&~b = " + Binary[f]);
        System.out.println("     ~a&0x0f = " + Binary[g]);
    }
}

//Left shifting a byte value
class Byteshift{
    public static void main(String args[]){
        byte a = 64,b;
        int i;
        i=a <<2;
        b = (byte)(i);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}

//Masking sign extension
class hexbyte{
    static public void main(String args[]){
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b>>4)&0x0f] + hex[(b&0x0f)]);
    }
}

//Unsigned shifting a byte value
class ByteUShift{
    static public void main(String args[]){
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        byte b = (byte) 0xf1;
        byte c = (byte) (b>>4);
        byte d = (byte) (b>>>4);
        byte e = (byte) ((b&0xff)>>4);
        System.out.println("            b = 0x" + hex[(b>>4)&0x0f] + hex[(b&0x0f)]);
        System.out.println("         b>>4 = 0x" + hex[(c>>4)&0x0f] + hex[(c&0x0f)]);
        System.out.println("        b>>>4 = 0x" + hex[(d>>4)&0x0f] + hex[(d&0x0f)]);
        System.out.println("(b&0xff) >> 4 = 0x" + hex[(e>>4)&0x0f] + hex[(e&0x0f)]);
    }
}

//bitwise operation assignment
class OpBitEquals{
    public static void main(String args[]){
        int a =1,b =2,c =3;
        a |= 4;
        b >>= 1;
        c <<=1;
        a ^= c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

//Demonstrate the boolean logic operators
class BoolLogic{
    public static void main(String args[]){
        boolean a = true,b = false,c =a|b,d=a&b,e=a^b,f=(!a&b)|(a&!b),g=!a;
        System.out.println("            a = " + a);
        System.out.println("            b = " + b);
        System.out.println("          a|b = " + c);
        System.out.println("          a&b = " + d);
        System.out.println("          a^b = " + e);
        System.out.println("(!a&b)|(a&!b) = " + f);
        System.out.println("           !a = " + g);
    }
}

//Demonstrate ? : .
class Ternary{
    public static void main(String args[]){
        int i =10,k;
        k = i<0 ? -i:i;//get absolute value of i
        System.out.println("Absolute value of: ");
        System.out.println(i + " is " + k);

        i=-10;
        k = i<0 ? -i:i;//get absolute value of i
        System.out.println("Absolute value of i: ");
        System.out.println(i + " is " + k);
    }
}