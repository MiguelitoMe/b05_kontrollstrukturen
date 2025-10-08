// b05_kontrollstruktur
// b_for

public class DasGanzeEinMalEins
{
  public static void main(String[] args)
  {
    int ergebnis = 0;

    System.out.println();
    System.out.println("EinMalEins");
    System.out.println("==========");

    // Die aeussere Schleife produziert jeweils neun Zeilen:
    for(int faktor = 1; faktor <= 9; faktor++)
    {
      // Die innere Schleife produziert jeweils EINE Zeile
      // mit jeweils zehn Zahlen.
      for(int i = 1; i <= 10; i++)
      { 
        ergebnis = faktor * i;
        System.out.printf("%2d ", ergebnis);
      }

      System.out.println();
    }
  }
}






