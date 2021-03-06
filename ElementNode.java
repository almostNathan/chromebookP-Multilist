public class ElementNode{
	
	//data = studentId,classId
	protected int studentId;
	protected int classId;
	protected ElementNode nextStudent;
	protected ElementNode nextClass;

	public ElementNode(){
		this.studentId = 0;
		this.classId = 0;
		this.nextStudent = null;
		this.nextClass = null;
	}

	public ElementNode(int studentId, int ClassId){
		this.studentId = studentId;
		this.classId = ClassId;
		this.nextStudent = null;
		this.nextClass = null;
	}

	public int getStudentId(){
		return this.studentId;
	}	 
	public int getClassId(){
		return this.classId;
	}

	//next node Student(vertical) setter//getters
	public ElementNode getNextStudent(){
		return this.nextStudent;
	}
	public void setNextStudent(ElementNode node){
		this.nextStudent = node;
	}

	//nextnode Class (horizontal) setter//getters
	public void setNextClass(ElementNode node){
		this.nextClass = node;
	}
	public ElementNode getNextClass(){
		return this.nextClass;
	}


}
