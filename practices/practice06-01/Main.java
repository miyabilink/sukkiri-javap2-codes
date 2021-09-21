interface Func1 {
	boolean call(int x);
}

interface Func2 {
	String call(boolean male, String name);
}
public class Main {
	public static void main(String[] args) {
	    FuncList funclist = new FuncList();
	    Func1 f1 = FuncList::isOdd;
	    Func2 f2 = funclist::addNamePrefix;
	    System.out.println(f1.call(15));
	    System.out.println(f2.call(true, "Smith"));
	  }
}
