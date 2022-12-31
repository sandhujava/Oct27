package oct27th;

public class ArrayTypes {
	
	int [] singleArray = new int[3];
	int [][] doubleArrayRegular = new int[2][2];
	int [][] doubleArrayJagged = new int[2][];
	
	
	public void  single() {
		System.out.println("creating Single Array");
		singleArray[0] = 2;
		singleArray[1] = 4;
		singleArray[2] = 5;
		for(int i=0;i<singleArray.length;i++) {
			System.out.println(singleArray[i]);
			
		}
	}
	
	public void  doubleRegular() {
		System.out.println("creating Double Array Regular");
		doubleArrayRegular[0][0] = 2;
		doubleArrayRegular[0][1] = 5;
		doubleArrayRegular[1][0] = 7;
		doubleArrayRegular[1][1] = 9;
		for(int i=0;i<doubleArrayRegular.length;i++) {
			for(int j=0;j<doubleArrayRegular.length;j++) {
				System.out.println(doubleArrayRegular[i][j]);
			}
			
		}
			
	}
	
	public void  doubleJagged() {
		System.out.println("creating Double Array Jagged");
		doubleArrayJagged[0] = new int[2];
		
		doubleArrayJagged[1] = new int[3];
		doubleArrayJagged[0][0]=3;
		doubleArrayJagged[0][1]=4;
		doubleArrayJagged[1][0]=7;
		doubleArrayJagged[1][1]=30;
		doubleArrayJagged[1][2]=90;
		
		for(int i=0;i<doubleArrayJagged.length;i++) {
			
				for(int j=0;j<doubleArrayJagged[i].length;j++) {
					System.out.println(doubleArrayJagged[i][j]);
				
			}
		
			
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayTypes at = new ArrayTypes();
		at.single();
		at.doubleRegular();
		at.doubleJagged();

	}

}
