package modifier;

public class Modifier {
	
	public int a=76;
	private int b =65;
	int c =98;
	protected int d = 45;
	final int e = 76;
	
	public static int f= 48;
	private static int g = 07;
	static int h= 54;
	protected static int i=12;
	static final int j=43;
	
	
	public void abc() {
		System.out.println("This is public method in modifier class");
	}
	private void abd() {
		System.out.println("This is private method in modifier");
	}
void asd() {
	System.out.println("This is default method in modifier");
}
protected void sdf() {
	System.out.println("This is protected method in modifier");
	
} 
final void hgt() {
	System.out.println("This is final method in modifier");
}
public static void rty() {
	System.out.println("This is public static method in modifier ");
}
private static void gfr() {
	System.out.println("This is private static method in modifier");
	
}
final static void dfg() {
	System.out.println("This is final static method in modifier");
	
}
protected static void rgy() {
	System.out.println("This is protected static method in modifier");
	
	}
static void jhg () {
	System.out.println("This is default static method in modifier");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Modifier v = new Modifier();
v. abc();
v.abd();
v.asd();
v.sdf();
v.hgt();
rty();
rty();
gfr();
dfg();
rgy();
jhg();
	}

}
