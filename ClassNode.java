public class ClassNode{
	
	protected int classId;
	protected ElementNode nextElement;
	protected ClassNode nextClass;

	public ClassNode(){
		this.classId = 0;
		this.nextElement = null;
		this.nextClass = null;
	}

	public ClassNode(int id){
		this.classId = id;
		this.nextElement = null;
		this.nextClass = null;
	}

	public int getId(){
		return classId;
	}
	public void setId(int id){
		this.classId = id;
	}

	//classNode setter/getters
	public ClassNode getNextClass(){
		return nextClass;
	}
	public void setNextClass(ClassNode node){
		this.nextClass = node;
	}

	public ElementNode getNextElement(){
		return nextElement;
	}
	public void setNextElement(ElementNode node){
		this.nextElement = node;
	}

}
