/**
 * A lottery number guessing name.
 * 
 * @author David Johnson
 * @version 10/20/14
 */

//importing scanner class
import java.util.Scanner;

public class Lottery
{
    
    public static void main(String[] args)
    {
        
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        
	//declaring strings needed for loop and user input
        String lotteryNum = "";
        String userGuess = "";
        
	//for loop generating three random numbers put together
        for(int counter = 0; counter <= 2; counter++){
           
            int randNum = 0 + (int)(Math.random() * 9); 
            lotteryNum += randNum;
            
        }
        
	//asking the user for input and and setting it to user guess
        System.out.print("Please enter your three numbers (e.g. 123): ");
        userGuess = in.nextLine();
        
	//parsing the lottery number into seperate ints
        int lotteryNum1 = Integer.parseInt(lotteryNum.substring(0,1));
        int lotteryNum2 = Integer.parseInt(lotteryNum.substring(1,2));
        int lotteryNum3 = Integer.parseInt(lotteryNum.substring(2,3));
        
	//parsing user ints into seperate ints
        int userGuess1 = Integer.parseInt(userGuess.substring(0,1));
        int userGuess2 = Integer.parseInt(userGuess.substring(1,2));
        int userGuess3 = Integer.parseInt(userGuess.substring(2,3));
        
	//printing out part of visual structure
        System.out.println("    Winner: " + lotteryNum);
        
	//if else structure finding the winners combo
        if (lotteryNum1 == userGuess1){
            
            System.out.println("    Congrats, the front pair matches.");
        
        }else if (lotteryNum2 == userGuess2){          
     
            System.out.println("    Congrats, the middle pair matches.");
            
        }else if (lotteryNum3 == userGuess3){
            
            System.out.println("    Congrats, the last pair matches.");
            
        }else if (lotteryNum1 == userGuess1 && lotteryNum2 == userGuess2){
        
            System.out.println("    Congrats, The first two numbers match");
            
        }else if (lotteryNum1 == userGuess1 &&  lotteryNum3 == userGuess3){
        
            System.out.println("    Congrats, The first and third numbers match");
            
        }else if (lotteryNum2 == userGuess2 && lotteryNum3 == userGuess3){
        
            System.out.println("    Congrats, The second and third numbers match");
        
        }else if (lotteryNum1 == userGuess1 && lotteryNum2 == userGuess2 && lotteryNum3 == userGuess3){
            
            System.out.println("    Congrats, All three match! You won! You're a millionare!");
            
        }else{
            
            System.out.println("    Sorry, no matches. Better luck next time mate!");
            
        }
       
    } //end main
    
}//end class Lottery
