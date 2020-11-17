public class Edge{
	//attributes
	private int pheromones;
	private Node source;
	private Node target;
	//??????
	public Edge(Node source, Node target){ //?????
		this.source = source;
		this.target = target; 
	}

	public int pheromones(){
		return pheromones;
	}

	public void decreasePheromones(){
		pheromones = pheromones - 1;
	}

	public void raisePheromones(int amount){
		pheromones = pheromones + amount;
	}

	//overriding!!!!!!!!!
}