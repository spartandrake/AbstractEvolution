package freecell;
import java.util.ArrayList;
import java.util.List;


public class playingTable {
	// private List<Stack> tableColumns = new ArrayList<Stack>();
	private ArrayList<TableColumn> tableColumns = new ArrayList<TableColumn>();
	private ArrayList<TableFreeCell> tableFreeCells = new ArrayList<TableFreeCell>();
	private ArrayList<TableFoundation> tableFoundations = new ArrayList<TableFoundation>();
	private Deck deck = new Deck();
	public playingTable(long seed) {
		deck.shuffle(seed);
		for(int i = 0; i < 8; i++) {
			tableColumns.add(new TableColumn(52));
		}
		for(int i = 0; i < 4; i++) {
			tableFreeCells.add(new TableFreeCell(52));
		}
		for(int i = 0; i < 4; i++) {
			tableFoundations.add(new TableFoundation(13));
		}
	}
	public boolean deal() {
		for(int j = 0; j < 6; j++) {
			for(int i = 0; i < 8; i++) {
				tableColumns.get(i).push(deck.deal());
			}
		}
		tableColumns.get(0).push(deck.deal());
		tableColumns.get(1).push(deck.deal());
		tableColumns.get(2).push(deck.deal());
		tableColumns.get(3).push(deck.deal());
		return true;
	}
	
	public ArrayList<TableColumn> getTableColumns() {
		return tableColumns;
	}
	public ArrayList<TableFreeCell> getTableFreeCells() {
		return tableFreeCells;
	}
	public ArrayList<TableFoundation> getTableFoundations() {
		return tableFoundations;
	}
	
	public boolean isGameOver() {
		if(tableFoundations.get(0).peek().getValue() == 13 && tableFoundations.get(1).peek().getValue() == 13 && tableFoundations.get(3).peek().getValue() == 13 && tableFoundations.get(3).peek().getValue() == 13) {
			return true;
		}
		// no more valid moves
		// checking moves from the first column
		else if(validMove(tableColumns.get(0), tableColumns.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableColumns.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableColumns.get(3))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableColumns.get(4))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableColumns.get(5))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableColumns.get(6))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableColumns.get(7))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFreeCells.get(0))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFreeCells.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFreeCells.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFreeCells.get(3))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFoundations.get(0))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFoundations.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFoundations.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(0), tableFoundations.get(3))) { 
			return false;
		}
		// checking moves from the second column
		else if(validMove(tableColumns.get(1), tableColumns.get(0))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableColumns.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableColumns.get(3))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableColumns.get(4))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableColumns.get(5))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableColumns.get(6))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableColumns.get(7))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFreeCells.get(0))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFreeCells.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFreeCells.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFreeCells.get(3))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFoundations.get(0))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFoundations.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFoundations.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(1), tableFoundations.get(3))) { 
			return false;
		}
		// checking third column
		else if(validMove(tableColumns.get(2), tableColumns.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableColumns.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableColumns.get(3))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableColumns.get(4))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableColumns.get(5))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableColumns.get(6))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableColumns.get(7))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFreeCells.get(0))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFreeCells.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFreeCells.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFreeCells.get(3))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFoundations.get(0))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFoundations.get(1))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFoundations.get(2))) { 
			return false;
		}
		else if(validMove(tableColumns.get(2), tableFoundations.get(3))) { 
			return false;
		}
		
		// TODO columns 4 - 8 & free cells 1-4
		
		else {
			return true;
		}
	}
	private boolean validMove(Stack source, Stack dest) {
		if(source.isEmpty()) {
			return false;
		}
		else if(dest instanceof TableColumn) { // dest is a column
			if(dest.isEmpty()) {
				return true;
			}
			else if(source.peek().getColor() != dest.peek().getColor() && source.peek().getValue() == ( dest.peek().getValue() - 1 )) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(dest instanceof TableFreeCell) { // dest is a freecell
			if(dest.isEmpty()) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(dest instanceof TableFoundation) { // dest is a foundation
			if(dest.isEmpty() && source.peek().getValue() == 1) {
				return true;
			}
			else if(source.peek().getColor() == dest.peek().getColor() && source.peek().getValue() == ( dest.peek().getValue() + 1 )) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	// TODO finish all of moveCard
	public boolean moveCard(Stack source, Stack dest) {
		if(source.equals(tableColumns.get(0))) {
			if(dest.equals(tableColumns.get(0))) {
				//Do nothing
			}
			else if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableColumns.get(0), tableColumns.get(1))) {
					tableColumns.get(1).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableColumns.get(0), tableColumns.get(2))) {
					tableColumns.get(2).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableColumns.get(0), tableColumns.get(3))) {
					tableColumns.get(3).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableColumns.get(0), tableColumns.get(4))) {
					tableColumns.get(4).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableColumns.get(0), tableColumns.get(5))) {
					tableColumns.get(5).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableColumns.get(0), tableColumns.get(6))) {
					tableColumns.get(6).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableColumns.get(0), tableColumns.get(7))) {
					tableColumns.get(7).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(0), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(0), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(0), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(0), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(0), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(0), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}	
			}
			else if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(0), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(0), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else if(source.equals(tableColumns.get(1))) {
			if(dest.equals(tableColumns.get(1))) {
				//Do Nothing
			}
			else if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableColumns.get(1), tableColumns.get(0))) {
					tableColumns.get(0).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableColumns.get(1), tableColumns.get(2))) {
					tableColumns.get(2).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableColumns.get(1), tableColumns.get(3))) {
					tableColumns.get(3).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableColumns.get(1), tableColumns.get(4))) {
					tableColumns.get(4).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableColumns.get(1), tableColumns.get(5))) {
					tableColumns.get(5).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableColumns.get(1), tableColumns.get(6))) {
					tableColumns.get(6).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableColumns.get(1), tableColumns.get(7))) {
					tableColumns.get(7).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(1), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(1), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(1), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(1), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(1), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(1), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(1), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(1), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else if(source.equals(tableColumns.get(2))) {
			if(dest.equals(tableColumns.get(2))) {
				//Do Nothing
			}
			else if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableColumns.get(2), tableColumns.get(0))) {
					tableColumns.get(0).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableColumns.get(2), tableColumns.get(1))) {
					tableColumns.get(1).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableColumns.get(2), tableColumns.get(3))) {
					tableColumns.get(3).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableColumns.get(2), tableColumns.get(4))) {
					tableColumns.get(4).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableColumns.get(2), tableColumns.get(5))) {
					tableColumns.get(5).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableColumns.get(2), tableColumns.get(6))) {
					tableColumns.get(6).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			else if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableColumns.get(2), tableColumns.get(7))) {
					tableColumns.get(7).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(2), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(2), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(2), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(2), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(2), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(2), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(2), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(2), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableColumns.get(3))) {
			if(dest.equals(tableColumns.get(3))) {
				//Do Nothing
			}
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableColumns.get(3), tableColumns.get(0))) {
					tableColumns.get(0).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableColumns.get(3), tableColumns.get(1))) {
					tableColumns.get(1).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableColumns.get(3), tableColumns.get(2))) {
					tableColumns.get(2).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableColumns.get(3), tableColumns.get(4))) {
					tableColumns.get(4).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableColumns.get(3), tableColumns.get(5))) {
					tableColumns.get(5).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableColumns.get(3), tableColumns.get(6))) {
					tableColumns.get(6).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableColumns.get(3), tableColumns.get(7))) {
					tableColumns.get(7).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(3), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(3), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(3), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(3), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(3), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(3), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(3), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(3), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableColumns.get(4))) {
			if(dest.equals(tableColumns.get(4))) {
				//Do Nothing
			}
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableColumns.get(4), tableColumns.get(0))) {
					tableColumns.get(0).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableColumns.get(4), tableColumns.get(1))) {
					tableColumns.get(1).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableColumns.get(4), tableColumns.get(2))) {
					tableColumns.get(2).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableColumns.get(4), tableColumns.get(3))) {
					tableColumns.get(3).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableColumns.get(4), tableColumns.get(5))) {
					tableColumns.get(5).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableColumns.get(4), tableColumns.get(6))) {
					tableColumns.get(6).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableColumns.get(4), tableColumns.get(7))) {
					tableColumns.get(7).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(4), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(4), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(4), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(4), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(4), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(4), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(4), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(4), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(4).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableColumns.get(5))) {
			if(dest.equals(tableColumns.get(5))) {
				//Do Nothing
			}
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableColumns.get(5), tableColumns.get(0))) {
					tableColumns.get(0).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableColumns.get(5), tableColumns.get(1))) {
					tableColumns.get(1).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableColumns.get(5), tableColumns.get(2))) {
					tableColumns.get(2).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableColumns.get(5), tableColumns.get(3))) {
					tableColumns.get(3).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableColumns.get(5), tableColumns.get(4))) {
					tableColumns.get(4).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableColumns.get(5), tableColumns.get(6))) {
					tableColumns.get(6).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableColumns.get(5), tableColumns.get(7))) {
					tableColumns.get(7).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(5), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(5), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(5), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(5), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(5), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(5), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(5), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(5), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(5).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableColumns.get(6))) {
			if(dest.equals(tableColumns.get(6))) {
				//Do Nothing
			}
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableColumns.get(6), tableColumns.get(0))) {
					tableColumns.get(0).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableColumns.get(6), tableColumns.get(1))) {
					tableColumns.get(1).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableColumns.get(6), tableColumns.get(2))) {
					tableColumns.get(2).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableColumns.get(6), tableColumns.get(3))) {
					tableColumns.get(3).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableColumns.get(6), tableColumns.get(4))) {
					tableColumns.get(4).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableColumns.get(6), tableColumns.get(5))) {
					tableColumns.get(5).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableColumns.get(6), tableColumns.get(7))) {
					tableColumns.get(7).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(6), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(6), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(6), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(6), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(6), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(6), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(6), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(6), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(6).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableColumns.get(7))) {
			if(dest.equals(tableColumns.get(7))) {
				//Do Nothing
			}
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableColumns.get(7), tableColumns.get(0))) {
					tableColumns.get(0).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableColumns.get(7), tableColumns.get(1))) {
					tableColumns.get(1).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableColumns.get(7), tableColumns.get(2))) {
					tableColumns.get(2).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableColumns.get(7), tableColumns.get(3))) {
					tableColumns.get(3).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableColumns.get(7), tableColumns.get(4))) {
					tableColumns.get(4).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableColumns.get(7), tableColumns.get(5))) {
					tableColumns.get(5).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableColumns.get(7), tableColumns.get(6))) {
					tableColumns.get(6).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableColumns.get(7), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableColumns.get(7), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableColumns.get(7), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableColumns.get(7), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableColumns.get(7), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableColumns.get(7), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableColumns.get(7), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableColumns.get(7), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableColumns.get(7).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableFreeCells.get(0))) {
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(0))) {
					tableColumns.get(0).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(1))) {
					tableColumns.get(1).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(2))) {
					tableColumns.get(2).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(3))) {
					tableColumns.get(3).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(4))) {
					tableColumns.get(4).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(5))) {
					tableColumns.get(5).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(6))) {
					tableColumns.get(6).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableFreeCells.get(0), tableColumns.get(7))) {
					tableColumns.get(7).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				//Do Nothing
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableFreeCells.get(0), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableFreeCells.get(0), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableFreeCells.get(0), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableFreeCells.get(0), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableFreeCells.get(0), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableFreeCells.get(0), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableFreeCells.get(0), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableFreeCells.get(0).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableFreeCells.get(1))) {
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(0))) {
					tableColumns.get(0).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(1))) {
					tableColumns.get(1).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(2))) {
					tableColumns.get(2).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(3))) {
					tableColumns.get(3).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(4))) {
					tableColumns.get(4).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(5))) {
					tableColumns.get(5).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(6))) {
					tableColumns.get(6).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableFreeCells.get(1), tableColumns.get(7))) {
					tableColumns.get(7).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableFreeCells.get(1), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				//Do Nothing
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableFreeCells.get(1), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableFreeCells.get(1), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableFreeCells.get(1), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableFreeCells.get(1), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableFreeCells.get(1), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableFreeCells.get(1), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableFreeCells.get(1).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableFreeCells.get(2))) {
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(0))) {
					tableColumns.get(0).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(1))) {
					tableColumns.get(1).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(2))) {
					tableColumns.get(2).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(3))) {
					tableColumns.get(3).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(4))) {
					tableColumns.get(4).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(5))) {
					tableColumns.get(5).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(6))) {
					tableColumns.get(6).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableFreeCells.get(2), tableColumns.get(7))) {
					tableColumns.get(7).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableFreeCells.get(2), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableFreeCells.get(2), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				//Do Nothing
			}
			if(dest.equals(tableFreeCells.get(3))) {
				if(validMove(tableFreeCells.get(2), tableFreeCells.get(3))) {
					tableFreeCells.get(3).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableFreeCells.get(2), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableFreeCells.get(2), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableFreeCells.get(2), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableFreeCells.get(2), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableFreeCells.get(2).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else if(source.equals(tableFreeCells.get(3))) {
			if(dest.equals(tableColumns.get(0))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(0))) {
					tableColumns.get(0).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(1))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(1))) {
					tableColumns.get(1).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(2))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(2))) {
					tableColumns.get(2).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(3))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(3))) {
					tableColumns.get(3).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(4))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(4))) {
					tableColumns.get(4).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(5))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(5))) {
					tableColumns.get(5).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(6))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(6))) {
					tableColumns.get(6).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableColumns.get(7))) {
				if(validMove(tableFreeCells.get(3), tableColumns.get(7))) {
					tableColumns.get(7).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(0))) {
				if(validMove(tableFreeCells.get(3), tableFreeCells.get(0))) {
					tableFreeCells.get(0).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(1))) {
				if(validMove(tableFreeCells.get(3), tableFreeCells.get(1))) {
					tableFreeCells.get(1).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(2))) {
				if(validMove(tableFreeCells.get(3), tableFreeCells.get(2))) {
					tableFreeCells.get(2).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFreeCells.get(3))) {
				//Do Nothing
			}
			if(dest.equals(tableFoundations.get(0))) {
				if(validMove(tableFreeCells.get(3), tableFoundations.get(0))) {
					tableFoundations.get(0).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(1))) {
				if(validMove(tableFreeCells.get(3), tableFoundations.get(1))) {
					tableFoundations.get(1).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(2))) {
				if(validMove(tableFreeCells.get(3), tableFoundations.get(2))) {
					tableFoundations.get(2).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
			if(dest.equals(tableFoundations.get(3))) {
				if(validMove(tableFreeCells.get(3), tableFoundations.get(3))) {
					tableFoundations.get(3).push(tableFreeCells.get(3).pop());
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			//You broke it
			return false;
		}
		return false;
	}
	public String toString() {
		return tableColumns + "\n" + tableFreeCells + "\n" + tableFoundations + "\n";
	}
}
