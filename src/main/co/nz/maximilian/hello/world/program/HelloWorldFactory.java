package main.co.nz.maximilian.hello.world.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloWorldFactory {
    
    
    public HelloWorld createHelloWorld() {

        // Make the empty hello world thing
        HelloWorld helloWorld = new HelloWorld();

        // Find all of the letters and special characters we need to print hello world
        String helloWorldString = getHelloWorldString();
        for (int i = 0; i < helloWorldString.length(); i++) {
            
            // Find uppercase letters
            for (upperCaseLetters currentUpperCaseLetter : upperCaseLetters.values()) {
                
                if (currentUpperCaseLetter.letter == helloWorldString.charAt(i)) {
                    helloWorld.contents.add(currentUpperCaseLetter.letter);
                }
            }

            // Find lowercase letters
            for (lowerCaseLetters currentLowerCaseLetter : lowerCaseLetters.values()) {

                if (currentLowerCaseLetter.letter == helloWorldString.charAt(i)) {
                    helloWorld.contents.add(currentLowerCaseLetter.letter);
                }
            }

            // Find special characters
            for (specialCharacters currentSpecialCharacter : specialCharacters.values()) {

                if (currentSpecialCharacter.specialCharacter == helloWorldString.charAt(i)) {
                    helloWorld.contents.add(currentSpecialCharacter.specialCharacter);
                }
            }
        }
        
        // Give back the hello world
        return helloWorld;
    }

    private String getHelloWorldString() {

        String helloWorldString = "";

        try {
            // Get the hello world string from some random C++ hello world tutorial
            URL helloWorldUrl = new URL("https://www.programiz.com/cpp-programming/examples/print-sentence");
            URLConnection helloWorldUrlConnection = helloWorldUrl.openConnection();
            BufferedReader helloWorldBufferedReaderInputStreamReader = new BufferedReader(new InputStreamReader(helloWorldUrlConnection.getInputStream()));

            // Loop through each line and match it to hello world regex
            String currentHelloWorldLine;
            Pattern helloWorldStringRegexPattern = Pattern.compile("Hello, World!");

            while ((currentHelloWorldLine = helloWorldBufferedReaderInputStreamReader.readLine()) != null) {

                Matcher helloWorldStringRegexPatternMatches = helloWorldStringRegexPattern.matcher(currentHelloWorldLine);
                Boolean foundHelloWorldStringInCurrentLine = helloWorldStringRegexPatternMatches.find();

                if (foundHelloWorldStringInCurrentLine == true) {
                    
                    System.out.println(currentHelloWorldLine);
                    
                }
            }

            // Close the hello world buffered read input stream reader because it's no longer needed
            helloWorldBufferedReaderInputStreamReader.close();

            
        } catch(Exception e) {
            
            // Catch errors
            System.err.println("Bruh hello world error:\n");
            e.printStackTrace();
        }


        return helloWorldString;
    }

}
