// b05_kontrollstruktur
// i_do_equals

import java.io.*;

public class DoSchleife
{
   public static void main(String[] args) throws Exception
   {
      InputStreamReader eingabeLeser;
      BufferedReader    gepufferterLeser;
      String            eingabeText = "";
      int               gebot       = 0;

      eingabeLeser     = new InputStreamReader(System.in);
      gepufferterLeser = new BufferedReader(eingabeLeser);

      System.out.println("/nVersteigerung /n");

      // Die do-Schleife enthaelt in ihrem Fuss eine Bedingung.
      // Dieser "while-Fuss" MUSS mit einem Semikolon enden.
      // Die Bedingung wird NACH jedem Schleifendurchlauf geprueft.
      // Wenn die Bedingung erfuellt ist, wird der Schleifenrumpf
      // noch einmal durchlaufen. Wenn nicht, dann endet die Wiederholung.
      // Mindestens einmal wird der Rumpf aber auf JEDEN FALL
      // durchlaufen ("Annehmende Schleife").
      // Die for-Schleife und die while-Schleife werden auch
      // "Abweisende Schleifen" bezeichnet.

      do
      {
         gebot = gebot + 100;
         System.out.println("Gebot: " + gebot);

         System.out.print("Mehr bieten? (ja/nein): ");
         eingabeText = gepufferterLeser.readLine();
      }
      while(eingabeText.equals("ja"));
   }
}