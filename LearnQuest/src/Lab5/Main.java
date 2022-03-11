package Lab5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1 = new Box(12.3, 54.2, 6.7);
		box1.printBox();
		System.out.println(box1);
		
		Box box2 = new Box(3);
		box2.printBox();
		System.out.println(box2);
		
		Box box3 = new Box(0, 14.5, 94.2);
		box3.printBox();
		System.out.println(box3);
	}
}
