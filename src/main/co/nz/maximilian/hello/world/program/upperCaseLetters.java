package main.co.nz.maximilian.hello.world.program;

public enum upperCaseLetters {

    // Assign all of the uppercase letters
    A('A'),
    B('B'),
    C('C'),
    D('D'),
    E('E'),
    F('F'),
    G('G'),
    H('H'),
    I('I'),
    J('J'),
    K('K'),
    L('L'),
    M('M'),
    N('N'),
    O('O'),
    P('P'),
    Q('Q'),
    R('R'),
    S('S'),
    T('T'),
    U('U'),
    V('V'),
    W('W'),
    X('X'),
    Y('Y'),
    Z('Z');

    // Put them into a constructor so that we can access the character
    public final Character letter;
    upperCaseLetters(Character character)
    {
        this.letter = character;
    }
}