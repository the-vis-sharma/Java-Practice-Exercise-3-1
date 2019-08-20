import java.util.ArrayDeque;

public class Dequeue implements DequeueFunction {

	
	
	private ArrayDeque<DequeChild> queue;
	private int size;

	public Dequeue(int size) {
		this.size = size;
		queue = new ArrayDeque<DequeChild>();
	}
	
	@Override
	public boolean push(DequeChild item) {
		// TODO Auto-generated method stub
		if(queue.size() == size) {
			return false;
		}
		
		return queue.add(item);
	}

	@Override
	public DequeChild pop() {
		// TODO Auto-generated method stub
		
		// System.out.println("before Pop with front : " + front + ", rear: " + rear);
		
		return queue.poll();
	}

}
