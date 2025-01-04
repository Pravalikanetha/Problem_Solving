package programming;
interface Animal{
	public void run();
}
class cat implements Animal{
	public void run() {
		System.out.println("cat run");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		Animal obj = new cat();
		obj.run();
		

	}

}
