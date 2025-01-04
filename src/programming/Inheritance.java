package programming;

class A{
	void methodA(){
		System.out.println("This is Method A");
	}
}

class B extends A{
	void methodB(){
		System.out.println("This is Method B");				
	}
}

class C extends B{
	void methodC(){
		System.out.println("This is Method C");
	}
}
class D extends A{
	void methodD() {
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		C obj = new C();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}

}
