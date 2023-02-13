/// Filename: Enigma.java
// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.List;

public final class Enigma {

    public static String Encrypt(String message, int incrementNumber,List<String> rotors ){
        // TODO - Implement the Encrypt method
        String message = "Hello There";
        int incrementNumber = 4;
        List<String> rotors = new List<String>("abcdefghijklmnopqrstuvwxys");

        // Steps in brief
        // 1. Apply the CAESAR shift using the increment number
        for(int i=0; i<rotors.length; i++)
        {
            rotors[i] = rotors.indexOf([i]+incrementNumber);
            message = message*rotors[i];
        }
        System.out.println(message);
        // 2. For each rotor in the list rotors
        //  2.1 Translate the message using the rotor
        // 3. Return the encrypted string

        return "Implement the encrypt method";
    }


    public static String Decrypt(String message, int incrementNumber, List<String> rotors)
    {
        // TODO - Implement the Decrypt method
        String message = "Hello There";
        int incrementNumber = 4;
        List<String> rotors = new List<String>("abcdefghijklmnopqrstuvwxys");

        // Steps in brief
        // 1. For each rotor in the list rotors, starting with the last rotor
        for(int i=0; i<rotors.length-i; i++)
        {

        }
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }
}
