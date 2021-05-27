package labbook6;

public class Exercise5 {
	static class Node
	{
		int data;
		Node next;
	};
	static Node push(Node head_ref, int new_data)
	{
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.next = head_ref;
		head_ref = new_node;
		return new_node;
	}
	static void print2smallest(Node head)
	{
		int first = Integer.MAX_VALUE,
			second = Integer.MAX_VALUE;

		Node temp = head;
		while (temp != null)
		{

			if (temp.data < first)
			{
				second = first;
				first = temp.data;
			}
			else if (temp.data < second && temp.data != first)
				second = temp.data;

			temp = temp.next;
		}

		if (second == Integer.MAX_VALUE)
			System.out.print("There is no second smallest element\n");
		else
			System.out.print("The second smallest element is " + second);
	}
	public static void main(String[] args)
	{
		Node start = null;
		start = push(start, 1);
		start = push(start, 34);
		start = push(start, 10);
		start = push(start, 1);
		start = push(start, 35);
		start = push(start, 12);

		print2smallest(start);
	}

}

