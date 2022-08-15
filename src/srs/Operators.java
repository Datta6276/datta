package srs;

public class Operators {
static void unary () {
	int a=34, b=23,c=65;
		
	System.out.println(++a + b-- - a++);
	System.out.println(c++ - a-- + c++ + --b);
}
static void unary1() {
	int x=60,y=27,z=4;
	System.out.println(y++ - --z + --y);     //50
	System.out.println(--x + z++ - ++y - --z);      //31
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
unary();
unary1();
	}

}
