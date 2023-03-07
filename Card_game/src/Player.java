import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	private Cards cardOnBoard;
	private int score;
	private String name;
	private ArrayList<Cards> playerDeck = new ArrayList<Cards>();
	public Player(String name,int score) {
		
		this.name = name;
		this.score=score;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public ArrayList<Cards> getPlayerDeck() {
		return playerDeck;
	}
	public void setPlayerDeck(ArrayList<Cards> playerDeck) {
		this.playerDeck = playerDeck;
	}
	
	
	
	
	public Cards getCardOnBoard() {
		return cardOnBoard;
	}
	public void setCardOnBoard(Cards cardOnBoard) {
		this.cardOnBoard = cardOnBoard;
	}
	public void addCard() {
		playerDeck.add(Cards.dealCard(Cards.getDeck()));
	}
	
	public void removeCard(Cards card) {
		playerDeck.remove(card);
	}
	
	public void showCards() {
		System.out.println(this.getName()+" has "+this.getPlayerDeck().size()+" card.");
		System.out.println(this.getName()+"'s Cards");
		
		for(int i=0;i<this.getPlayerDeck().size();i++) {
			System.out.println("Player Name "+this.getPlayerDeck().get(i).getName());
			System.out.println("Player Position "+this.getPlayerDeck().get(i).getPosition());
			System.out.println("Player Attack "+this.getPlayerDeck().get(i).getAttack());
			System.out.println("Player Control "+this.getPlayerDeck().get(i).getControl());
			System.out.println("Player Defence "+this.getPlayerDeck().get(i).getDefence());
			System.out.println();
										}
		
		
	}
	public int throwCards() {
		int x=this.throwCard();
		if(x!=-1) {
			return x;
		}
		
		while(x==-1) {
			this.throwCard();
		}
		
		
		return this.throwCard();
	}
	
	private int throwCard() {
		
		//Choosing a card
		System.out.println("Which cards do you want to throw");
		this.showCards();
		Scanner input=new Scanner(System.in);
		String card=input.nextLine();
		
		boolean tf=false;
		for(int i=0;i<this.getPlayerDeck().size();i++) {
			if(this.getPlayerDeck().get(i).getName().equalsIgnoreCase(card)) {
				
				
				//Choosing a feature
				
				System.out.println("Which feature of the card you have chosen do you want to choose? ");
				System.out.println("Defence "+getPlayerDeck().get(i).getDefence());
				System.out.println("Control "+getPlayerDeck().get(i).getControl());
				System.out.println("Attack "+getPlayerDeck().get(i).getAttack());
				
				int x=0;
				String feature=input.nextLine();
				if(feature.equalsIgnoreCase("attack")) {
					System.out.println("You throwed the card");
					x=this.getPlayerDeck().get(i).getAttack();
					this.getPlayerDeck().remove(this.getPlayerDeck().get(i));
					return x;
					
							
				}
				else if(feature.equalsIgnoreCase("Defence")) {
					System.out.println("You throwed the card");
					x=this.getPlayerDeck().get(i).getDefence();
					this.getPlayerDeck().remove(this.getPlayerDeck().get(i));
					return x;
				}
				else if(feature.equalsIgnoreCase("control")) {
					System.out.println("You throwed the card");
					x=this.getPlayerDeck().get(i).getControl();
					this.getPlayerDeck().remove(this.getPlayerDeck().get(i));
					return x;
				}
				
				
				
				tf=true;
				
				
			}
		}
		if(tf==false) {
			System.out.println("You can not throw this card.Please select another card !");
			return -1;
		}
		return -1;
		
	}
	
	public void move() {
		this.throwCards();
		
		
		
	}
	
	
	
	

}
