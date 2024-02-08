import java.util.Scanner;
import java.util.Stack;

public class Stacks2 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); 
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int top = -1;
		
		System.out.print("Enter value of stack elements: ");
	    int ElemNum = scanner.nextInt();
	    
	    while(true)
	    {
	    	System.out.println("\n(1) Push \n(2) Pop \n(3) Exit");
		    System.out.print("Please select an operation: ");
		    int Operation = scanner.nextInt();
	    	if(Operation == 1)
	    	{
	    		System.out.println("\nPush() Selected.");
	    		top++;
				if(top < ElemNum)
				{
					System.out.print("Enter Element[" + top + "]: ");
			    	String Elem = scanner2.nextLine();
			    	stack.add(Elem);
			    	System.out.println("Stack: " + stack);
			    	continue;
				}
				else if(top >= ElemNum)
				{
					top--;
					System.out.println("Stack is Full");
					continue;
				}
				break;
	    	}
	    	else if(Operation == 2)
	    	{
	    		System.out.println("\nPop() Selected.");
				if(stack.empty() == false)
				{
					System.out.print("Popped Element[" + top + "]: " + stack.pop()+ "\n");
					top--;
			    	System.out.println("Stack: " + stack);
			    	continue;
				}
				else if(stack.empty() == true)
				{
					System.out.println("Stack is Empty");
					continue;
				}
				break;
	    		
	    	}
	    	else if(Operation == 3)
	    	{
	    		System.out.println("Stack: " + stack);
	    		break;
	    	}
	    	else
	    	{
	    		System.out.println("Error, please try again.");
	    		continue;
	    	}
	    }
	    
	}

}
