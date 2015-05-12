package cmm03.flow;

/*
¡Ù¡Ù¡Ù¡Ù¡Ù
¡Ú¡Ù¡Ù¡Ù¡Ù
¡Ú¡Ú¡Ù¡Ù¡Ù
¡Ú¡Ú¡Ú¡Ù¡Ù
¡Ú¡Ú¡Ú¡Ú¡Ù
 */
public class No08_Star3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>j){
				System.out.print("¡Ú");	
				}else {
				System.out.print("¡Ù");
				}
			}
			System.out.println();
		}
	}
}
