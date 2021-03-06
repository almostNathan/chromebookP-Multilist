public class MyMultiList{
//we will need to initialize the list with a "dummy node" since we dont want studentNodes and classNodes crossing paths
//adding is the difficult functionality we need
//	when adding a node must make next-class/student

	protected HeadNode head; 
	//make custom node extended from ElementNode?

	public MyMultiList(){
		this.head = new HeadNode();
	}

//traveserses our Multilist along the student line looking for specific ID
	public StudentNode findStudent(int studentId){

		StudentNode currentNode = head.nextStudentHeader;
		//interate thru each student looking for passed ID
		while (currentNode != null){
			if (currentNode.getId() == studentId){
				//if student exists return the node
				return currentNode;	
			}else{
				currentNode = currentNode.getNextStudent();
			}	
		}		
		//if studentId not in database
		return null;
	}



//traveserses our Multilist along the class line looking for specific ID
	public ClassNode findClass(int classId){

		ClassNode currentNode = head.nextClassHeader;
		//iterate thru classheaders for classId
		while (currentNode != null){
			if (currentNode.getId() == classId){
				//if Class exists return classNode
				return currentNode;	
			}else{
				currentNode = currentNode.getNextClass();
			}	
		}		
		//if class not in database return null	
		return null;
	}

//process: get headerNode -> proceed to end of that headers -> add node
//LATER insert into correct position 

	public void add(ElementNode node){
		if (findStudent(node.getStudentId()) != null && 
		findClass(node.getClassId()) != null){
//			ElementNode prevStudent = findStudentPos(node.getStudentId)	
//			ElementNode prevClass = findClassPos(node.getClassId)
//			node.nextStudent = prevStudent.getNextStudent();
//			node.nextClass = prevClass.getNextClass();
//			prevStudent.nextStudent = node;
			
			//adding element	 
			ElementNode currentStudent = findStudent(node.getStudentId()).getNextElement();
			ElementNode currentClass = findClass(node.getClassId()).getNextElement();

			while (currentStudent.getNextStudent() != null){
				currentStudent = currentStudent.getNextStudent();
			}
			currentStudent.setNextStudent(node);
	
			while (currentClass.getNextClass() != null){
				currentClass = currentClass.getNextClass();
			}
			currentClass.setNextClass(node);		
			
		}else{
			System.out.println("Student is enrolled in that class.");
		}
	}


	public String printAll(){
//print students
		StudentNode currentStudentHeader = head.getNextStudentHeader();
		//iterate thru studentHeaders(horizontal
	       	while (currentStudentHeader != null){
			ElementNode currentStudent = currentStudentHeader.getNextElement(); 
			System.out.println("Student: " + currentStudent.getStudentId());
			//iterate thru each students classes (vertical)
			while (currentStudent != null){
				System.out.println("Class:   " + currentStudent.getClass());
				currentStudent = currentStudent.getNextStudent();
			}
			currentStudentHeader = currentStudentHeader.getNextStudent();
		}	
		
//print classes		
	}


	public String print(StudentNode node){

	}

}
