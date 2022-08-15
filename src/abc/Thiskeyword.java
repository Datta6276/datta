package abc;

public class Thiskeyword {
int a=78,b=65;    //instance variable

void xyz() {
	int a=45,b=18;  //local variable
	System.out.println(a+b);
	System.out.println(this.a+b);
}
void abc(){
	this.xyz();
	System.out.println("abc method");
}
void def() {this.abc();
	System.out.println("defmethod");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Thiskeyword d=new Thiskeyword();
	d.def();}

}
