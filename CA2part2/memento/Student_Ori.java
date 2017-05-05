public class Student_Ori {

	private string name;
	private string id_no;


	public String GetName() {
		// TODO - implement Student_Mem.GetState
		throw new UnsupportedOperationException();

		return name;
	}

	public void SetName(String n) {
		// TODO - implement Student_Mem.SetState
		throw new UnsupportedOperationException();
		this.name = n;
	}

	public String GetId() {
		// TODO - implement Student_Mem.GetState
		throw new UnsupportedOperationException();

		return id_no;
	}

	public void SetId() {
		// TODO - implement Student_Mem.SetState
		throw new UnsupportedOperationException();
		this.id_no = id_no;
	}

	public Student_Mem CreateMem() {
		// TODO - implement Student_Ori.CreateMem
		throw new UnsupportedOperationException();

		return Student_Mem(name, id_no);
	}

	public void SetMem(Student_Mem m) {
		// TODO - implement Student_Ori.SetMem
		throw new UnsupportedOperationException();
		name = m.getName();
		id_no = m.getId();
	}

	public void SetMem() {
		// TODO - implement Student_Ori.SetMem
		throw new UnsupportedOperationException();
	}

}

