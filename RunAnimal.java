import java.util.Scanner;

public class RunAnimal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Bird a = new Bird();
		Cat aa = new Cat();
		Dog aaa = new Dog();
		
		System.out.println ("Choose an animal");
		String input1 = sc.nextLine();
		if(input1.equalsIgnoreCase("B")){
			System.out.println (a.eat()+a.sleep()+a.makesound());
		}
		if(input1.equalsIgnoreCase("C")){
			System.out.println (aa.eat()+aa.sleep()+aa.makesound());
		}
		if(input1.equalsIgnoreCase("D")){
			System.out.println (aaa.eat()+aaa.sleep()+aaa.makesound());
		}
		else {
			System.out.println ("Invalid input.");
		}
		
}
}