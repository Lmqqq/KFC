
public class Client {
	public static void main(String[] args) {

		Waiter waiter = new Waiter();
		MEALA a = new MEALA();
		waiter.setMEALBUILDER(a);
		MEAL mealA = waiter.construct();
		System.out.println("�ײ�A����ɲ��֣�");
		System.out.println(mealA.getFood() + "------" + mealA.getDrink());
	}

}
