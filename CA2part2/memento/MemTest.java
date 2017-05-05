public class MemTest {
	public static void main(String[] args) {
		Student_Ori so = new Student_Ori();
	
		Student_Mem mem = so.createMemento();
		Caretaker ct = new Caretaker();

		so.setName("John");
		so.setId("X00123456");
		mem = so.createMem();
	}
}
