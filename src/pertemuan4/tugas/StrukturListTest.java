package pertemuan4.tugas;

public class StrukturListTest {
	public static void main(String[] args) {
		StrukturList ListA = new StrukturList();
		StrukturList ListB = new StrukturList();
		
		// Membentuk deret a: 2.1 -> 3.4 -> 4.5
		ListA.addTail(2.1);
		ListA.addTail(3.4);
		ListA.addTail(4.5);
		System.out.print("List A: ");
		ListA.displayElement(); // Output: 2.1 3.4 4.5
		
		// Membentuk deret b: 3.4 -> 2.1 -> 1.1 -> 4.5 -> 5.5
		ListB.addHead(3.4);
		ListB.addMid(2.1, 2);
		ListB.addMid(1.1, 3);
		ListB.addTail(4.5);
		ListB.addTail(5.5);
		System.out.print("List B: ");
		ListB.displayElement(); // Output: 3.4 2.1 1.1 4.5 5.5
	}
}
