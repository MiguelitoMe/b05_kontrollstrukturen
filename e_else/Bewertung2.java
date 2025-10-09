// b05_kontrollstruktur
// e_else

public class Bewertung2
{
  public static void main(String[] args)
  {    
    int punkte;
    punkte = 49;

    // Eine Alternative ("Verzweigung") wird mit dem
    // Schluesselwort if und einer Bedingung eingeleitet.
    // Wenn die bedingung erfuellt ist, wird der
    // nachfolgende Rumpf ausgefuehrt ("Dann-Zweig").
    // Sonst wird der Block ausgefuehrt, der dem
    // Schluesselwort else folgt ("Sonst-Zweig"):
      
    if(punkte >= 50)
    {
      System.out.println("Bestanden");
    }
    else
    {
      System.out.println("Nicht bestanden");
    }
  }
}


















