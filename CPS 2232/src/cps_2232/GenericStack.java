package cps_2232;

public class GenericStack<E> {

	public java.util.ArrayList<E> list = new java.util.ArrayList<>();

	public int getSize() {
		return list.size();
	}

	public E peek() {
		return list.get(getSize() - 1);
	}

	public void push(E o) {
		list.add(o);
	}

	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
	
	public static void main(String[] args) {

		//Class Challenge 2/3/22

		var strStack = new GenericStack<String>();
		strStack.push("Data Structures");
		strStack.push("Ian");
		strStack.push("Kurywczak");
		strStack.push("CPS*2232*4");

		System.out.println(strStack);
		System.out.println("Top of stack " + strStack.peek());

		System.out.println("We will remove: " + strStack.pop() + ", and will have left: ");
		System.out.println(strStack);

		var intStack = new GenericStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);

		System.out.println("We will remove: " + intStack.pop() + ", and will have left: ");
		System.out.println(intStack);

		var catStack = new GenericStack<Object>();
		catStack.push("Gary");
		catStack.push("Kiwi");
		catStack.push("Jag");

		System.out.println("We will remove: " + catStack.pop() + ", and will have left: ");
		System.out.println(catStack);

	}
}