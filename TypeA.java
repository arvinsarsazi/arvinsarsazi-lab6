import java.util.Random;

public class TypeA extends Thing {

    public TypeA(int row, int col, char lab, int dir) {
        
        super(row, col, 'r', 0);
        
    }

    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }
        
    }
}
