/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Billing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter photo price");
        double price=input.nextDouble();
        System.out.println("Enter photo quantity");
        double quantity=input.nextDouble();
        System.out.println("Enter cuopon value");
        double value=input.nextDouble();
        System.out.println("The price with added tax: "+computBill(price));
         System.out.println("The price for the quatity: " +computBill(price,quantity));
          System.out.println("The price when coupon included: "+computBill(price,quantity,value));
    }
    public static double computBill(double price){
    double totalDue=price*1.08;
    return totalDue;
    }
    public static double computBill(double price,double quantity){
        double totalDue=price*quantity*1.08;
    return totalDue;
    }
    public static double computBill(double price,double quantity,double value){
        double totalDue=((price*quantity)-value)*1.08;
    return totalDue;
    }
}
