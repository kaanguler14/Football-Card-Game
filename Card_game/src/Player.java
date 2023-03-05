import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	private int score;
	private String name;
	private ArrayList<Cards> playerDeck = new ArrayList<Cards>();
	public Player(String name, ArrayList<Cards> playerDeck) {
		
		this.name = name;
		this.playerDeck = playerDeck;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Cards> getDecks() {
		return playerDeck;
	}
	public void setDecks(Cards decks) {
		this.playerDeck = playerDeck;
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
	public void addCard() {
		playerDeck.add(Cards.dealCard(Cards.getDeck()));
	}
	
	public void removeCard(Cards card) {
		playerDeck.remove(card);
	}
	
	public void showCards() {
		System.out.println(this.getName()+"has "+this.getPlayerDeck().size());
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
	public Cards throwCards() {
		if(this.throwCard()==null) {
			this.throwCard();
		}
		else {
			return this.throwCard();
		}
		return null;
	}
	
	private Cards throwCard() {
		System.out.println("Which cards do you want to throw");
		this.showCards();
		Scanner input=new Scanner(System.in);
		String card=input.nextLine();
		
		boolean tf=false;
		for(int i=0;i<this.getPlayerDeck().size();i++) {
			if(this.getPlayerDeck().get(i).getName().equalsIgnoreCase(card)) {
				System.out.println("You throw the card");
				tf=true;
				return this.getPlayerDeck().get(i);
				
			}
		}
		if(tf==false) {
			System.out.println("You can not throw this card.Please select another card !");
			return null;
		}
		return null;
		
	}
	
	

}
