public class error {

	public static void main(String[] args) {		


		int bae[][] = new int[3][4];
		for(int i=0;i<bae.length;i++) {
			for(int j=0;j<bae[i].length;j++) {
				bae[i][j] = (int)(Math.random()*9);
			}
		}
		double sum=0;
		for(int i=0;i<bae.length;i++) {
			for(int j=0;j<bae[i].length;j++) {
				sum+=bae[i][j];
				System.out.print(bae[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("гую╨ : "+sum);

	}

}