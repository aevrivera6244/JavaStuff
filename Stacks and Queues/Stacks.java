import java.util.Stack;
import java.util.Scanner;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); 
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int top = -1;
		
		System.out.print("Enter value of container elements: ");
	    int ElemNum = scanner.nextInt();
	    
	    // Push
	    
		while(true)
		{
			top++;
			if(top < ElemNum)
			{
				System.out.println("Enter Element[" + top + "]: ");
		    	String Elem = scanner2.nextLine();
		    	stack.add(Elem);
		    	continue;
			}
			break;		    
		}
		System.out.println("Stack: " + stack);
		
		// Pop
		top --;
		while(true)
		{
			if(stack.empty() == false)
			{
				System.out.println();
				System.out.println("Pop index [" + top + "]? ");
				System.out.print("(1) Yes or (2) No: ");
				int user = scanner.nextInt();
				if(user == 1)
				{
					top--;
					stack.pop();
					System.out.println("Stack: " + stack);
					continue;
				}
				else if(user == 2)
				{
					System.out.println("Stack: " + stack);
					break;
				}
			}
			else if(stack.empty() == true)
			{
				System.out.println("Stack is empty");
				break;
			}
				
		}
	}

}
