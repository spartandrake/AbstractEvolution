package freecell;

public class TableFoundation extends Stack implements Relocate {

	public TableFoundation(int capacity) {
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
