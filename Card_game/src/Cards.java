import java.util.ArrayList;
import java.util.Random;

public class Cards {
	private String name,position;
	private int defence,control,attack;
	private static ArrayList<Cards> deck = new ArrayList<Cards>();
	
	
	
	public Cards(String name, String position, int defence, int control, int attack) {
		
		this.name = name;
		this.position = position;
		this.defence = defence;
		this.control = control;
		this.attack = attack;
	}
	
	
	
	
	public static ArrayList<Cards> getDeck() {
		return deck;
	}




	public static void setDeck(ArrayList<Cards> deck) {
		Cards.deck = deck;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getControl() {
		return control;
	}
	public void setControl(int control) {
		this.control = control;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public static Cards dealCard(ArrayList<Cards> arrayList) { //deals cards to players
		  Random rand = new Random();
		  
		  Cards randomCard = deck.get(rand.nextInt(deck.size()));
		  deck.remove(randomCard);
		  return randomCard;
		
	}
	
	
	
	

}
