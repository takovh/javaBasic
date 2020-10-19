package cn.zhang.fCollection.begin;

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
