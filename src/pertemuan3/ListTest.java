package pertemuan3;

public class ListTest {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		System.out.print("Elemen: ");
		list.displayElement();
		
		StrukturList listA = new StrukturList();
		listA.addTail(3);
		listA.addTail(2);
		listA.addTail(1);
		
		System.out.print("Elemen: ");
		listA.displayElement();

		StrukturList listB = new StrukturList();
		listB.addTail(1);
		listB.addTail(4);
		listB.addTail(5);
		listB.addTail(7);
		
		System.out.print("Elemen: ");
		listB.displayElement();
		
		StrukturList listHead = new StrukturList();
		
		listHead.addHead(5);
		listHead.addHead(4);
		listHead.addHead(3);
		
		System.out.println("Elemen: ");
		listHead.displayElement();
		
		StrukturList listAHead = new StrukturList();
		listAHead.addHead (1);
		listAHead.addHead (2);
		listAHead.addHead (3);
		
		System.out.println("Elemen A: ");
		listAHead.displayElement();
		
		StrukturList listBHead = new StrukturList();
		listBHead.addHead (7);
		listBHead.addHead (4);
		listBHead.addHead (5);
		listBHead.addHead (1);
		
		System.out.println(" ");
		System.out.println("Elemen B: ");
		listBHead.displayElement();


	}

}
