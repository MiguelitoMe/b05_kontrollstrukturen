// b05_kontrollstruktur
// g_geschachteltes_if

public class Note2
{
  public static void main(String[] args)
  {
    int punkte = 120;

    // An Stelle von sieben einzelnen Bedingungen
    // (fuer jede Note ein eigenes "if"), kann man auch
    // eine geschachtelte if-Struktur benutzen.
    // Der Ablauf wird dadurch wesentlich schneller.

    if(punkte > 100)
    {
      System.out.println("Unzulaessig");
    }
    else
    {
      if(punkte >= 92)
      {
        System.out.println("Sehr gut");
      }
      else
      {
        if(punkte >= 81)
        {
          System.out.println("Gut");
        }
        else
        {
          if(punkte >= 67)
          {
            System.out.println("Befriedigend");
          }
          else
          {
            if(punkte >= 50)
            {
              System.out.println("Ausreichend");
            }
            else
            {
              if(punkte >= 30)
              {
                System.out.println("Mangelhaft");
              }
              else
              {
                if(punkte >= 0)
                {
                  System.out.println("Ungenuegend");
                }
                else
                {
                  System.out.println("Unzulaessig");
                }
              }
            }
          }
        }
      }
    }
  }
}









