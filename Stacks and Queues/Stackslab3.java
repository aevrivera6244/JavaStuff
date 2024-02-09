import java.util.Scanner;
import java.util.Stack;

public class Stackslab3 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); 
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int top = -1;
		
		System.out.print("Enter value of stack elements(00 - infinite): ");
	    int ElemNum = scanner.nextInt();
	    int elemcount = -1;
	    
	    while(true)
	    {
	    	if(ElemNum == 00)
	    	{
	    		System.out.println("\n(1) Push \n(2) Pop \n(3) Display Stack \n(4) Exit");
			    System.out.print("Please select an operation: ");
			    int Operation = scanner.nextInt();
			    if(Operation == 1) // Push (infinite)
		    	{
		    		System.out.println("\nPush() Selected.");
					if(stack.empty() == true || stack.empty() == false)
					{
						elemcount++;
						System.out.print("Enter Element[" + elemcount + "]: ");
				    	String Elem = scanner2.nextLine();
				    	stack.add(Elem);
				    	System.out.println("Stack: " + stack);
				    	continue;
					}
					break;
		    	}
			    else if(Operation == 2) // Pop
		    	{
		    		System.out.println("\nPop() Selected.");
					if(stack.empty() == false)
					{
						System.out.print("Popped Element[" + elemcount + "]: " + stack.pop()+ "\n");
						elemcount--;
				    	System.out.println("Stack: " + stack);
				    	continue;
					}
					else if(elemcount == -1)
					{
						System.out.println("Stack is Empty");
						continue;
					}
		    	}
				else if(Operation == 3) // Display Stack
			    {
			    	System.out.println("Stack: " + stack);
			    	for(int i = 0; i < stack.size(); i++)
			    	{
			    		System.out.println("Element at index " + i + ": " + stack.get(i));
			    	}
			    	continue;
			    }
			    else if(Operation == 4) // Exit
			    {
			    	System.out.println("Stack: " + stack);
			    	break;
			    }
			    else
		    	{
		    		System.out.println("Error, please try again.");
		    		continue;
		    	}
				break;
		    		
		    }
	    	
	    	// If ElemNum not is NOT equal to 0
	    	
	    	System.out.println("\n(1) Push \n(2) Pop \n(3) Display Stack \n(4) Exit");
		    System.out.print("Please select an operation: ");
		    int Operation = scanner.nextInt();
	    	if(Operation == 1) // Push
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
	    	else if(Operation == 2) // Pop
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
	    	else if(Operation == 3) // Display Stack
	    	{
	    		System.out.println("Stack: " + stack);
	    		for(int i = 0; i < stack.size(); i++)
		    	{
		    		System.out.println("Element at index " + i + ": " + stack.get(i));
		    	}
	    		continue;
	    	}
	    	else if(Operation == 4) // Exit
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
