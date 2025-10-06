import java.util.Random;

public class TypeA extends Thing {

    public TypeA(int row, int col, char lab, int dir, Random rand) {
        
        super(row, col, 'r', 0, rand);
        
    }

    public void maybeTurn() {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }
        
    }
}
