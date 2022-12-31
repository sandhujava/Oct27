package oct27th;

public class MethodOverLoading {
	
//	public int add(int a,int b) {
//		return a+b;
//	}
	
	public void add(float a,int b) {
		System.out.println(a+b);
	}
	
//	public void add(int a,float b) {
//		System.out.println(a+b);
//	}
	
	
	public void add(int a, int b , int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mol = new MethodOverLoading();
		mol.add(5, 10);
		mol.add(5.0f,24);
		mol.add(4, 6,7);

	}

}
