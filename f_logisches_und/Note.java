// b05_kontrollstruktur
// f_logisches_und

public class Note
{
  public static void main(String[] args)
  {
    int punkte = 69;

    // Der logische Operator && verknuepft zwei Bedingungen
    // zu einer Gesamtbedingung. Diese ist genau dann true,
    // wenn BEIDE Bedingungen true sind.
    // Er stellt also eine UND-Verknuepfung dar.

    if(punkte >= 92 && punkte <= 100)
    {
      System.out.println("Sehr gut");
    }

    if(punkte >= 81 && punkte <= 91)
    {
      System.out.println("Gut");
    }

    if (punkte >= 67 && punkte <= 80)
    {
      System.out.println("Befriedigend");
    }

    if (punkte >= 50 && punkte <= 66)
    {
      System.out.println("Ausreichend");
    }

    if (punkte >= 30 && punkte <= 49)
    {
      System.out.println("Mangelhaft");
    }

    if (punkte >= 0 && punkte <= 29)
    {
      System.out.println("Ungenuegend");
    }

    // Der logische Operator || verknuepft zwei Bedingungen
    // zu einer Gesamtbedingung. Dies ist genau dann true,
    // wenn mindestens EINE der beiden Bedingungen true ist.
    // Er stellt also eine ODER-Verknuepfung dar.

    if (punkte < 0 || punkte > 100)
    {
      System.out.println("Unzulaessige Punktzahl ");
    }
  }
}