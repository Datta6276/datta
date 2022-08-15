package polymorphism;
public class Polymorphism{
	void abc() {
	}
	void abc (int a) {
		System.out.println("This is method 1"); 
		
	}
	void abc(String b) {
		System.out.println("This is method 2");}
		void abc(float c) {
			System.out.println("This is method 3");
		}
		void abc(double d) 
	{
			System.out.println("This is method 4");
	}
	
		public static void main(String[] args) {
			
			Polymorphism ss=new Polymorphism();
			
			ss.abc(0.0);
			ss.abc(4.5f);
			ss.abc('j');
		}

}