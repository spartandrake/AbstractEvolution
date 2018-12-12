package freecell;

public class TableFoundation extends Stack implements Relocate {

	public TableFoundation(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		/*
		Stack tempStack = new Stack(this.getCapacity());
	    String str = "";
	    while( !isEmpty() )
	    {
	    	PlayingCard temp = pop();
	        str += String.valueOf( temp ) + "\n";
	        tempStack.push(temp);
	    }
	    while(!tempStack.isEmpty()) {
	    	this.push(tempStack.pop());
	    }
	    */
		if(isEmpty()) {
			return "Empty";
		}
		else {
			return this.peek() + "";
		}
	}
}
