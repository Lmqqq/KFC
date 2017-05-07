
public class Waiter {
	private MEALBUILDER mealbuilder;
	
	public void setMEALBUILDER(MEALBUILDER mealbuilder){
		this.mealbuilder=mealbuilder;
	}
	
	public MEAL construct() {
		mealbuilder.buildDrink();
		mealbuilder.buildFood();
		
		return mealbuilder.getMeal();
	}
}
