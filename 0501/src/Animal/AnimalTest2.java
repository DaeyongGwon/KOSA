package Animal;

public class AnimalTest2 {
	public static void main(String[] args) {
//		Animal a1 = new Animal();
//		System.out.println("a1 = " + a1);
//		
//		Bird b1 = new Bird();
//		System.out.println("b1 = " + b1);
//		
//		Animal a2 = b1;
//		System.out.print(a2);

		Dock d1 = new Dock();
		Bird b3 = d1;
		System.out.println("" + b3);

//		if (b3 instanceof Condor) {
//			Condor c2 = (Condor) b3;
//			System.out.println("" + c2);
//
//		} else
//			System.out.println("오류 ");
		Animal a3 = b3;
		System.out.println("" + a3);
	}
}
