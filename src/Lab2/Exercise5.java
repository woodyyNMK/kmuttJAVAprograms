package Lab2;
public class Exercise5 {
    public static void main(String[] args){
//        int x = 1;
//        boolean result1 = (x > 1) & (x++ < 10);
//        System.out.println(result1);
//        System.out.println(x);
//        x = 1;
//        boolean result2 = (x > 1) && (x++ < 10);
//        System.out.println(result2);
//        System.out.println(x);
//        
//        x = 1;
//        boolean result3 = (1 > x) && (1 > x++);
//        System.out.println(result3);
//        System.out.println(x);
//        x = 1;
//        boolean result4 = (1 > x) & (1 > x++);
//        System.out.println(result4);
//        System.out.println(x);
//        
//        x = 1;
//        boolean result5 = (1 > x) || (1 > x++);
//        System.out.println(result5);
//        System.out.println(x);
//        x = 1;
//        boolean result6 = (1 > x) | (1 > x++);
//        System.out.println(result6);
//        System.out.println(x);
//        
//        x = 1;
//        boolean result7 = (1 == x) || (10 > x++);
//        System.out.println(result7);
//        System.out.println(x);
//        x = 1;
//        boolean result8 = (1 == x) | (10 > x++);
//        System.out.println(result8);
//        System.out.println(x);

//int x = 1;
//boolean result = (x > 1) & (x++ < 10);
//        System.out.println(result);
//        System.out.println(x);
//        
//        x = 1;
//        boolean result2 = (x > 1) && (x++ < 10);
//        System.out.println(result2);
//        System.out.println(x);

String search = "peter pereas";
int max = search.length();
int numPs = 0;
for (int i = 0; i< max; i++){
    if (search.charAt(i)!='p')
        continue;
    numPs++;
}
        System.out.println(numPs);
    }
}
