package DataStructures;

public class MainTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree x = new Tree();
		for (int i=1;i<10;i++) {
			x.add(i);
			
		}
		x.print(x.root);
		System.out.println();
		System.out.println(x.lenght());
		

	}

}
