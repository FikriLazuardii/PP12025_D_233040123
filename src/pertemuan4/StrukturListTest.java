package pertemuan4;

public class StrukturListTest {
	
	public static void main(String[] args) {
		
        StrukturList list = new StrukturList();

        list.addTail(3);  // Tambah elemen 3 di akhir
        list.addTail(4);  // Tambah elemen 4 di akhir
        list.addMid(7, 2);  // Tambah elemen 7 di index 2
        list.addMid(8, 2);  // Tambah elemen 8 di index 2
        list.addHead(5);  // Tambah elemen 5 di awal

        list.displayElement(); // Output harus: 5 3 8 7 4

	}
}
