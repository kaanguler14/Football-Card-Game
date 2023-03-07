import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	 Player player1;
	 Player player2;

	
static int x=1;
	public void beginning() {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to FIFA Card game");
	
		System.out.println("Please player1 enter your name");
		String name1=input.nextLine();
		Player player1=new Player(name1,0);
		
		
		System.out.println("Please player2 enter your name");
		String name2=input.nextLine();
		Player player2=new Player(name2,0);
		
		
		System.out.println("Game is loading...");
//Cards		
 Cards Bellingham =new Cards("Bellingham","MIDFIELDER",93,98,96);
 Cards Bruno =new Cards("Bruno Fernandes","MIDFIELDER",90,99,95);
 Cards Mane =new Cards("Mane","FORWARD",89,95,99);
 Cards Bernardo =new Cards("Bernardo Silva","MIDFIELDER",85,95,90);
 Cards Boualem =new Cards("Boualem","DEFENDER",91,80,79);
 Cards Ito =new Cards("Ito","FORWARD",79,84,91);
 Cards Modric =new Cards("Modric","MIDFIELDER",62,88,78);
 Cards Denayer =new Cards("Denayer","DEFENDER",81,67,65);
 Cards Robertson =new Cards("Robertson","DEFENDER",84,77,63);
 Cards Godin =new Cards("Godin","DEFENDER",82,71,67);

 //adding cards to deck
 Cards.deck.add(Robertson);
 Cards.deck.add(Bellingham);
 Cards.deck.add(Bruno);
 Cards.deck.add(Mane);
 Cards.deck.add(Boualem);
 Cards.deck.add(Ito);
 Cards.deck.add(Modric);
 Cards.deck.add(Denayer);
 Cards.deck.add(Bernardo);
 Cards.deck.add(Godin);
 
 while(Cards.getDeck().size()>0) {
	 player1.addCard();
	 player2.addCard();
	 
 }
player1.showCards();
 
 System.out.println("game is starting");

		
	}
	public void game() {
		
		//beginning
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to FIFA Card game");
	
		System.out.println("Please player1 enter your name");
		String name1=input.nextLine();
		Player player1=new Player(name1,0);
		
		
		System.out.println("Please player2 enter your name");
		String name2=input.nextLine();
		Player player2=new Player(name2,0);
		
		
		System.out.println("Game is loading...");
//Cards		
 Cards Bellingham =new Cards("Bellingham","MIDFIELDER",93,98,96);
 Cards Bruno =new Cards("Bruno Fernandes","MIDFIELDER",90,99,95);
 Cards Mane =new Cards("Mane","FORWARD",89,95,99);
 Cards Bernardo =new Cards("Bernardo Silva","MIDFIELDER",85,95,90);
 Cards Boualem =new Cards("Boualem","DEFENDER",91,80,79);
 Cards Ito =new Cards("Ito","FORWARD",79,84,91);
 Cards Modric =new Cards("Modric","MIDFIELDER",62,88,78);
 Cards Denayer =new Cards("Denayer","DEFENDER",81,67,65);
 Cards Robertson =new Cards("Robertson","DEFENDER",84,77,63);
 Cards Godin =new Cards("Godin","DEFENDER",82,71,67);

 //adding cards to deck
 Cards.deck.add(Robertson);
 Cards.deck.add(Bellingham);
 Cards.deck.add(Bruno);
 Cards.deck.add(Mane);
 Cards.deck.add(Boualem);
 Cards.deck.add(Ito);
 Cards.deck.add(Modric);
 Cards.deck.add(Denayer);
 Cards.deck.add(Bernardo);
 Cards.deck.add(Godin);
 
 while(Cards.getDeck().size()>0) {
	 player1.addCard();
	 player2.addCard();
	 
 }

 
 System.out.println("game is starting");
		
		int p1Card=-1;
		int p2Card=-1;
		
		while(true) {
			if(turn()==1) {
		p1Card=player1.throwCards();
		p2Card=player2.throwCards();

			}
			else {
			 p2Card=player2.throwCards();
			 p1Card=player1.throwCards();
			 
			}
			if(p1Card>p2Card) {
				System.out.println(player1.getName()+" earned 1 point");
				player1.setScore(player1.getScore()+1);
			}
			else if(p2Card>p1Card) {
				System.out.println(player2.getName()+" earned 1 point ");
				player2.setScore(player1.getScore()+1);
			}
			else {
				while(p1Card!=p2Card) {
					int i=2;
					p1Card=player1.throwCards();
					p2Card=player2.throwCards();
					if(p1Card>p2Card) {
						System.out.println(player1.getName()+" earned+ "+i+ " point");
						player1.setScore(player1.getScore()+i);
					}
					else if(p2Card>p1Card) {
						System.out.println(player2.getName()+" earned+ "+i+ " point");
						player2.setScore(player1.getScore()+i);
					}
				}
			}
			if(player1.getPlayerDeck().size()==0) {
				if(player1.getScore()>player2.getScore()) {
					System.out.println("Winner is "+player1.getName());
					System.out.println("Congrulations");
					System.out.println("Scores: \n"+player1.getName().toUpperCase()+" -> "+player1.getScore()+"\n"+player2.getName().toUpperCase()+" ->"+player2.getScore());
					break;
				}
				else if(player2.getScore()>player1.getScore()) {
					System.out.println("Winner is "+player2.getName());
					System.out.println("Congrulations");
					System.out.println("Scores: \n"+player1.getName().toUpperCase()+" -> "+player1.getScore()+"\n"+player2.getName().toUpperCase()+" ->"+player2.getScore());
					break;
				}
				else {
					System.out.println();
					System.out.println("unfortunately, Nobody won");
					System.out.println();
					System.out.println("Scores: \n"+player1.getName().toUpperCase()+" -> "+player1.getScore()+"\n"+player2.getName().toUpperCase()+" ->"+player2.getScore());
					break;
				}
			}
			
		}
		
	}
	public  int turn() {
	if(x==1) {
		x+=1;
		return 1;
	}
	else {
		x=1;
		return 2;
	}
		
		
	}
	
}
