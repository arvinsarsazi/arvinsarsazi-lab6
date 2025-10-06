import java.util.*;

public class DotChaser {

  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 ) {
      N = Integer.parseInt(args[0]);
    }

    Random rand = new Random(System.currentTimeMillis());
    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {
        
        list.addThing(new TypeA(45,50,'r',0));
        list.addThing(new TypeB(55,50,'b',0));
        list.addThing(new TypeC(50, 50,'y',rand.nextInt(4)));
        
      }
      
      list.printAll();
      System.out.println("done");
      System.out.flush();

      list.moveAll(rand);

      count++;
    }
  }
}