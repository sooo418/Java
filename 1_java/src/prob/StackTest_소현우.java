package prob;

public class StackTest_소현우 {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

/*class MyStack {
	List<Integer> stack = new ArrayList<Integer>();
	int size = 0;

	public MyStack() {
		stack = new ArrayList<Integer>(10);
		size = 10;
	}

	public MyStack(int size) {
		if (size < 0) {
			stack = new ArrayList<Integer>(10);
			size = 10;
			return;
		}
		stack = new ArrayList<Integer>(size);
		this.size = size;
	}

	public void push(int num) {
		stack.add(num);
	}

	public boolean isEmpty() {

		return stack.isEmpty();
	}

	public boolean isFull() {
		return (stack.size() == size);
	}

	public int top() {
		if (stack.size() == 0)
			return -1;
		return stack.get(stack.size() - 1);
	}

	public int pop() {
		if (stack.size() == 0)
			return -1;
		int temp = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return temp;
	}
}
*/