package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        try{
            int b = 7 / a;
            String s = "12kdfkjdf";
            int i = Integer.parseInt(s);
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельз");
        } catch (Exception e1){

        }
        finally {
            System.out.println("МЫ вблоке finally");

        }
        System.out.println("Привет");
    }


    }

