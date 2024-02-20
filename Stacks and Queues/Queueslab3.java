// DO NOT USE, USE QUEUESLAB3FDC.java
// Correction, this algorithm is actually correct
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Queueslab3 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int rear = -1;
		
		System.out.print("Enter size of Queue(00 - infinite): ");
		int Qsize = scanner1.nextInt();
		
		while(true)
		{
			// If size of Queue is infinite
			if(Qsize == 00)
			{
				System.out.println("\n(1) Enqueue \n(2) Dequeue \n(3) Display Queue \n(4) Exit");
				System.out.print("Please select an operation: ");
				int Operation = scanner1.nextInt();
				if(Operation == 1) // Enqueue()
				{
					System.out.println("\nEnqueue() Selected.");
					
					if(queue.isEmpty() == false || queue.isEmpty() == true)
					{
						rear++;
						System.out.print("Enter Element[" + rear + "]: ");
						String Elem = scanner2.nextLine();
						queue.add(Elem);
						System.out.println("Queue: " + queue);
						continue;
					}
				}
				else if(Operation == 2) //Dequeue()
				{
					System.out.println("\nDequeue() selected.");
					if(queue.isEmpty() == false)
					{
						System.out.print("Dequeued Element: " + queue.poll()+ "\n");
						rear--;
						System.out.println("Queue: " + queue);
						continue;
					}
					else if(rear == -1)
					{
						System.out.println("Queue is Empty");
						continue;
					}
				}
				else if(Operation == 3)
				{
					System.out.println("Queue: " + queue);
					for(int i = 0; i < queue.size(); i++)
			    	{
			    		System.out.println("Element at index " + i + ": " + queue.toArray()[i]);
			    	}
					continue;
				}
				else if(Operation == 4)
				{
					System.out.println("Queue: " + queue);
					break;
				}
				else
				{
					System.out.println("Something went wrong. Try again.");
					continue;
				}
			}
			
			//If size of Queue is NOT infinite
			System.out.println("\n(1) Enqueue \n(2) Dequeue \n(3) Display Queue \n(4) Exit");
			System.out.print("Please select an operation: ");
			int Operation = scanner1.nextInt();
			if(Operation == 1) // Enqueue()
			{
				System.out.println("\nEnqueue() Selected.");
				rear++;
				if(rear < Qsize)
				{
					System.out.print("Enter Element[" + rear + "]: ");
					String Elem = scanner2.nextLine();
					queue.add(Elem);
					System.out.println("Queue: " + queue);
					continue;
				}
				else if(queue.size() >= Qsize)
				{
					rear--;
					System.out.println("Queue is Full");
					continue;
				}
			}
			else if(Operation == 2) //Dequeue()
			{
				System.out.println("\nDequeue() selected.");
				if(queue.isEmpty() == false)
				{
					System.out.print("Dequeued Element: " + queue.poll()+ "\n");
					rear--;
					System.out.println("Queue: " + queue);
					continue;
				}
				else if(queue.isEmpty() == true)
				{
					System.out.println("Queue is Empty");
					continue;
				}
			}
			else if(Operation == 3) // Display Queue
			{
				System.out.println("Queue: " + queue);
				for(int i = 0; i < queue.size(); i++)
		    	{
		    		System.out.println("Element at index " + i + ": " + queue.toArray()[i]);
		    	}
				continue;
			}
			else if(Operation == 4) // Exit
			{
				System.out.println("Queue: " + queue);
				break;
			}
			else
			{
				System.out.println("Something went wrong. Try again.");
				continue;
			}
			
		}
	}

}
