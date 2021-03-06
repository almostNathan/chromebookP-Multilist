public class StudentNode{
//each node should point to the next student and to the next "element" in its "attending" list
//we can traverse across students to search for an ID then down its elements to see if it is 
//	attending a class 	

	// data=id, nextStudent(horizontally), nextElement(vertically)
	protected int studentId;
	protected ElementNode nextElement;
	protected StudentNode nextStudent;

	public StudentNode(){
		this.studentId = 0;
		this.nextElement = null;
		this.nextStudent = null;
	}

	//constructor
	public StudentNode(int id){
		this.studentId = id;
		this.nextElement = null;
		this.nextStudent = null;
	}

	public int getId(){
		return studentId;
	}
	public void setId(int id){
		this.studentId = id;
	}

	//elementNode setter/getter
	public ElementNode getNextElement(){
		return nextElement;
	}
	public void setNextElement(ElementNode node){
		this.nextElement = node;
	}

	//studentNode setter/getter	
	public StudentNode getNextStudent(){
		return nextStudent;
	}
	public void setNextStudent(StudentNode node){
		this.nextStudent = node;
	}
}
