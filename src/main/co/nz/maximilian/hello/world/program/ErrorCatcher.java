package main.co.nz.maximilian.hello.world.program;

public class ErrorCatcher {
    
    public static void catchError(Exception e) {
        
        try {
            System.out.println("Bruh hello world error:\n");
            e.printStackTrace();
            
        } catch (Exception error) {
            catchError(error);
        }

    }

}
