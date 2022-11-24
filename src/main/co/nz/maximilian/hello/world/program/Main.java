package main.co.nz.maximilian.hello.world.program;

public class Main {

    public static void main(String[] args) {
        
        // Make a new hello world using the factory
        HelloWorldFactory myFirstHelloWorldFactory = new HelloWorldFactory();        
        HelloWorld myFirstHelloWorld = myFirstHelloWorldFactory.createHelloWorld();

        // Print hello world
        myFirstHelloWorld.printHelloWorld(true, myFirstHelloWorld);

    }
    
}