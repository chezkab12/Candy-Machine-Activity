package SecondSem;

import java.util.Scanner;

public class CandyMachine {

  public static Scanner input = new Scanner(System.in);
  public static String again;
  public static int choose,quantity=1;
  public static double total=0,pay;
  public static void menu() { System.out.println("\t\t\t\t\t\t\t\t+===============+");
  System.out.println("\t\t\t\t     CANDY MACHINE MENU ");
  System.out.println("\t\t\t\t 1. Frutos        1.00 ");
  System.out.println("\t\t\t\t 2. Potchi        1.00 ");
  System.out.println("\t\t\t\t 3. Chubby        1.00 ");
  System.out.println("\t\t\t\t 4. Flat Tops     2.00 ");
  System.out.println("\t\t\t\t 5. Gumberry      6.00 ");
  System.out.println("\t\t\t\t 6. Sampalok      1.00 ");
  System.out.println("\t\t\t\t 7. Mr.Keso       1.00 ");
  System.out.println("\t\t\t\t 8. Maxx          1.00 ");
  System.out.println("\t\t\t\t 9. Milkita       5.00 ");
  System.out.println("\t\t\t\t 10. Mentos       5.00 ");
  System.out.println("\t\t\t\t 11. Cancel");
  }
  
  public static void order (){
  System.out.println("Press 1 to Frutos , Press 2 to Potchi");
  System.out.println("Press 3 to Chubby , Press 4 to Flat Tops");
  System.out.println("Press 5 to Gumberry , Press 6 to Sampalok");
  System.out.println("Press 7 to Mr.Keso , Press 8 to Maxx");
  System.out.println("Press 9 to Milkita , Press 10 to Mentos");
  System.out.println("Press 11 to Cancel");
  System.out.print("Press you want to buy? :");
  choose = input.nextInt();
  if (choose == 1){
    System.out.println("You choose Frutos");
    System.out.print("How many Frutos you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*1);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==2) {
    System.out.println("You choose Potchi");
    System.out.print("How many Potchi you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*1);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==3){
    System.out.println("You choose Chubby");
    System.out.print("How many Chubby you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*1);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==4) {
    System.out.println("You choose Flat Tops");
    System.out.print("How many Flat Tops you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*2);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==5) {
    System.out.println("You choose Gumberry");
    System.out.print("How many Gumberry you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*6);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==6) {
    System.out.println("You choose Sampalok");
    System.out.print("How many Sampalok you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*1);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==7) {
    System.out.println("You choose Mr.Keso");
    System.out.print("How many Mr.Keso you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*1);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==8) {
    System.out.println("You choose Maxx");
    System.out.print("How many Maxx you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*1);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==9) {
    System.out.println("You choose Milkita");
    System.out.print("How many Milkita you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*5);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is " + total);
      }
    }
  }else if(choose==10) {
    System.out.println("You choose Mentos");
    System.out.print("How many Mentos you want to buy? : ");
    quantity =input.nextInt();
    total = total +(quantity*5);
    
    System.out.println("Do you want to buy again? : ");
    System.out.println("Press Y for Yes and N for No: ");
    again = input.next();
    if (again.equalsIgnoreCase("Y")){
      order();
    }else{
      System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is: " + total);
      }
    }
  }else if(choose ==11) {
    System.out.println("Total price is " + total);
      System.out.println("Enter a payment: ");
      pay = input.nextDouble();
      if (pay <= total) {
        System.out.println("Not enough payment");
      }else{
      total = pay - total;
      System.out.println("Your change is: " + total);
      }
  }
    
  }
  
  public static void main(String[]Args) {
     menu();
     order();
     System.out.println("Item received.");
     System.out.println("Thank you!!");
  }
  
}