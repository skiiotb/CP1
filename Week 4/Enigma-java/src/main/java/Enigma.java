/// Filename: Enigma.java
// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.List;

public final class Enigma {

    public static String Encrypt(String message, int incrementNumber,List<String> rotors )
    {
        // TODO - Implement the Encrypt method

        // Steps in brief
        // 1. Apply the CAESAR shift using the increment number
        // 2. For each rotor in the list rotors
        //  2.1 Translate the message using the rotor
        // 3. Return the encrypted string

        return "Implement the encrypt method";
    }


    public static String Decrypt(String message, int incrementNumber, List<String> rotors)
    {
        // TODO - Implement the Decrypt method

        // Steps in brief
        // 1. For each rotor in the list rotors, starting with the last rotor
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }

    public static String reverseCaesar()
   {
      String message = "Hello World";
      int incrementNumber = 4;
      List<String> rotors = new ArrayList<String>();
      
      //Caesar shift
      for(int i = 0; i < message.length(); i++)
      {
         for(int j=0; j < rotors.size(); j++)
         {
            rotors[j] = rotors[j]-(incrementNumber+1);
            
            if(rotors.indexOf[j] = message.indexOf[j])
            {
               message[j] = rotors[j];
            }
         }
      System.out.println("Message: "+message);
      }
   }
}
