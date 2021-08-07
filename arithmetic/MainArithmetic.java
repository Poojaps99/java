import arithmetic.*;
import java.io.*;
class MainArithmetic {
    public static void main(String []args) throws IOException{
        arithmetic ar = new arithmetic();
        int n1,n2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1:");
        n1=Integer.parseInt(br.readLine());
        System.out.println("Enter number 2:");
        n2=Integer.parseInt(br.readLine());
        System.out.println("ADDITION :"+ar.add(n1,n2));
        System.out.println("SUBTRACTION :"+ar.subtract(n1,n2));
        System.out.println("MULTIPLICATION :"+ar.multiple(n1,n2));
        System.out.println("DIVISION :"+ar.divide(n1,n2));
        System.out.println("MODULUS :"+ar.remainder(n1,n2));
    }
}