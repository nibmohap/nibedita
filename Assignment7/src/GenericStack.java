public class GenericStack {
	static int index = 0;
	static Object[] stack = new Object[10];

	static Object push(Object x) {
		Object temp = 0;
		if (index < 9) {
			stack[index++] = x;
			temp = x;
		} else {
			System.out.println("Stack is already full..");
		}
		return temp;

	}

	static Object pop() {
		Object temp = 0;
		if (index < 0)

		{
			System.out.println("Stack is already empty......");
		} else {
			temp = stack[index - 1];
			stack[index--] = 0;
		}
		return temp;
	}

	static void peek() {
		System.out.println("the top element is " + stack[index - 1]);
	}

	static void display() {
		System.out.print("Elements of Stack are =");
		for (int i = 0; i <= index - 1; i++) {
			System.out.print(stack[i] + ",");
		}
		System.out.println(" ");

	}

	public static void main(String[] args)

	{
		int[] arr = { 1, 2 };

		System.out.println(push(0) + " is added to Stack");
		System.out.println(push("nibedita") + " is added to Stack");
		System.out.println(push(22) + " is added to Stack");
		System.out.println(push("hari oum") + " is added to Stack");
		for (int i = 0; i < 2; i++) {
			System.out.println(push(arr[i]) + " is added to Stack");
		}
		System.out.println(push(99) + " is added to Stack");
		peek();
		display();
		System.out.println(pop() + " is Removed from Stack");
		peek();
		display();

	}
}
