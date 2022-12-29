package LabWeek5;
public class Calculator {
    public static double calculate_static(double a,String op, double b){
        double result = 0;
        switch(op){
            case "+" : result = a + b; break;
            case "-" : result = a - b; break;
            case "*" : result = a * b; break;
            case "/" : result = a / b; break;
        }
        return result;
    }
    public double calculate_simp(double a,String op, double b){
        double result = 0;
        switch(op){
            case "+" : result = a + b; break;
            case "-" : result = a - b; break;
            case "*" : result = a * b; break;
            case "/" : result = a / b; break;
        }
        return result;
    }
}
