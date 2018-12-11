package freecell;

public class TableColumn extends Stack implements Relocate{
	//
	public TableColumn(int capacity) {
		super(capacity);
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