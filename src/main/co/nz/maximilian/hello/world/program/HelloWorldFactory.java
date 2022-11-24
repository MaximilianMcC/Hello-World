package main.co.nz.maximilian.hello.world.program;

public class HelloWorldFactory {
    
    
    public HelloWorld createHelloWorld() {

        // Find all of the letters and special characters we need to print hello world
        String helloWorldString = "Hello, world!";
        for (int i = 0; i < helloWorldString.length(); i++) {
            
            // Find uppercase letters
            for (upperCaseLetters currentUpperCaseLetter : upperCaseLetters.values()) {
                
                if (currentUpperCaseLetter.letter == helloWorldString.charAt(i)) {
    
                }
            }

            // Find lowercase letters
            for (lowerCaseLetters currentLowerCaseLetter : lowerCaseLetters.values()) {

                if (currentLowerCaseLetter.letter == helloWorldString.charAt(i)) {

                }
            }

            // Find special characters
            for (specialCharacters currentSpecialCharacter : specialCharacters.values()) {

                if (currentSpecialCharacter.specialCharacter == helloWorldString.charAt(i)) {
                    
                }
            }
        }
        



        return new HelloWorld();
    }

}
