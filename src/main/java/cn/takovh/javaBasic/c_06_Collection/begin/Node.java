package cn.takovh.javaBasic.c_06_Collection.begin;

public class Node {
	Node pre;
	Object obj;
	Node next;
	
	public Node() {
	}

	public Node(Node pre, Object obj, Node next) {
		super();
		this.pre = pre;
		this.obj = obj;
		this.next = next;
	}
	
}
