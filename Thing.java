import java.util.Random;

public abstract class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.

    public int row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;

    protected Random rand;

    protected Thing(int row, int col, char lab, int dir, Random rand) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = dir;
        this.timeSinceLast = 0;
        this.isTypeB = false;
        this.rand = rand;
    }

    protected void rightTurn() {
        this.dir = (this.dir + 1) % 4; 
    }
    protected void leftTurn()  { 
        this.dir = (this.dir + 3) % 4; 
    }

    public abstract void maybeTurn();

    public void step() {
        final int[] dc = {
      0, 1, 0, -1
    }, dr = {
      1, 0, -1, 0
    };
    this.row += dr[this.dir];
    this.col += dc[this.dir];
    }

}

