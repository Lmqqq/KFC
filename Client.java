
public class Client {
	public static void main(String[] args) {

		Waiter waiter = new Waiter();
		MEALA a = new MEALA();
		waiter.setMEALBUILDER(a);
		MEAL mealA = waiter.construct();
		System.out.println("套餐A的组成部分：");
		System.out.println(mealA.getFood() + "------" + mealA.getDrink());
	}

}
