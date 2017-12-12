
public class Queue {

	private Node head, tail;

	public Queue() {
		head = null;
		tail = null;
	}
	
	public void enqueue(String record) {
		Node newNode = new Node(record);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public String dequeue() {
		String returnRecord = "";
		if (head != null) {
			returnRecord = head.record;
			head = head.next;
			head.prev = null;
		}
		return returnRecord;
	}
	
	public void printQueue() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
	
}
