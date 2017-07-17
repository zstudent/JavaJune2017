package solitaire;

/*
Simple Solitare Card Game in Java
Written by Tim Budd, Oregon State University, 1996
*/
/* Upgraded to Java 5.0, Sven-Olof Nystrom, 2005 */

import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import java.util.Enumeration;

class SuitPile extends CardPile {

  SuitPile (int x, int y) { super(x, y); }

  public boolean canTake (Card aCard) {
	if (isEmpty()) {
		return aCard.rank() == 0;
	}
	Card topCard = top();
	return (aCard.suit() == topCard.suit()) &&
	    (aCard.rank() == 1 + topCard.rank());
  }
}

class DeckPile extends CardPile {

  DeckPile (int x, int y) {
	// first initialize parent
	super(x, y);
	// then create the new deck
	// first put them into a local pile
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j <= 12; j++) {
			addCard(new Card(i, j));
		}
	}

	// then shuffle the cards
	Random generator = new Random();
	for (int i = 0; i < 52; i++) {
	    int j = Math.abs(generator.nextInt() % 52);
	    // swap the two card values
	    Card temp = thePile.elementAt(i);
	    thePile.setElementAt(thePile.elementAt(j), i);
	    thePile.setElementAt(temp, j);
	}
  }

  public void select(int tx, int ty) {
	if (isEmpty()) {
		return;
	}
	Solitare.discardPile.addCard(pop());
  }
}

class DiscardPile extends CardPile {
	
  DiscardPile (int x, int y) { super (x, y); }

  public void addCard (Card aCard) {
	if (! aCard.faceUp()) {
		aCard.flip();
	}
	super.addCard(aCard);
  }

  public void select (int tx, int ty) {
	if (isEmpty()) {
		return;
	}
	Card topCard = pop();
	for (int i = 0; i < 4; i++) {
		if (Solitare.suitPile[i].canTake(topCard)) {
		Solitare.suitPile[i].addCard(topCard);
		return;
	    }
	}
	for (int i = 0; i < 7; i++) {
		if (Solitare.tableau[i].canTake(topCard)) {
		Solitare.tableau[i].addCard(topCard);
		return;
	    }
	}
	// nobody can use it, put it back on our list
	addCard(topCard);
  }
}


class TablePile extends CardPile {

  TablePile (int x, int y, int c) {
	// initialize the parent class
	super(x, y);
	// then initialize our pile of cards
	for (int i = 0; i < c; i++) {
	    addCard(Solitare.deckPile.pop());
	}
	// flip topmost card face up
	top().flip();
  }

  public boolean canTake (Card aCard) {
	if (isEmpty()) {
		return aCard.rank() == 12;
	}
	Card topCard = top();
	return (aCard.color() != topCard.color()) &&
	    (aCard.rank() == topCard.rank() - 1);
  }

  public boolean includes (int tx, int ty) {
	// don't test bottom of card
	return x <= tx && tx <= x + Card.width &&
	    y <= ty;
  }

  public void select (int tx, int ty) {
	if (isEmpty()) {
		return;
	}

	// if face down, then flip
	Card topCard = top();
	if (! topCard.faceUp()) {
	    topCard.flip();
	    return;
	}

	// else see if any suit pile can take card
	topCard = pop();
	for (int i = 0; i < 4; i++) {
		if (Solitare.suitPile[i].canTake(topCard)) {
		Solitare.suitPile[i].addCard(topCard);
		return;
	    }
	}
	// else see if any other table pile can take card
	for (int i = 0; i < 7; i++) {
		if (Solitare.tableau[i].canTake(topCard)) {
		Solitare.tableau[i].addCard(topCard);
		return;
	    }
	}
	// else put it back on our pile
	addCard(topCard);
  }

  public void display (Graphics g) {
	int localy = y;
	for (Enumeration e = thePile.elements(); e.hasMoreElements(); ) {
	    Card aCard = (Card) e.nextElement();
	    aCard.draw (g, x, localy);
	    localy += 35;
	}
  }
}

public class Solitare {
  static public DeckPile deckPile;
  static public DiscardPile discardPile;
  static public TablePile tableau [ ];
  static public SuitPile suitPile [ ];
  static public CardPile allPiles [ ];
  private Frame window;

  static public void main (String [ ] args) {
	Solitare world = new Solitare();
  }

  public Solitare () {
	window = new SolitareFrame();
	init();
	window.setVisible(true);
  }

  public void init () {
	// first allocate the arrays
	allPiles = new CardPile[13];
	suitPile = new SuitPile[4];
	tableau = new TablePile[7];
	// then fill them in
	allPiles[0] = deckPile = new DeckPile(335, 30);
	allPiles[1] = discardPile = new DiscardPile(268, 30);
	for (int i = 0; i < 4; i++) {
		allPiles[2+i] = suitPile[i] =
		new SuitPile(15 + (Card.width+10) * i, 30);
	}
	for (int i = 0; i < 7; i++) {
		allPiles[6+i] = tableau[i] =
		new TablePile(15 + (Card.width+5) * i, Card.height + 35, i+1);
	} 
  }

  private class SolitareFrame extends Frame {

	private class RestartButtonListener implements ActionListener {
	    @Override
		public void actionPerformed (ActionEvent e) {
		init();
		window.repaint();
	    }
	}

	private class MouseKeeper extends MouseAdapter {

	    @Override
		public void mousePressed (MouseEvent e) { 
		int x = e.getX();
		int y = e.getY();
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
			allPiles[i].select(x, y);
			repaint();
		    }
		}
	    }
	}


	public SolitareFrame() {
	    setSize(600, 500);
	    setTitle("Solitaire Game");
	    addMouseListener (new MouseKeeper());
	    Button restartButton = new Button("New Game");
	    restartButton.addActionListener(new RestartButtonListener());
	    add("South", restartButton);
	}

	@Override
	public void paint(Graphics g) {
	    for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}
  }
}
