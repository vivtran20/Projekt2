public class Node{
	//attributes
	private int sugar; 

	public Node(){
		this.sugar = 0; //????

	}

	public Node(int sugar){
		this.sugar = sugar; //??????

	}

	public int sugar(){
		return sugar;
	}

	//precondition: there must be sugar in this node
	public void decreaseSugar(){
		if(sugar>0)
			sugar = sugar - 1;
	}

	public void setSugar(int sugar){
		this.sugar = sugar;
	}
	//overriding!!!!!!
}	
