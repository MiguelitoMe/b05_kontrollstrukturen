// b05_kontrollstruktur
// g_geschachteltes_if

// Schlechter Code
public class ABCAnalyse4
{
  public static void main (String[] args)
  {
    char prioritaet = 'C';

    if(prioritaet == 'A')
    {
      System.out.println("Hoch");
    }
      if(prioritaet == 'B')
      {
        System.out.println("Mittel");
      }
        if(prioritaet == 'C')
        {
          System.out.println("Niedrig");
        }
    else
    {
      System.out.println("Unzulaessig");
    }
  }
}

















