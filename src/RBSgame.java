import javax.swing.JOptionPane;
import java.util.Scanner;
public class RBSgame {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		Scanner cont = new Scanner(System.in);	
		// vs CPU
		
		int computerNum;
		computerNum = 1 + (int) (Math.random()*3);
		
		//experiment convert random int to string"
		String CPUpick ="";
		if(computerNum == 1){
			CPUpick = "Rock";
		}
		else if (computerNum == 2){
			CPUpick = "Paper";
		}
		else if (computerNum == 3){
			CPUpick = "Scissors" ;
		}
		char play;
		
		//end of converting
		
		
		//debug
		//System.out.println(computerNum);
		//System.out.println(CPUpick);
		do {
		int choice;
		System.out.println("====ROCK PAPER SCISSORS GAME====\nRock = 1, Paper = 2, Scissors = 3\nPlease enter your pick:");
		choice = input.nextInt();
		
		//while loop
		while (computerNum==choice){
			System.out.println("Draw !, lets play again\nPlease enter your pick:");
			choice = input.nextInt();
		}
		if (computerNum != choice) {
			if (computerNum ==1) if (choice == 2){
				System.out.println("Player win !!! CPU picked "+ CPUpick);
			}
			else if (computerNum ==1) if (choice == 3){
				System.out.println("CPU win !!! CPU picked "+ CPUpick);
			}
			if (computerNum == 2) if (choice == 1){
				System.out.println("CPU win !!! CPU picked "+ CPUpick);
			}	
			else if (computerNum == 2) if (choice == 3){
				System.out.println("Player win !!!CPU picked "+ CPUpick);
			}
			if (computerNum == 3) if (choice == 1){
				System.out.println("Player win !!! CPU picked "+ CPUpick);
			}
			else if (computerNum == 3) if (choice == 2){
				System.out.println("CPU win !!! CPU picked "+ CPUpick);
			}
		}
		
	System.out.println("Wanna play again ? \nY / N");
	play = cont.next().charAt(0);
		}
	while( play =='y'); 
		
	
	}
	}

