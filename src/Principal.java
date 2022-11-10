
public class Principal {
	public static void main(String[] args) {
		NumbersGenerator generate = new NumbersGenerator();
		int[] vetorRandom = generate.generateNumbers(100);
		
		System.out.println("Não ordenada!");
		for(int i = 0; i < vetorRandom.length; i++) {
			System.out.print(" " + vetorRandom[i] + " ");
		}
		
		int[] vetorSorted = BubbleSort.sort(vetorRandom);
		
		System.out.print("\n");
		System.out.print("Ordenada: \n");
		for(int i = 0; i < vetorSorted.length; i++) {
			System.out.print(" " + vetorSorted[i] + " ");
		}
	}
}
