package Application;

import java.util.Scanner;
import services.PrintServices;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        PrintServices ps = new PrintServices();
        
        System.out.print("How many values?");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());
        
        sc.close();
    }
    
}
