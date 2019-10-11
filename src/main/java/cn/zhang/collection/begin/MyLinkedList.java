package cn.zhang.collection.begin;

public class MyLinkedList /*implements List*/ {
	private Node first;
	private Node last;
	
	private int size;
	public int size() {
		return size;
	}
	
	public void add(Object obj) {
		Node n = new Node();
		if(first == null) {
			n.pre = null;
			n.obj = obj;
			n.next = null;
			first = n;
			last = n;
		}else {
			n.pre = last;
			n.obj = obj;
			n.next = null;
			last.next = n;
			last = n;
		}
		size++;
	}
	public void insert(int index,Object obj) {
		Node temp = node(index);
		Node newNode = new Node();
		newNode.obj = obj;
		if(temp!=null) {
			Node up = temp.pre;
			up.next = newNode;
			newNode.pre = up;
			newNode.next = temp;
			temp.pre = newNode;
			size++;
		}
	}
	
	public Node node(int index) {
		Node temp = null;
		if(first != null) {
			temp = first;
			for(int i = 0;i<index;i++)
				temp = temp.next;
		}
		return temp;
	}
	public Object get(int index) {
		return node(index).obj;
	}
	
	public void remove(int index) {
		Node temp = node(index);
		Node up = temp.pre;
		Node down = temp.next;
		up.next = down;
		down.pre = up;
		size--;
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.remove(1);
		list.insert(1, "BBB");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
