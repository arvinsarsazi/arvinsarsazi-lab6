import java.util.Random;

public class TypeC extends Thing {

    // Center we start from (so we can check when we're back)
    private  int centerRow;
    private  int centerCol;

    // The current side length and remaining steps on this side
    private int len;         
    private int stepsLeft;   // counts down to 0, then we turn right

    public TypeC(int row, int col, char lab, int dir) {
        
        super(row, col, lab, dir);
        this.centerRow = row;
        this.centerCol = col;
        this.len = 0; 
        this.stepsLeft = 0;
    }

    public void maybeTurn(Random rand) {
        // If we just completed a side (no steps left), turn right and reset the counter
        if (stepsLeft == 0) {

            // If we're back at center, choose a new random length for the next square
            if (this.row == centerRow && this.col == centerCol) {
                this.len = 1 + rand.nextInt(50); // new 1..50
                this.stepsLeft = len;
            }
            rightTurn();        // turn right between sides
            stepsLeft = len;
        }

        // We will take exactly one step after maybeTurn() (DotChaser calls step() next),
        // so account for that by decrementing now.
        stepsLeft--;
    }
}
