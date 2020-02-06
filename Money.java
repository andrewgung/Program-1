/********
 Author:
 Program: Money class - program assignment #1
 Due Date:
 Purpose:
 ********/

import java.util.*;
import java.text.*;

public class Money
{

public static void main(String[] args){
  Scanner s = new Scanner(System.in);
    // declare class variables
    int hundreds, tens, fives, ones, quarters, dimes, nickels, pennies;
    //test = hundreds * 100 + tens * 10 + fives * 5 + ones * 1 + quarters * .25 + dimes * .1 + nickels * .05 + pennies * .01
    double customerPayment, transactionCost;
     // used to store the Money value as a double precision floating point number like 34.2
    // you will need more variables declared here to handle each of the currency types; for example int hundreds to keep track of how many hundred dollar bills

    // this one will help you print floating point values in US currency format like $10.50
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    // convert current currency values to a string

      return hundreds + " hundreds " + tens + " tens " + fives + " fives " + ones + " ones " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies ";
      s.nextLine();
    }

    // converts amount to US currency format
    public String toCurrency(double int amount);
    {
      return nf.format(Math.round(amount * 100.0) / 100.0);
      s.nextLine();
    }

    // convert currency to float
    // read currency values from Scanner s and compute value
    // output results
    public void processChange(Scanner s)
    {
      //system.out.print ()
      hundreds = s.nextInt();
      tens = s.nextInt();
      fives = s.nextInt();
      ones = s.nextInt();
      quarters = s.nextInt();
      dimes = s.nextInt();
      nickels = s.nextInt();
      pennies = s.nextInt();

      total = (hundreds * 100) + (tens * 10) + (fives * 5) + (ones * 1) + (quarters * .25) + (dimes * .1) + (nickels * .05) + (pennies * .01);
      System.out.println("$" + total);
      s.nextLine();
    }
    // read from Scanner s and process float command
    // convert float to change
    // output results
    public void processFloat(Scanner s)
    {
      double total = s.nextDouble();
      hundreds = (int)(total/100);
      total = total - (hundreds * 100);
      tens = (int)(total/10);
      total = total - (tens * 10);
      fives = (int)(total/5);
      total = total - (fives * 5);
      ones = (int)(total/1);
      total = total - ones - (ones * 1);
      quarters = (int)(total/.25);
      total = total - (quarters * .25);
      dimes = (int)(total/.1);
      total = total - (dimes * .1);
      nickels = (int)(total/.05);
      total = total - (nickels * .05);
      pennies = (int)(total/.01);
      total = total - (pennies * .01);
      s.nextLine();
    }

    // read from Scanner s and process check command
    // convert float to dollar words & cents
    // output results
    public void processCheck(Scanner s)
    {

    }

    // read from Scanner s and process change-float command
    // read float of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeFloat(Scanner s)
    {
      double customerPayment = s.nextFloat();
      double transactionCost = s.nextFloat();

      double change = transactionCost - customerPayment;
      int changehundreds = (int)(change/100);
      change = change - (changehundreds * 100);
      int changetens = (int)(change/10);
      change = change - (changetens * 10);
      int changefives = (int)(change/5);
      change = change - (changefives * 5);
      int changeones = (int)(change/1);
      change = change - (changeones * 1);
      int changequarters = (int)(change/.25);
      change = change - (changequarters * .25);
      int changedimes = (int)(change/.1);
      change = change - (changedimes * .1);
      int changenickels = (int)(change/.05);
      change = change - (changenickels * .05);
      int changepennies = (int)(change/.01);
      change = change - (changepennies * .01);
      s.nextLine();


    // read from Scanner s and process change-change command
    // read change of customer payment
    // read float of transaction cost
    // calculate difference and compute change values
    // output the results
    public void processChangeChange(Scanner s)
    {
      int hundreds; int tens; int fives; int ones; int quarters; int dimes; int nickels; int pennies;
      System.out.print("hundreds:");
      hundreds = s.nextInt();
      System.out.print("tens:");
      tens = s.nextInt();
      System.out.print("fives:");
      fives = s.nextInt();
      System.out.print("ones:");
      ones = s.nextInt();
      System.out.print("quarters:");
      quarters = s.nextInt();
      System.out.print("dimes:");
      dimes = s.nextInt();
      System.out.print("nickels:");
      nickels = s.nextInt();
      System.out.print("pennies:");
      pennies = s.nextInt();
      double total = hundreds*100 + tens*10 + fives*5 + ones*1 + quarters*.25 + dimes*.1 + nickels*.05 + pennies*.01;

      double customerPayment = s.nextFloat();
      double transactionCost = s.nextFloat();

      double change = transactionCost - customerPayment;
      int changehundreds = (int)(change/100);
      change = change - (changehundreds * 100);
      int changetens = (int)(change/10);
      change = change - (changetens * 10);
      int changefives = (int)(change/5);
      change = change - (changefives * 5);
      int changeones = (int)(change/1);
      change = change - (changeones * 1);
      int changequarters = (int)(change/.25);
      change = change - (changequarters * .25);
      int changedimes = (int)(change/.1);
      change = change - (changedimes * .1);
      int changenickels = (int)(change/.05);
      change = change - (changenickels * .05);
      int changepennies = (int)(change/.01);
      change = change - (changepennies * .01);
      s.nextLine();
    }
}
