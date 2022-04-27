package project_01;
import java.util.Scanner;

public class Project_01 {

public static int total_quantity=0; // Total quantity of products //
public static String[] product = { "1. Coffe","2. Tea","3. Cinnamon Buns","4. Soft Ice Cream"};
    	

public static int final_qty=0; // Total order
public static int coffePrice = 15;
public static int teaPrice = 10;
public static int cinnamonPrice = 5;
public static int icePrice = 20;
        
    public static void main(String[] args) {
        {
        Scanner a = new Scanner(System.in);
    		int choose, quantity;
    		int Coffe=0;
    		int Tea=0;
    		int Cinnamon=0;
    		int Ice=0;
    		char decision;
    System.out.println("Welcome to my cafe!");
        System.out.println("Here is the menu");
            System.out.println("");
    		do
    		{
     
            for (String prod : product) {
                if (prod != null) {
                    System.out.println(prod);
                }
            }
    System.out.println("");

    	System.out.print("Chose what product: ");
            choose=a.nextInt();
     
    	System.out.print("How many would you like? ");
            quantity=a.nextInt();
     
    switch(choose)
    {
    	case 1:
            Coffe += quantity;
            break;
     
    	case 2:
            Tea += quantity;
            break;
     
    	case 3: 
            Cinnamon += quantity;
            break;
     
        case 4: 
            Ice += quantity;
            break;
    			}
System.out.print("Would you like something else?: Y / N ");	
    decision=a.next().charAt(0);
        }while(decision != 'n' && decision != 'N');

final_qty = Coffe * coffePrice + Tea * teaPrice + Cinnamon * cinnamonPrice + Ice * icePrice;
String totalordermessage = String.format("Total order: %s SEK", final_qty);

System.out.println(totalordermessage); 

        }
    }
}
