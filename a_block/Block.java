public class Block
{
  public static void main (String[] args)
  {
    // Eine Variable gilt nur in dem Block, in dem sie
    // deklariert wurde. (Eine Variable kann auch im Kopf
    // eines Blocks fuer diesen Block deklariert werden.
    {
      int i = 42;
    }

    // System.out.println(i);  // Geht nicht.
				               // Ist ausserhalb des Blocks.

	int j = 43;

	{
	  System.out.println(j);  // Geht!
	}			              // Ist in einem "Unterblock".
  }
}





