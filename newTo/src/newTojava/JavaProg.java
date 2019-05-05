package newTojava;

public class JavaProg {
	
	public static void main(String []args) {
		// TODO Auto-generated method stub
// Enter 2 integers
		Method m =new Method();
	   m.ValidateHeader();
		if (args.length == 0) {
			System.out.println("please enter 2 integers");
		}
		if (args.length == 2)
{int a = Integer.parseInt(args[0]);
int b =Integer.parseInt(args[1]);
int c =a+b;
System.out.println("Sum of input no is:" +c);
	}

}
}