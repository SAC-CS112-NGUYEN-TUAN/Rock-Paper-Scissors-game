import javax.swing.JOptionPane;
import java.util.Scanner;
public class RBSgame {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		Scanner cont = new Scanner(System.in);	
		// vs CPU
		String play ="";
		do {
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
				
		//end of converting
		
		
		//debug
		System.out.println(computerNum);
		System.out.println(CPUpick);
		
		String choice =
				JOptionPane.showInputDialog("Let's play Rock Paper Scissors\nPlease type your Pick\nRock Paper Scissors");
		
		//while loop
		if (CPUpick.equals(choice)){
		while (CPUpick.contentEquals(choice)){
				choice = 
					JOptionPane.showInputDialog("Draw !!! please type your pick again");
		}
		}
		else  {
			if (CPUpick.equals("Rock")) if (choice.equals("Paper")){
				JOptionPane.showMessageDialog(null,"Player wins !!!\nCPU picked:"+CPUpick);
			}
			else if (CPUpick.equals("Rock")) if (choice.equals("Scissors")){
				JOptionPane.showMessageDialog(null,"CPU wins !!!\nCPU picked:"+CPUpick);
			}
			if (CPUpick.equals("Paper")) if (choice.equals("Rock")){
				JOptionPane.showMessageDialog(null,"CPU wins !!!\nCPU picked:"+CPUpick);
			}	
			else if (CPUpick.equals("Paper")) if (choice.equals("Scissors")){
				JOptionPane.showMessageDialog(null,"Player wins !!!\nCPU picked:"+CPUpick);
			}
			if (CPUpick.equals("Scissors")) if (choice.equals("Paper")){
				JOptionPane.showMessageDialog(null,"CPU wins !!!\nCPU picked:"+CPUpick);
			}	
			else if (CPUpick.equals("Scissors")) if (choice.equals("Rock")){
				JOptionPane.showMessageDialog(null,"Player wins !!!\nCPU picked:"+CPUpick);
			}
		}
		
	play =
			JOptionPane.showInputDialog(null,"Do you wanna play again\nType ; Y N");
		
	
		
		}
		while (play.equals("y"));
	}
}
