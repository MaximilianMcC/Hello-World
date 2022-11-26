package main.co.nz.maximilian.hello.world.program;

public class Main {

    public static void main(String[] args) {
        
        // Time the hello world execution time
        long startTime = System.currentTimeMillis();



        try {
            // Make a new hello world using the factory
            HelloWorldFactory myFirstHelloWorldFactory = new HelloWorldFactory();        
            HelloWorld myFirstHelloWorld = myFirstHelloWorldFactory.createHelloWorld();

            // Print hello world
            myFirstHelloWorld.printHelloWorld(true);
            
        } catch (Exception e) {

            // Catch errors
            ErrorCatcher.catchError(e);
        }



        long endTime = System.currentTimeMillis();
        System.out.println("\n\nTotal time: " + (endTime - startTime) + "ms");
    }
    
}