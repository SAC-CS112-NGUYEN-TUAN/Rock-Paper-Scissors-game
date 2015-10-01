import java.util.Scanner;
public class RBSgame {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		// vs CPU
		
		int computerNum;
		computerNum = 1 + (int) (Math.random()*3);
		System.out.println(computerNum);
		
		int choice;
		System.out.println("====ROCK PAPER SCISSORS GAME====\nRock = 1, Paper = 2, Scissors = 3\nPlease enter your pick:");
		choice = input.nextInt();
		while (computerNum==choice){
			System.out.println("Draw !, lets play again\nPlease enter your pick:");
			choice = input.nextInt();
		}
		if (computerNum != choice) {
			if (computerNum ==1) if (choice == 2){
				System.out.println("Player win !!!");
			}
			else if (computerNum ==1) if (choice == 3){
				System.out.println("CPU win !!");
			}
			if (computerNum == 2) if (choice == 1){
				System.out.println("CPU win !!");
			}	
			else if (computerNum == 2) if (choice == 3){
				System.out.println("Player win !!!");
			}
			if (computerNum == 3) if (choice == 1){
				System.out.println("Player win !!!");
			}
			else if (computerNum == 3) if (choice == 2){
				System.out.println("CPU win !!!");
			}
		}
	}
	}

