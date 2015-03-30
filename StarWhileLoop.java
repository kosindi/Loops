public class StarWhileLoop {
	public static void main (String[] args) {
		int row = 0;
		while(row<3) {
			int space = 2 - row;
			while(space !=0) {
				space--;
				System.out.print(" ");
				
			}
			int asterisk = 1 + (row*2);
			while(asterisk != 0) {
				asterisk--;
				System.out.print("*");
			}
			row++;
			System.out.println();
		}
		
		row -= 2;
		while(row>=0) {
			int space = 3 - row;
			while(space != 1)
			{
				space--;
				System.out.print(" ");
			}
			int asterisk = 1 + (row*2);
			while(asterisk !=0) {
				asterisk--;
				System.out.print("*");
				
			}
			row--;
			System.out.println();
		}
		
}
		
	
}



