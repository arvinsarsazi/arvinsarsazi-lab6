import java.util.Random;

public class ThingList {

    private class Node {
        Thing data;
        Node next;
        Node(Thing data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head = null;

    public void addThing(Thing t) {

        Node newhead = new Node(t, null);
        newhead.next = head;
        head = newhead;
    
    }

    public void printAll() {
        for (Node T = head; T != null; T = T.next) {

            System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
            
        }
    }

    
    public void moveAll(Random rand) {
        for (Node H = head; H != null; H = H.next) {
            H.data.maybeTurn(rand);
            H.data.step();
        }
    }
}
