// b05_kontrollstruktur
// d_if

public class Bewertung
{
  public static void main (String[] args)
  {
    int punkte;
    punkte = 100;

    // Eine "Bedingte Verarbeitung" wird mit dem
    // Schluesselwort if und einer Bedingung eingeleitet.
    // Nur wenn die Bedingung erfuellt ist, wird der
    // nachfolgende Rumpf ausgefuehrt.

    if(punkte >= 50)
    {
      System.out.println("Bestanden!");
    }

    // Wenn zwei Werte auf Gleichheit geprueft werden sollen,
    // muss das DOPPELTE Gleichheitszeichen benutzt werden.

    if(punkte == 100)
    {
      System.out.println("Hervorragend!");
    }
  }
}