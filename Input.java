import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //string example
        System.out.println("Enter a string:");
        String str = obj.nextLine();
        System.out.println("String = " + str);

  //float example
       System.out.println("enter a float number");
       float f1 =obj.nextFloat();
       System.out.println("float number is ="+f1);

        //boolean example
        System.out.println("enter a boolean ");
        boolean b1 =obj.nextBoolean();
        System.out.println("result is ="+b1);

        //int 
         
       System.out.println("enter a int number");
       int i1 =obj.nextInt();
       System.out.println("int number is ="+i1);

       //nextShort(),nextLong(),nextByte(),nextDouble

        


        obj.close();
    }
};
