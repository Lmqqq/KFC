

public abstract class MEALBUILDER {
	MEAL meal = new MEAL();
	
	public abstract void buildFood();
	
	public abstract void buildDrink();
	
	public MEAL getMeal(){
		return meal;
	}
}
