//********************************************************************
//  Banking.java       Author: Lewis/Loftus
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

package com.company;

public class Transactions
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

       if(args.equals("a")){

           System.out.println("Hej hej");

       }
       Address addressAcount1 = new Address("Kongevej", "Birkeroed", "1st", 2563);
       Address addressAcount2 = new Address("Dronningsgade", "Holte", "st", 2564);
       Address addressAcount3 = new Address("Prinsvej", "Lyngby", "3st", 3363);


       Account acct1 = new Account("Ted Murphy", 72354, 102.56, addressAcount1);
       Account acct2 = new Account("Jane Smith", 69713, 40.00, addressAcount2);
       Account acct3 = new Account("Edward Demsey", 93757, 759.32, addressAcount3);

       acct1.deposit(25.85);

       double smithBalance = acct2.deposit(500.00);
       System.out.println("Smith balance after deposit: " +
               smithBalance);

       System.out.println("Smith balance after withdrawal: " +
               acct2.withdraw(430.75, 1.50));

       acct3.withdraw(800.00, 0.0);  // exceeds balance

       acct1.addInterest();
       acct2.addInterest();
       acct3.addInterest();

       System.out.println();
       System.out.println(acct1);
       System.out.println(acct2);
       System.out.println(acct3);


       System.out.println(acct1.getBalance());
       System.out.println(acct3.getBalance());
       acct3.sendMoney(200.00, acct1);
       System.out.println(acct1.getBalance());
       System.out.println(acct3.getBalance());

       Account acct4 = new Account("John", 005165);
       System.out.println("It works with only a name and account number " + acct4.getBalance());

       Address addres = Address.makeAddress();
   }
}
