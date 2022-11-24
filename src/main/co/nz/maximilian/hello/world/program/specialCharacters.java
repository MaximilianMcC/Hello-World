package main.co.nz.maximilian.hello.world.program;

public enum specialCharacters {

    // Assign all of the special letters
    //TODO: Add more
    FULL_STOP('.'),
    COMMA(','),
    EXCLAMATION_MARK('!'),
    SPACE(' ');

    // Put them into a constructor so that we can access the character
    public final Character specialCharacter;
    specialCharacters(Character character)
    {
        this.specialCharacter = character;
    }
}