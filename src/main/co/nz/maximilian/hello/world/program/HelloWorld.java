package main.co.nz.maximilian.hello.world.program;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    

    public List<Character> contents = new ArrayList<Character>();




    public void printHelloWorld(Boolean printHelloWorld) {

        try {
            // Check for if they actually want to print Hello World
            if (printHelloWorld == false) return;

            // Loop through all the characters and add it to the hello world string
            String helloWorldString = "";
            for (Character currentHelloWorldCharacter : this.contents) {
                helloWorldString += currentHelloWorldCharacter.toString();
            }

            // Print hello world
            System.out.println(helloWorldString);

        } catch (Exception e) {
            // Catch errors
            ErrorCatcher.catchError(e);
        }
    }
}
