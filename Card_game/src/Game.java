import java.util.Scanner;

public class Game {
static int x=1;
	public void beginning() {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to FIFA Card game");
	Player player1=new Player(null,null);
	Player player2=new Player(null,null);
		
		System.out.println("Please player1 enter your name");
		String name1=input.nextLine();
		player1.setName(name1);
		System.out.println("Please player2 enter your name");
		String name2=input.nextLine();
		player2.setName(name2);
		
		
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
 Cards.getDeck().add(Robertson);
 Cards.getDeck().add(Bellingham);
 Cards.getDeck().add(Bruno);
 Cards.getDeck().add(Mane);
 Cards.getDeck().add(Boualem);
 Cards.getDeck().add(Ito);
 Cards.getDeck().add(Modric);
 Cards.getDeck().add(Denayer);
 Cards.getDeck().add(Bernardo);
 Cards.getDeck().add(Godin);
 
 while(Cards.getDeck().size()>0) {
	 player1.addCard();
	 player2.addCard();
 }

 
 System.out.println("the game begins");
		
		
	}
	public void game() {
		
		beginning();
		while(true) {
			if()
			
		}
		
	}
	public static int turn() {
	if(x==1) {
		return 1;
	}
	else {
		return 2;
	}
		
		
	}
	
}
