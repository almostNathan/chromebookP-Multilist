public class HeadNode{

	protected StudentNode nextStudentHeader;
	protected ClassNode nextClassHeader;

	public HeadNode(){
		nextStudentHeader = null;
		nextClassHeader = null;	
	}

	public StudentNode getNextStudentHeader(){
		return nextStudentHeader;
	}
	
	public void setNextStudentHeader(StudentNode node){
		this.nextStudentHeader = node;
	}

	public ClassNode getNextClassHeader(){
		return nextClassHeader;
	}
	
	public void setNextClassHeader(ClassNode node){
		this.nextClassHeader = node;
	}
}
