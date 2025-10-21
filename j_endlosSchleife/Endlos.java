// b05_kontrollstruktur
// j_endlosSchleife

public class Endlos
{
   public static void main(String[] args)
   {
      short i = 1;

      while(true)
      {
         System.out.println(i);

         i++;        // Inkrementieren

         if(i == 10)
         {
            break;   // Abbruch der Endlosschleife
         }
      }
   }
}















