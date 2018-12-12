package freecell;

public class TableFreeCell extends Stack implements Relocate {
	
	public TableFreeCell(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		Stack tempStack = new Stack(this.getCapacity());
	    String str = "";
	    while( !isEmpty() )
	    {
	    	PlayingCard temp = pop();
	        tempStack.push(temp);
	    }
	    while(!tempStack.isEmpty()) {
	    	PlayingCard temp = tempStack.pop();
	    	str += String.valueOf( temp ) + "\n";
	    	this.push(temp);
	    }
	    if(isEmpty()) {
	    	return "Empty";
	    }
	    return str;
	}
}