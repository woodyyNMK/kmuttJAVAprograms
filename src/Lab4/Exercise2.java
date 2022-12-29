package Lab4;
public class Exercise2 {
    public static void main(String[] args){
        int [] myNumbers;
        double [] myDoubles;
        char myChars[];
        
        myNumbers = new int[5];
        myDoubles = new double[10];
        myChars = new char[5];
        boolean myBoolean[] = new boolean[5];
        
        System.out.println(myNumbers[0]);
        myNumbers[0] = 128;
        System.out.println(myNumbers[0]);
        //myNumbers[0] = 128.15;
        //System.out.println(myNumbers[0]);
        //System.out.println(myNumbers[10]);
        System.out.println(myDoubles[1]);
        System.out.println(myChars[2]);
        System.out.println(myBoolean[3]);
        
        int[] myNumbers1 = {10, 15, 18, 132, 0};
        System.out.println(myNumbers1[0]);
        System.out.println(myNumbers1[1]);
        System.out.println(myNumbers1[2]);
        System.out.println(myNumbers1[3]);
        System.out.println(myNumbers1[4]);        
    }
}
