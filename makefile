Main.class:		Main.java MyNode.class MyLinkedList.class
	javac Main.java

MyMultiList.class:	MyMultiList.java MyNode.class
	javac MyMultiList.java

MyNode.class:			MyNode.java
	javac MyNode.java

run:			Main.class
	java Main

clean:		
	rm *.class
