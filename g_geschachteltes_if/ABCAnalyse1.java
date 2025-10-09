// b05_kontrollstruktur
// g_geschachteltes_if

// Schlechter Code
public class ABCAnalyse1
{
  public static void main (String[] args)
  {
    char prioritaet = 'X';

    if(prioritaet == 'A')
    {
      System.out.println("Hoch");
    }
    else
    {
      if(prioritaet == 'B')
      {
        System.out.println("Mittel");
      }
    }
    else
    {
      System.out.println("Niedrig");
    }

    // Compiliert nicht
    // error: 'else' without 'if'
  }
}