package polymorphism2;

public class Child extends Polymorphism2 {
void abc() {System.out.println("This is method6");}
static void sdf() {System.out.println("This method 7");}
void abc (int a) {System.out.println("This is method 8");}
static void sdf (int b) {
	System.out.println("This is method 9");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		Polymorphism2 ss=new Polymorphism2 ();
		ss.abc();
ss.sdf();
Child vv=new Child();
vv.abc(6);
vv.abc();
vv.sdf(6);
	}

}
