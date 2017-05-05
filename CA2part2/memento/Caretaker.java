public class Caretaker {
	private List list = new ArrayList();
	
	public void addMem(Student_Mem m) {
		list.add(m);
	}
	
	public Student_Mem getMem(int i) {
		return list.get(i);
	}
}
