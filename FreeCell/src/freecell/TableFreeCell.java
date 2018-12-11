package freecell;

public class TableFreeCell extends Stack implements Relocate {
	
	public TableFreeCell(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
	    String str = "";
	    while( !isEmpty() )
	    {
	        str += String.valueOf( pop() ) + "\n";
	    }
	    return str;
	}
}