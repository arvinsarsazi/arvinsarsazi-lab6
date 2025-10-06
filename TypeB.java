import java.util.Random;

public class TypeB extends Thing {

    public TypeB(int row, int col, char lab, int dir, Random rand) {
        
        super(row, col, 'b', 0, rand);
        this.isTypeB = true; 
    }

    public void maybeTurn() {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            int i = rand.nextInt(3); 
            if (i == 1) {
                rightTurn();
            } else if (i == 2) {
                leftTurn();
            }
        }
    }
}
