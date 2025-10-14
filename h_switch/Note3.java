// b05_kontrollstruktur
// h_switch

public class Note3
{
   public static void main(String[] args)
   {
      int note = 2;

      // Die "Mehrfache Alternative" wird durch einen
      // "switch" (= "Schalter") realisiert.
      // Die Variable in dem Klammerpaar hinter dem
      // Schluesselwort "switch" enthaelt den Auswahlwert.
      // Sie muss einen int-kompatiblen Typ (d.h. int oder
      // kleiner) oder den Typ String haben.
      // enum ist ebenfalls erlaubt.
      // Jeder "erlaubte" Fall wird durch "case" eingeleitet.
      // Die Folge der Anweisungen, die jeweils fuer einen
      // Fall ausgefuehrt werden soll, muss durch "break"
      // abgeschlossen werden.

      switch(note)
      {
         case 1:
            System.out.println("Die Note ist:");
            System.out.println("sehr gut");
            break;
         case 2:
            System.out.println("Die Note ist:");
            System.out.println("gut");
            break;
         case 3:
            System.out.println("Die Note ist:");
            System.out.println("befriedigend");
            break;
         case 4:
            System.out.println("Die Note ist:");
            System.out.println("ausreichend");
            break;
         case 5:
            System.out.println("Die Note ist:");
            System.out.println("mangelhaft");
            break;
         case 6:
            System.out.println("Die Note ist:");
            System.out.println("ungenuegend");
            break;
         default:
            System.out.println("Unzulaessige Zahl");
      }
   }
}