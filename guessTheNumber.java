import java.util.*;

class game{
    int noOfGuess,userInput,randomNum;

    public game(){
        noOfGuess=0;
        Random random=new Random();
        randomNum=random.nextInt(100);
    }

    public void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Guess number: ");
        userInput=sc.nextInt();
    }

    public void setNoOfGuess(){
        noOfGuess++;
    }

    public int getNoOfGuess(){
        return noOfGuess;
    }

    public boolean isCorrectGuess(){
        if(userInput>randomNum)
            System.out.println("Entered number is too high to the generated number !!\n");
        else if(userInput<randomNum)
            System.out.println("Entered number is too low to the generated number !!\n");
        else{
            System.out.print("You guessed it right,the number is "+randomNum);
            System.out.println("\n\t\t\t...........................................");
            System.out.println("\t\t\t\t\tYou WIN :)");
            System.out.println("\t\t\t...........................................\n");

            return true;
        }
        return false;
    } 
}
public class guessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("\n\t\t\t***********************************");
        System.out.println("\t\t\t\tGuess the number");
        System.out.println("\t\t\t***********************************");
        System.out.println("\n\n***********************************");
        System.out.println("\t\tRULES");
        System.out.println("***********************************\n");

        System.out.println("Computer will generate a random number and user has to guess it.");
        System.out.println("User has to enter number till he guess the number correctly.");
        System.out.println("1.If the user entered number is equal to the random number then he wins.");
        System.out.println("2.If user entered number is lower than random number then too low is printed.");
        System.out.println("3.If user entered number is higher than random number then too high is printed.\n\n");
        System.out.println("\t\t\t--------------------------------------------");
        System.out.println("\t\t\t\t\tGame Starts!!");
        System.out.println("\t\t\t--------------------------------------------\n\n");

        String ans;

        game g1;
        boolean res;
        do{
            g1=new game();
            res=false;
            while(!res){
                g1.takeUserInput();
                res=g1.isCorrectGuess();
                g1.setNoOfGuess();
            }
            System.out.printf("\nYou guess the number in %d attemps ",g1.getNoOfGuess());
            System.out.println("\n\n-------------------------------------------------------");

            System.out.print("Do you want to play again(y/n): ");
            ans=sc.next();			
            System.out.println("\n\n");				

        }while(ans.equals("y")||ans.equals("Y"));
        
    }
}
