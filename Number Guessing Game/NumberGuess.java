import java.util.Random;
import java.util.Scanner;
class NumberGuess{
   // @SuppressWarnings("PMD.BeanMembersShouldSerialize");
    public static void main(String[] args){
        Random dice = new Random();
        int x;
        x=dice.nextInt(100)+1;
        x++;
        Scanner var = new Scanner(System.in);
        int y;
        System.out.println("Guess a number between 1-100:");
        while(true){
            y=var.nextInt();
        if(x==y){
            System.out.println("Hurray!! Your Guess was correct");
            var.close();
            break;
        } else{
            System.out.println("Wrong Number, Guess again!");
            System.out.println(x>y?"Your Guess is a little small":"Your Guess was little big");

        }

        }        
    }
}