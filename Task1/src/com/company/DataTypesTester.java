package com.company;

import java.lang.String;

public class DataTypesTester {
    public static void testByte(){
        byte a = 6;
        byte b = 4;
        byte c;

        System.out.println("\n=========ARITHMETICAL OPERATORS=========");
        c = (byte) (a+b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = (byte) (a-b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = (byte) (a*b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = (byte) (a/b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = (byte) (a%b);
        System.out.printf("%d %% %d = %d\n", a, b ,c);

            //Arithmetical Exception
//        c = (byte) (a/0);
//        System.out.printf("%d / 0 = %d\n", a, c);
//        c = (byte) (a%0);
//        System.out.printf("%d %% 0 = %d\n", a, c);
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);
        c = (byte) +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 6;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 6;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 6;
        System.out.printf("%d-- = %d\n", a, a--);
        a = 6;
        System.out.printf("--%d = %d\n", a, --a);

        a = 6;
        b = 4;
        System.out.println("\n=========BITWISE OPERATORS=========");
        c = (byte) (a&b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) (a|b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) (a^b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (byte)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (byte)(a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -5;
        c = (byte)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -5;
        c = (byte)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        a = 4;
        c = 6;
        System.out.printf("%d += %d --> c = %d\n", c, a, c+=a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c-=a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c*=a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c/=a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c%=a);

        //Arithmetical Exception
//        System.out.printf("%d %= 0 --> c = %d\n", c, 0, c%=0);
//        System.out.printf("%d /= 0 --> c = %d\n", c, 0, c/=0);
        c = 6;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c&=a);
        c = 6;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c|=a);
        c = 6;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c^=a);
        c = 6;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c>>=1);
        c = 6;
        System.out.printf("%d <<= 1 --> c = %d\n", c, c<<=1);
        c = 6;
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c>>>=1);

        System.out.println("\n=========RELATIONAL OPERATORS=========");
        a = 6;
        b = 4;
        System.out.printf("%d < %d --> %b\n", a, b, a<b);
        System.out.printf("%d <= %d --> %b\n", a, b, a<=b);
        System.out.printf("%d > %d --> %b\n", a, b, a>b);
        System.out.printf("%d >= %d --> %b\n", a, b, a>=b);
        System.out.printf("%d == %d --> %b\n", a, b, a==b);
        System.out.printf("%d != %d --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");
        a = 6;
        b = 4;
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, b, (a>b)&&(b>0));
        System.out.printf("(%d > %d) & (%d < 0) --> %b\n", a, b, b, (a>b)&(b<0));
        System.out.printf("(%d > %d) || (%d < 0) --> %b\n", a, b, a, (a>b)||(a<0));
        System.out.printf("(%d < %d) | (%d < 0) --> %b\n", a, b, a, (a<b)|(a<0));
        System.out.printf("(%d > %d) ^ (%d < 0) --> %b\n", a, b, a, (a>b)^(a<0));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%d == %d ? %d : %d --> %d\n", a, b, a, b, a==b ? a:b);

        System.out.println("\n=========TYPE CAST OPERATORS=========");
        byte bt = -20;
        int i = 100000;
        short sh = -30000;
        char ch = 'a';
        long lg = 10000000000L;
        float f = 5.4f;
        double db = 5435.345;
        boolean bool = true;
        String s = "a";
        Student st = new Student("Valera", 10);

        c = (byte) i;
        System.out.printf("byte = int: c = (byte)%d --> c=%d\n",i,c);
        c = (byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c=%d\n",sh,c);
        c = (byte) ch;
        System.out.printf("byte = char: c = (byte)'%c' --> c=%d\n",ch,c);
        c = (byte) lg;
        System.out.printf("byte = long: c = (byte)%d --> c=%d\n",lg,c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c=%d\n",f,c);
        c = (byte) db;
        System.out.printf("byte = double: c = (byte)%f --> c=%d\n",db,c);
            //Compile Error
        //c =st;
        //c = s;
        //c = (byte) bool;
    }

    public static void testShort(){
        short a = 6;
        short b = 4;
        short c;

        System.out.println("\n=========ARITHMETICAL OPERATORS=========");
        c = (short) (a+b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        c = (short) (a-b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = (short) (a*b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = (short) (a/b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = (short) (a%b);
        System.out.printf("%d %% %d = %d\n", a, b ,c);

        //Arithmetical Exception
//        c = (short) (a/0);
//        System.out.printf("%d / 0 = %d\n", a, c);
//        c = (short) (a%0);
//        System.out.printf("%d %% 0 = %d\n", a, c);
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 6;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 6;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 6;
        System.out.printf("%d-- = %d\n", a, a--);
        a = 6;
        System.out.printf("--%d = %d\n", a, --a);

        a = 6;
        b = 4;
        System.out.println("\n=========BITWISE OPERATORS=========");
        c = (short) (a&b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (a|b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (a^b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (short)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (short)(a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = (short)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -5;
        c = (short)(a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -5;
        c = (short)(a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        a = 4;
        c = 6;
        System.out.printf("%d += %d --> c = %d\n", c, a, c+=a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c-=a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c*=a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c/=a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c%=a);

        //Arithmetical Exception
//        System.out.printf("%d %= 0 --> c = %d\n", c, 0, c%=0);
//        System.out.printf("%d /= 0 --> c = %d\n", c, 0, c/=0);
        c = 6;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c&=a);
        c = 6;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c|=a);
        c = 6;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c^=a);
        c = 6;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c>>=1);
        c = 6;
        System.out.printf("%d <<= 1 --> c = %d\n", c, c<<=1);
        c = 6;
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c>>>=1);

        System.out.println("\n=========RELATIONAL OPERATORS=========");
        a = 6;
        b = 4;
        System.out.printf("%d < %d --> %b\n", a, b, a<b);
        System.out.printf("%d <= %d --> %b\n", a, b, a<=b);
        System.out.printf("%d > %d --> %b\n", a, b, a>b);
        System.out.printf("%d >= %d --> %b\n", a, b, a>=b);
        System.out.printf("%d == %d --> %b\n", a, b, a==b);
        System.out.printf("%d != %d --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");
        a = 6;
        b = 4;
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, b, (a>b)&&(b>0));
        System.out.printf("(%d > %d) & (%d < 0) --> %b\n", a, b, b, (a>b)&(b<0));
        System.out.printf("(%d > %d) || (%d < 0) --> %b\n", a, b, a, (a>b)||(a<0));
        System.out.printf("(%d < %d) | (%d < 0) --> %b\n", a, b, a, (a<b)|(a<0));
        System.out.printf("(%d > %d) ^ (%d < 0) --> %b\n", a, b, a, (a>b)^(a<0));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%d == %d ? %d : %d --> %d\n", a, b, a, b, a==b ? a:b);

        System.out.println("\n=========TYPE CAST OPERATORS=========");
        byte bt = -20;
        int i = 100000;
        //short sh = -30000;
        char ch = 'a';
        long lg = 10000000000L;
        float f = 5.4f;
        double db = 5435.345;
        boolean bool = true;
        String s = "a";
        Student st = new Student("Valera", 10);

        c = (short) i;
        System.out.printf("short = int: c = (short)%d --> c=%d\n",i,c);
        c = (short) bt;
        System.out.printf("short = byte: c = (short)%d --> c=%d\n",bt,c);
        c = (short) ch;
        System.out.printf("short = char: c = (short)'%c' --> c=%d\n",ch,c);
        c = (short) lg;
        System.out.printf("short = long: c = (short)%d --> c=%d\n",lg,c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c=%d\n",f,c);
        c = (short) db;
        System.out.printf("short = double: c = (short)%f --> c=%d\n",db,c);
        //Compile Error
        //c =st;
        //c = s;
        //c = (short) bool;
    }

    public static void testInt(){
        int a = 6;
        int b = 4;
        int c;

        System.out.println("\n=========ARITHMETICAL OPERATORS=========");
        c = a+b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c =a-b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a*b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a/b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a%b;
        System.out.printf("%d %% %d = %d\n", a, b ,c);

        //Arithmetical Exception
//        c = a/0;
//        System.out.printf("%d / 0 = %d\n", a, c);
//        c = a%0;
//        System.out.printf("%d %% 0 = %d\n", a, c);
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 6;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 6;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 6;
        System.out.printf("%d-- = %d\n", a, a--);
        a = 6;
        System.out.printf("--%d = %d\n", a, --a);

        a = 6;
        b = 4;
        System.out.println("\n=========BITWISE OPERATORS=========");
        c = a&b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a|b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a^b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        a = -5;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        a = 4;
        c = 6;
        System.out.printf("%d += %d --> c = %d\n", c, a, c+=a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c-=a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c*=a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c/=a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c%=a);

        //Arithmetical Exception
//        System.out.printf("%d %= 0 --> c = %d\n", c, 0, c%=0);
//        System.out.printf("%d /= 0 --> c = %d\n", c, 0, c/=0);
        c = 6;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c&=a);
        c = 6;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c|=a);
        c = 6;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c^=a);
        c = 6;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c>>=1);
        c = 6;
        System.out.printf("%d <<= 1 --> c = %d\n", c, c<<=1);
        c = 6;
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c>>>=1);

        System.out.println("\n=========RELATIONAL OPERATORS=========");
        a = 6;
        b = 4;
        System.out.printf("%d < %d --> %b\n", a, b, a<b);
        System.out.printf("%d <= %d --> %b\n", a, b, a<=b);
        System.out.printf("%d > %d --> %b\n", a, b, a>b);
        System.out.printf("%d >= %d --> %b\n", a, b, a>=b);
        System.out.printf("%d == %d --> %b\n", a, b, a==b);
        System.out.printf("%d != %d --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");
        a = 6;
        b = 4;
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, b, (a>b)&&(b>0));
        System.out.printf("(%d > %d) & (%d < 0) --> %b\n", a, b, b, (a>b)&(b<0));
        System.out.printf("(%d > %d) || (%d < 0) --> %b\n", a, b, a, (a>b)||(a<0));
        System.out.printf("(%d < %d) | (%d < 0) --> %b\n", a, b, a, (a<b)|(a<0));
        System.out.printf("(%d > %d) ^ (%d < 0) --> %b\n", a, b, a, (a>b)^(a<0));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%d == %d ? %d : %d --> %d\n", a, b, a, b, a==b ? a:b);

        System.out.println("\n=========TYPE CAST OPERATORS=========");
        byte bt = -20;
        //int i = 100000;
        short sh = -30000;
        char ch = 'a';
        long lg = 10000000000L;
        float f = 5.4f;
        double db = 5435.345;
        boolean bool = true;
        String s = "a";
        Student st = new Student("Valera", 10);

        c = sh;
        System.out.printf("int = short: c = %d --> c=%d\n",sh,c);
        c = bt;
        System.out.printf("int = byte: c = %d --> c=%d\n",bt,c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c=%d\n",ch,c);
        c = (int) lg;
        System.out.printf("int = long: c = (int)%d --> c=%d\n",lg,c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c=%d\n",f,c);
        c = (int) db;
        System.out.printf("int = double: c = (int)%f --> c=%d\n",db,c);
        //Compile Error
        //c = s;
        //c = st;
        //c = (int) bool;
    }
    public static void testChar(){
            char a = 'b';
            char b = 'a';
            char c;


            System.out.println("\n=========ARITHMETICAL OPERATORS=========");
            c = (char) (a+b);
            System.out.printf("%c + %c = %c\n", a, b, c);
            c = (char) (a-b);
            System.out.printf("%c - %c = %c\n", a, b, c);
            c = (char) (a*b);
            System.out.printf("%c * %c = %c\n", a, b, c);
            c = (char) (a/b);
            System.out.printf("%c / %c = %c\n", a, b, c);
            c = (char) (a%b);
            System.out.printf("%c %% %c = %c\n", a, b ,c);

            //Arithmetical Exception
//        c = (char) (a/0);
//        System.out.printf("%c / 0 = %c\n", a, c);
//        c = (char) (a%0);
//        System.out.printf("%c %% 0 = %c\n", a, c);
            c = (char) -a;
            System.out.printf("-%c = %c\n", a, c);
            c = (char) +a;
            System.out.printf("+%c = %c\n", a, c);
            a = 'a';
            System.out.printf("%c++ = %c\n", a, a++);
            a = 'a';
            System.out.printf("++%c = %c\n", a, ++a);
            a = 'a';
            System.out.printf("%c-- = %c\n", a, a--);
            a = 'a';
            System.out.printf("--%c = %c\n", a, --a);

            a = 'a';
            b = 'd';
            System.out.println("\n=========BITWISE OPERATORS=========");
            c = (char) (a&b);
            System.out.printf("%c & %c = %c\n", a, b, c);
            System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
            c = (char) (a|b);
            System.out.printf("%c | %c = %c\n", a, b, c);
            System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
            c = (char) (a^b);
            System.out.printf("%c ^ %c = %c\n", a, b, c);
            System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
            c = (char) ~a;
            System.out.printf("~%c = %c\n", a, c);
            System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
            c = (char)(a >> 1);
            System.out.printf("%c >> 1 = %c\n", a, c);
            System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
            c = (char)(a << 1);
            System.out.printf("%c << 1 = %c\n", a, c);
            System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
            c = (char)(a >>> 1);
            System.out.printf("%c >>> 1 = %c\n", a, c);
            System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

            System.out.println("\n=========ASSIGNMENT OPERATORS=========");
            a = 'a';
            c = 'b';
            System.out.printf("%c += %c --> c = %c\n", c, a, c+=a);
            System.out.printf("%c -= %c --> c = %c\n", c, a, c-=a);
            System.out.printf("%c *= %c --> c = %c\n", c, a, c*=a);
            System.out.printf("%c /= %c --> c = %c\n", c, a, c/=a);
            System.out.printf("%c %%= %c --> c = %c\n", c, a, c%=a);

//            //Arithmetical Exception
////        System.out.printf("%d %= 0 --> c = %d\n", c, 0, c%=0);
////        System.out.printf("%d /= 0 --> c = %d\n", c, 0, c/=0);
            c = 'c';
            System.out.printf("%c &= %c --> c = %c\n", c, a, c&=a);
            c = 'c';
            System.out.printf("%c |= %c --> c = %c\n", c, a, c|=a);
            c = 'c';
            System.out.printf("%c ^= %c --> c = %c\n", c, a, c^=a);
            c = 'c';
            System.out.printf("%c >>= 1 --> c = %c\n", c, c>>=1);
            c = 'c';
            System.out.printf("%c <<= 1 --> c = %c\n", c, c<<=1);
            c = 'c';
            System.out.printf("%c >>>= 1 --> c = %c\n", c, c>>>=1);

//            System.out.println("\n=========RELATIONAL OPERATORS=========");
//            a = 'd';
//            b = 'f';
//            System.out.printf("%c < %c --> %b\n", a, b, a<b);
//            System.out.printf("%c <= %c --> %b\n", a, b, a<=b);
//            System.out.printf("%c > %c --> %b\n", a, b, a>b);
//            System.out.printf("%c >= %c --> %b\n", a, b, a>=b);
//            System.out.printf("%c == %c --> %b\n", a, b, a==b);
//            System.out.printf("%c != %c --> %b\n", a, b, a!=b);

            System.out.println("\n=========LOGICAL OPERATORS=========");
//            a = 'a';
//            b = 'b';
//            System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, b, (a>b)&&(b>0));
//            System.out.printf("(%d > %d) & (%d < 0) --> %b\n", a, b, b, (a>b)&(b<0));
//            System.out.printf("(%d > %d) || (%d < 0) --> %b\n", a, b, a, (a>b)||(a<0));
//            System.out.printf("(%d < %d) | (%d < 0) --> %b\n", a, b, a, (a<b)|(a<0));
//            System.out.printf("(%d > %d) ^ (%d < 0) --> %b\n", a, b, a, (a>b)^(a<0));

            System.out.println("\n=========MISC OPERATORS=========");
            a = 'f';
            b = 'f';
            System.out.printf("%c == %c ? %c : %c --> %c\n", a, b, a, b, a==b ? a:b);

            System.out.println("\n=========TYPE CAST OPERATORS=========");
            byte bt = -20;
            int i = 100000;
            short sh = -30000;
            //char ch = 'a';
            long lg = 10000000000L;
            float f = 5.4f;
            double db = 5435.345;
            boolean bool = true;
            String s = "a";
        Student st = new Student("Valera", 10);

            c = (char) i;
            System.out.printf("chart = int: c = (chart)%d --> c=%c\n",i,c);
            c = (char) bt;
            System.out.printf("chart = byte: c = (chart)%d --> c=%c\n",bt,c);
            c = (char) sh;
            System.out.printf("chart = char: c = (chart)%d --> c=%c\n",sh,c);
            c = (char) lg;
            System.out.printf("chart = long: c = (chart)%d --> c=%c\n",lg,c);
            c = (char) f;
            System.out.printf("chart = float: c = (chart)%f --> c=%c\n",f,c);
            c = (char) db;
            System.out.printf("chart = double: c = (chart)%f --> c=%c\n",db,c);
            //Compile Error
            //c = s;
        //c = st;
            //c = (char) bool;
    }
    public static void testLong(){
        long a = 60000000;
        long b = 40000000;
        long c;

        System.out.println("\n=========ARITHMETICAL OPERATORS=========");
        c = a+b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        c =a-b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        c = a*b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        c = a/b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        c = a%b;
        System.out.printf("%d %% %d = %d\n", a, b ,c);

        //Arithmetical Exception
//        c = (long) (a/0);
//        System.out.printf("%d / 0 = %d\n", a, c);
//        c = (long) (a%0);
//        System.out.printf("%d %% 0 = %d\n", a, c);
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        a = 600000978;
        System.out.printf("%d++ = %d\n", a, a++);
        a = 68765444;
        System.out.printf("++%d = %d\n", a, ++a);
        a = 64356787;
        System.out.printf("%d-- = %d\n", a, a--);
        a = 6324567884L;
        System.out.printf("--%d = %d\n", a, --a);

        a = 667543567;
        b = 487654356;
        System.out.println("\n=========BITWISE OPERATORS=========");
        c = a&b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.printf("%s & %s = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        c = a|b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.printf("%s | %s = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        c = a^b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.printf("%s ^ %s = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.printf("~%s = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(c));
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(c));
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.printf("%s << 1 = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(c));
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(c));
        a = -50324032;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.printf("%s >> 1 = %s\n\n", Long.toBinaryString(a), Long.toBinaryString(c));
        a = -54567543;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        a = 24356784;
        c = 65467865;
        System.out.printf("%d += %d --> c = %d\n", c, a, c+=a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c-=a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c*=a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c/=a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c%=a);

        //Arithmetical Exception
//        System.out.printf("%d %= 0 --> c = %d\n", c, 0, c%=0);
//        System.out.printf("%d /= 0 --> c = %d\n", c, 0, c/=0);
        c = 689765433245L;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c&=a);
        c = 4567898765L;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c|=a);
        c = 667543546;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c^=a);
        c = 690876543;
        System.out.printf("%d >>= 1 --> c = %d\n", c, c>>=1);
        c = 345678986;
        System.out.printf("%d <<= 1 --> c = %d\n", c, c<<=1);
        c = 456789446;
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c>>>=1);

        System.out.println("\n=========RELATIONAL OPERATORS=========");
        a = 69876543;
        b = 44356789;
        System.out.printf("%d < %d --> %b\n", a, b, a<b);
        System.out.printf("%d <= %d --> %b\n", a, b, a<=b);
        System.out.printf("%d > %d --> %b\n", a, b, a>b);
        System.out.printf("%d >= %d --> %b\n", a, b, a>=b);
        System.out.printf("%d == %d --> %b\n", a, b, a==b);
        System.out.printf("%d != %d --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");
        a = 690876543;
        b = 409876543;
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, b, (a>b)&&(b>0));
        System.out.printf("(%d > %d) & (%d < 0) --> %b\n", a, b, b, (a>b)&(b<0));
        System.out.printf("(%d > %d) || (%d < 0) --> %b\n", a, b, a, (a>b)||(a<0));
        System.out.printf("(%d < %d) | (%d < 0) --> %b\n", a, b, a, (a<b)|(a<0));
        System.out.printf("(%d > %d) ^ (%d < 0) --> %b\n", a, b, a, (a>b)^(a<0));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%d == %d ? %d : %d --> %d\n", a, b, a, b, a==b ? a:b);

        System.out.println("\n=========TYPE CAST OPERATORS=========");
        byte bt = -20;
        int i = 100000;
        short sh = -30000;
        char ch = 'a';
        //long lg = 10000000000L;
        float f = 5.4f;
        double db = 5435.345;
        boolean bool = true;
        String s = "a";
        Student st = new Student("Valera", 10);

        c = sh;
        System.out.printf("long = short: c = %d --> c=%d\n",sh,c);
        c = bt;
        System.out.printf("long = byte: c = %d --> c=%d\n",bt,c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c=%d\n",ch,c);
        c = i;
        System.out.printf("long = int: c = %d --> c=%d\n",i,c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c=%d\n",f,c);
        c = (long) db;
        System.out.printf("long = double: c = (long)%f --> c=%d\n",db,c);
        //Compile Error
        //c = st;
        //c = s;
        //c = (long) bool;
    }
    public static void testFloat(){
        float a = 6.31f;
        float b = 4.12f;
        float c;

        System.out.println("\n=========ARITHMETICAL OPERATORS=========");
        c = a+b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        c =a-b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        c = a*b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        c = a/b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        c = a%b;
        System.out.printf("%f %% %f = %f\n", a, b ,c);

        c = a/0;
        System.out.printf("%f / 0 = %f\n", a, c);
        c = a%0;
        System.out.printf("%f %% 0 = %f\n", a, c);
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        a = 6.34f;
        System.out.printf("%f++ = %f\n", a, a++);
        a = 6.34f;
        System.out.printf("++%f = %f\n", a, ++a);
        a = 6.34f;
        System.out.printf("%f-- = %f\n", a, a--);
        a = 6.34f;
        System.out.printf("--%f = %f\n", a, --a);

//        System.out.println("\n=========BITWISE OPERATORS=========");
//        c = a&b;
//        System.out.printf("%d & %d = %d\n", a, b, c);
//        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = a|b;
//        System.out.printf("%d | %d = %d\n", a, b, c);
//        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = a^b;
//        System.out.printf("%d ^ %d = %d\n", a, b, c);
//        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = ~a;
//        System.out.printf("~%d = %d\n", a, c);
//        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c = a >> 1;
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c = a << 1;
//        System.out.printf("%d << 1 = %d\n", a, c);
//        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c = a >>> 1;
//        System.out.printf("%d >>> 1 = %d\n", a, c);
//        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        a = -5;
//        c = a >> 1;
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        a = -5;
//        c = a >>> 1;
//        System.out.printf("%d >>> 1 = %d\n", a, c);
//        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        a = 4.3f;
        c = 6.6f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c+=a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c-=a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c*=a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c/=a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c%=a);

        System.out.println("a /= 0 -->");
        System.out.println(a/=0);
        System.out.println("a %= 0 -->");
        System.out.println(a%=0);

//        c = 6.5;
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c&=a);
//        c = 6.5;
//        System.out.printf("%f |= %f --> c = %f\n", c, a, c|=a);
//        c = 6.5;
//        System.out.printf("%f ^= %f --> c = %f\n", c, a, c^=a);
//        c = 6.5;
//        System.out.printf("%f >>= 1 --> c = %f\n", c, c>>=1);
//        c = 6.5;
//        System.out.printf("%f <<= 1 --> c = %f\n", c, c<<=1);
//        c = 6.5;
//        System.out.printf("%f >>>= 1 --> c = %f\n", c, c>>>=1);

        System.out.println("\n=========RELATIONAL OPERATORS=========");
        a = 3.5f;
        b = 4.5f;
        System.out.printf("%f < %f --> %b\n", a, b, a<b);
        System.out.printf("%f <= %f --> %b\n", a, b, a<=b);
        System.out.printf("%f > %f --> %b\n", a, b, a>b);
        System.out.printf("%f >= %f --> %b\n", a, b, a>=b);
        System.out.printf("%f == %f --> %b\n", a, b, a==b);
        System.out.printf("%f != %f --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");
        a = 6.4f;
        b = 4.2f;
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, b, (a>b)&&(b>0));
        System.out.printf("(%f > %f) & (%f < 0) --> %b\n", a, b, b, (a>b)&(b<0));
        System.out.printf("(%f > %f) || (%f < 0) --> %b\n", a, b, a, (a>b)||(a<0));
        System.out.printf("(%f < %f) | (%f < 0) --> %b\n", a, b, a, (a<b)|(a<0));
        System.out.printf("(%f > %f) ^ (%f < 0) --> %b\n", a, b, a, (a>b)^(a<0));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%f == %f ? %f : %f --> %f\n", a, b, a, b, a==b ? a:b);

        System.out.println("\n=========TYPE CAST OPERATORS=========");
        byte bt = -20;
        int i = 100000;
        short sh = -30000;
        char ch = 'a';
        long lg = 10000000000L;
        //float f = 5.4f;
        double db = 5435.345;
        boolean bool = true;
        String s = "a";
        Student st = new Student("Valera", 10);

        c = sh;
        System.out.printf("float = short: c = %d --> c=%f\n",sh,c);
        c = bt;
        System.out.printf("float = byte: c = %d --> c=%f\n",bt,c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c=%f\n",ch,c);
        c = lg;
        System.out.printf("float = long: c = %d --> c=%f\n",lg,c);
        c = (float) db;
        System.out.printf("float = double: c = (float)%f --> c=%f\n",db,c);
        c = i;
        System.out.printf("float = int: c = %d --> c=%f\n",i,c);
        //Compile Error
        //c = st;
        //c = s;
        //c = (float) bool;
    }
    public static void testDoable(){
        double a = 6.31;
        double b = 4.12;
        double c;

        System.out.println("\n=========ARITHMETICAL OPERATORS=========");
        c = a+b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        c =a-b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        c = a*b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        c = a/b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        c = a%b;
        System.out.printf("%f %% %f = %f\n", a, b ,c);

        c = a/0;
        System.out.printf("%f / 0 = %f\n", a, c);
        c = a%0;
        System.out.printf("%f %% 0 = %f\n", a, c);
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        a = 6.34;
        System.out.printf("%f++ = %f\n", a, a++);
        a = 6.34;
        System.out.printf("++%f = %f\n", a, ++a);
        a = 6.34;
        System.out.printf("%f-- = %f\n", a, a--);
        a = 6.34;
        System.out.printf("--%f = %f\n", a, --a);

//        System.out.println("\n=========BITWISE OPERATORS=========");
//        c = a&b;
//        System.out.printf("%d & %d = %d\n", a, b, c);
//        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = a|b;
//        System.out.printf("%d | %d = %d\n", a, b, c);
//        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = a^b;
//        System.out.printf("%d ^ %d = %d\n", a, b, c);
//        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = ~a;
//        System.out.printf("~%d = %d\n", a, c);
//        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c = a >> 1;
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c = a << 1;
//        System.out.printf("%d << 1 = %d\n", a, c);
//        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c = a >>> 1;
//        System.out.printf("%d >>> 1 = %d\n", a, c);
//        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        a = -5;
//        c = a >> 1;
//        System.out.printf("%d >> 1 = %d\n", a, c);
//        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        a = -5;
//        c = a >>> 1;
//        System.out.printf("%d >>> 1 = %d\n", a, c);
//        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        a = 4.3;
        c = 6.6;
        System.out.printf("%f += %f --> c = %f\n", c, a, c+=a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c-=a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c*=a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c/=a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c%=a);

        System.out.println("a /= 0 -->");
        System.out.println(a/=0);
        System.out.println("a %= 0 -->");
        System.out.println(a%=0);

//        c = 6.5;
//        System.out.printf("%f &= %f --> c = %f\n", c, a, c&=a);
//        c = 6.5;
//        System.out.printf("%f |= %f --> c = %f\n", c, a, c|=a);
//        c = 6.5;
//        System.out.printf("%f ^= %f --> c = %f\n", c, a, c^=a);
//        c = 6.5;
//        System.out.printf("%f >>= 1 --> c = %f\n", c, c>>=1);
//        c = 6.5;
//        System.out.printf("%f <<= 1 --> c = %f\n", c, c<<=1);
//        c = 6.5;
//        System.out.printf("%f >>>= 1 --> c = %f\n", c, c>>>=1);

        System.out.println("\n=========RELATIONAL OPERATORS=========");
        a = 3.5;
        b = 4.5;
        System.out.printf("%f < %f --> %b\n", a, b, a<b);
        System.out.printf("%f <= %f --> %b\n", a, b, a<=b);
        System.out.printf("%f > %f --> %b\n", a, b, a>b);
        System.out.printf("%f >= %f --> %b\n", a, b, a>=b);
        System.out.printf("%f == %f --> %b\n", a, b, a==b);
        System.out.printf("%f != %f --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");
        a = 6.4;
        b = 4.2;
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, b, (a>b)&&(b>0));
        System.out.printf("(%f > %f) & (%f < 0) --> %b\n", a, b, b, (a>b)&(b<0));
        System.out.printf("(%f > %f) || (%f < 0) --> %b\n", a, b, a, (a>b)||(a<0));
        System.out.printf("(%f < %f) | (%f < 0) --> %b\n", a, b, a, (a<b)|(a<0));
        System.out.printf("(%f > %f) ^ (%f < 0) --> %b\n", a, b, a, (a>b)^(a<0));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%f == %f ? %f : %f --> %f\n", a, b, a, b, a==b ? a:b);

        System.out.println("\n=========TYPE CAST OPERATORS=========");
        byte bt = -20;
        int i = 100000;
        short sh = -30000;
        char ch = 'a';
        long lg = 10000000000L;
        float f = 5.4f;
        //double db = 5435.345;
        boolean bool = true;
        String s = "a";
        Student st = new Student("Valera", 10);

        c = sh;
        System.out.printf("double = short: c = %d --> c=%f\n",sh,c);
        c = bt;
        System.out.printf("double = byte: c = %d --> c=%f\n",bt,c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c=%f\n",ch,c);
        c = lg;
        System.out.printf("double = long: c = %d --> c=%f\n",lg,c);
        c = f;
        System.out.printf("double = float: c = %f --> c=%f\n",f,c);
        c = i;
        System.out.printf("double = int: c = %d --> c=%f\n",i,c);


        //Compile Error
        //c = st;
        //c = s;
        //c = (double) bool;
    }
    public static void testBoolean(){
        boolean a = true;
        boolean b = false;
        boolean c = true;
        //ARITHMETICAL OPERATION not use

        System.out.println("\n=========BITWISE OPERATORS=========");

        a = true; b = true;
        c = a & b;
        System.out.printf("%b & %b --> %b\n",a,b,c);
        a = false; b = false;
        c = a & b;
        System.out.printf("%b & %b --> %b\n",a,b,c);
        a = true; b = false;
        c = a & b;
        System.out.printf("%b & %b --> %b\n",a,b,c);
        a = false; b = true;
        c = a & b;
        System.out.printf("%b & %b --> %b\n\n",a,b,c);

        a = true; b = true;
        c = a | b;
        System.out.printf("%b | %b --> %b\n",a,b,c);
        a = false; b = false;
        c = a | b;
        System.out.printf("%b | %b --> %b\n",a,b,c);
        a = true; b = false;
        c = a | b;
        System.out.printf("%b | %b --> %b\n",a,b,c);
        a = false; b = true;
        c = a | b;
        System.out.printf("%b | %b --> %b\n\n",a,b,c);

        a = true; b = true;
        c = a ^ b;
        System.out.printf("%b ^ %b --> %b\n",a,b,c);
        a = false; b = false;
        c = a ^ b;
        System.out.printf("%b ^ %b --> %b\n",a,b,c);
        a = true; b = false;
        c = a ^ b;
        System.out.printf("%b ^ %b --> %b\n",a,b,c);
        a = false; b = true;
        c = a ^ b;
        System.out.printf("%b ^ %b --> %b\n\n",a,b,c);

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        c = true;
        System.out.printf("%b &= %b --> c = %b\n", c, a, c&=a);
        c = true;
        System.out.printf("%b |= %b --> c = %b\n", c, a, c|=a);
        c = true;
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c^=a);

        System.out.println("\n=========RELATIONAL OPERATORS=========");
        a = false;
        b = true;
        System.out.printf("%b == %b --> %b\n", a, b, a==b);
        System.out.printf("%b != %b --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");

        System.out.printf("(%b == %b) & (%b != %b) --> %b\n", a, b, a, c, (a == b) & (a != c));
        System.out.printf("(%b != %b) && (%b != %b) --> %b\n", a, b, a, c, (a != b) && (a != c));
        System.out.printf("(%b == %b) | (%b != %b) --> %b\n", a, b, a, c, (a == b) | (a != c));
        System.out.printf("(%b == %b) | (%b == %b) --> %b\n", a, b, a, c, (a == b) | (a == c));
        System.out.printf("(%b == %b) ^ (%b != %b) --> %b\n\n", a, b, a, c, (a == b) ^ (a != c));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%b == %b ? %b : %b --> %b\n", a, b, a, b, a==b ? a:b);

        //BOOLEAN cann't be used
        //c = (boolean) bt;
        //c = (boolean) sh;
        //c = (boolean) ch;
        //c = (boolean) l;
        //c = (boolean) f;
        //c = (boolean) d;
        //c = (boolean) s;
    }

    public static void testString(){
        String a = "a";
        String b = "a";
        String c;


        System.out.println("\n=========ARITHMETICAL OPERATORS=========");
        c = a+b;
        System.out.printf("%s + %s = %s\n", a, b, c);
        //c = a-b;
        //System.out.printf("%c - %c = %c\n", a, b, c);
        //c = a*b;
        //System.out.printf("%c * %c = %c\n", a, b, c);
        //c =  (a/b);
        //System.out.printf("%c / %c = %c\n", a, b, c);
        //c = (a%b);
        //System.out.printf("%c %% %c = %c\n", a, b ,c);

        //Arithmetical Exception
//        c = (a/0);
//        System.out.printf("%c / 0 = %c\n", a, c);
//        c = (a%0);
//        System.out.printf("%c %% 0 = %c\n", a, c);
//        c = -a;
//        System.out.printf("-%c = %c\n", a, c);
//        c = +a;
//        System.out.printf("+%c = %c\n", a, c);
//        a = "a";
//        System.out.printf("%c++ = %c\n", a, a++);
//        a = "a";
//        System.out.printf("++%c = %c\n", a, ++a);
//        a = "a";
//        System.out.printf("%c-- = %c\n", a, a--);
//        a = "a";
//        System.out.printf("--%c = %c\n", a, --a);
//
//        a = "a";
//        b = "a";
//        System.out.println("\n=========BITWISE OPERATORS=========");
//        c = (a&b);
//        System.out.printf("%c & %c = %c\n", a, b, c);
//        System.out.printf("%s & %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = (a|b);
//        System.out.printf("%c | %c = %c\n", a, b, c);
//        System.out.printf("%s | %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = (a^b);
//        System.out.printf("%c ^ %c = %c\n", a, b, c);
//        System.out.printf("%s ^ %s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
//        c = ~a;
//        System.out.printf("~%c = %c\n", a, c);
//        System.out.printf("~%s = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c =(a >> 1);
//        System.out.printf("%c >> 1 = %c\n", a, c);
//        System.out.printf("%s >> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c =(a << 1);
//        System.out.printf("%c << 1 = %c\n", a, c);
//        System.out.printf("%s << 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
//        c =(a >>> 1);
//        System.out.printf("%c >>> 1 = %c\n", a, c);
//        System.out.printf("%s >>> 1 = %s\n\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n=========ASSIGNMENT OPERATORS=========");
        a = "a";
        c = "b";
        System.out.printf("%s += %s --> c = %s\n", c, a, c+=a);
//        System.out.printf("%c -= %c --> c = %c\n", c, a, c-=a);
//        System.out.printf("%c *= %c --> c = %c\n", c, a, c*=a);
//        System.out.printf("%c /= %c --> c = %c\n", c, a, c/=a);
//        System.out.printf("%c %%= %c --> c = %c\n", c, a, c%=a);

//            //Arithmetical Exception
////        System.out.printf("%d %= 0 --> c = %d\n", c, 0, c%=0);
////        System.out.printf("%d /= 0 --> c = %d\n", c, 0, c/=0);
//        c = "a";
//        System.out.printf("%c &= %c --> c = %c\n", c, a, c&=a);
//        c = "a";
//        System.out.printf("%c |= %c --> c = %c\n", c, a, c|=a);
//        c = "a";
//        System.out.printf("%c ^= %c --> c = %c\n", c, a, c^=a);
//        c = "a";
//        System.out.printf("%c >>= 1 --> c = %c\n", c, c>>=1);
//        c = "a";
//        System.out.printf("%c <<= 1 --> c = %c\n", c, c<<=1);
//        c = "a";
//        System.out.printf("%c >>>= 1 --> c = %c\n", c, c>>>=1);

            System.out.println("\n=========RELATIONAL OPERATORS=========");
            a = "a";
            b = "b";
//            System.out.printf("%c < %c --> %b\n", a, b, a<b);
//            System.out.printf("%c <= %c --> %b\n", a, b, a<=b);
//            System.out.printf("%c > %c --> %b\n", a, b, a>b);
//            System.out.printf("%c >= %c --> %b\n", a, b, a>=b);
            System.out.printf("%s == %s --> %b\n", a, b, a==b);
            System.out.printf("%s != %s --> %b\n", a, b, a!=b);

        System.out.println("\n=========LOGICAL OPERATORS=========");
            a = "a";
            b = "b";
            c = "c";
            System.out.printf("(%s == %s) && (%s != %s) --> %b\n", a, b, b, c, (a==b)&&(b!=c));
            System.out.printf("(%s != %s) & (%s != %s) --> %b\n", a, b, b, c, (a!=b)&(b!=c));
            System.out.printf("(%s == %s) || (%s == %s) --> %b\n", a, b, a, c, (a==b)||(a==c));
            System.out.printf("(%s != %s) | (%s == %s) --> %b\n", a, b, a, c, (a!=b)|(a==c));
            System.out.printf("(%s != %s) ^ (%s != %s) --> %b\n", a, b, a, c, (a!=b)^(a!=c));

        System.out.println("\n=========MISC OPERATORS=========");
        a = "a";
        b = "b";
        System.out.printf("%s == %s ? %s : %s --> %s\n", a, b, a, b, a==b ? a:b);

//        System.out.println("\n=========TYPE CAST OPERATORS=========");
//        byte bt = -20;
//        int i = 100000;
//        short sh = -30000;
//        char ch = 'a';
//        long lg = 10000000000L;
//        float f = 5.4f;
//        double db = 5435.345;
//        boolean bool = true;
//        Student st = new Student("Valera", 10);

        //Compile Error
//        c = i;
//        System.out.printf("string = int: c = (string)%d --> c=%s\n",i,c);
//        c = bt;
//        System.out.printf("string = byte: c = (string)%d --> c=%s\n",bt,c);
//        c = sh;
//        System.out.printf("string = char: c = (string)%d --> c=%s\n",sh,c);
//        c = lg;
//        System.out.printf("string = long: c = (string)%d --> c=%s\n",lg,c);
//        c = f;
//        System.out.printf("string = float: c = (string)%f --> c=%s\n",f,c);
//        c = db;
//        System.out.printf("string = double: c = (string)%f --> c=%s\n",db,c);
//        c = st;
        //c = (string) bool;
    }
    public static  void testStudent(){
        Student st1 = new Student("Valera", 10);
        Student st2 = new Student("Pyps", 7);
        //ARITHMETICAL cann't be used
        //ASSIGNMENT cann't be used
        //BITWISE can'nt be used

        System.out.println("\n=========RELATIONAL OPERATORS=========");

        System.out.printf("%s < %s --> %b\n", st1, st2, st1.mark<st2.mark);
        System.out.printf("%s <= %s --> %b\n", st1, st2, st1.mark<=st2.mark);
        System.out.printf("%s > %s --> %b\n", st1, st2, st1.mark>st2.mark);
        System.out.printf("%s >= %s --> %b\n", st1, st2, st1.mark>=st2.mark);
        System.out.printf("%s == %s --> %b\n", st1, st2, st1.mark==st2.mark);
        System.out.printf("%s != %s --> %b\n", st1, st2, st1.mark!=st2.mark);

        System.out.println("\n=========LOGICAL OPERATORS=========");

        System.out.printf("(%s == %s) && (%s != %s) --> %b\n", st1, st2, st1, st2, (st1==st2)&&(st1!=st1));
        System.out.printf("(%s != %s) & (%s != %s) --> %b\n", st1, st2, st1, st2, (st1!=st2)&(st1==st2));
        System.out.printf("(%s == %s) || (%s == %s) --> %b\n", st1, st2, st1, st2, (st1==st2)||(st1==st2));
        System.out.printf("(%s != %s) | (%s == %s) --> %b\n", st1, st2, st1, st2, (st1!=st2)|(st1==st2));
        System.out.printf("(%s != %s) ^ (%s != %s) --> %b\n", st1, st2, st1, st2, (st1!=st2)^(st1!=st2));

        System.out.println("\n=========MISC OPERATORS=========");
        System.out.printf("%s == %s ? %s : %s --> %s\n", st1, st2, st1, st2, st1==st2 ? st1:st2);

//        System.out.println("\n=========TYPE CAST OPERATORS=========");
//        byte bt = -20;
//        int i = 100000;
//        short sh = -30000;
//        char ch = 'a';
//        long lg = 10000000000L;
//        float f = 5.4f;
//        double db = 5435.345;
//        boolean bool = true;
//          String s = "a"
//        Student st = new Student("Valera", 10);
        //Compile Error
//        c = i;
//        System.out.printf("student = int: c = %d --> c=%s\n",i,c);
//        c = bt;
//        System.out.printf("student = byte: c = %d --> c=%s\n",bt,c);
//        c = sh;
//        System.out.printf("student = char: c = %d --> c=%s\n",sh,c);
//        c = lg;
//        System.out.printf("student = long: c = %d --> c=%s\n",lg,c);
//        c = f;
//        System.out.printf("student = float: c = %f --> c=%s\n",f,c);
//        c = db;
//        System.out.printf("student = double: c = %f --> c=%s\n",db,c);
        //c = st;
        //c = s;
        //c = bool;

    }
}