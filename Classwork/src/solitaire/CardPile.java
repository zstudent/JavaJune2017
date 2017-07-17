package solitaire;

//
//Abstraction for piles of cards for Solitaire game
//written by Tim Budd, April 1997
//
/* Upgraded to Java 5.0, Sven-Olof Nystrom, 2005 */


import java.awt.*;
import java.util.Stack;
import java.util.EmptyStackException;

public class CardPile {
// coordinates of the card pile
protected int x;
protected int y;
protected Stack<Card> thePile;

// constructor
CardPile (int xl, int yl) 
{ x = xl; y = yl; thePile = new Stack<Card>(); }

// access to cards are not overridden
public final Card top() { return thePile.peek(); }

public final boolean isEmpty() { return thePile.empty(); }

public final Card pop() {
try {
    return thePile.pop();
} catch (EmptyStackException e) { return null; }
}

// the following are sometimes overridden
public boolean includes (int tx, int ty) {
return x <= tx && tx <= x + Card.width &&
    y <= ty && ty <= y + Card.height;
}

public void select (int tx, int ty) {
// do nothing
}

public void addCard (Card aCard)  
{ thePile.push(aCard); }

public void display (Graphics g) {
g.setColor(Color.blue);
if (isEmpty()) {
	g.drawRect(x, y, Card.width, Card.height);
} else {
	top().draw(g, x, y);
}
}

public boolean canTake (Card aCard) {
return false; 
}

}
