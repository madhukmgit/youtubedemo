package core.java.oops;

class calculate {
	
	int add(int a, int b){
		int c =a+b;
		System.out.println("a+b="+(a+b));
		return c;
	}
	
	public static void main(String []args){
		int cc =new calculate().add(2, 3);
	}

}
