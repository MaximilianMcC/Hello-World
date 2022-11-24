package main.co.nz.maximilian.hello.world.program;

public enum lowerCaseLetters {

    // Assign all of the lowercase letters
    A('a'),
    B('b'),
    C('c'),
    D('d'),
    E('e'),
    F('f'),
    G('g'),
    H('h'),
    I('i'),
    J('j'),
    K('k'),
    L('l'),
    M('m'),
    N('n'),
    O('o'),
    P('p'),
    Q('q'),
    R('r'),
    S('s'),
    T('t'),
    U('u'),
    V('v'),
    W('w'),
    X('x'),
    Y('y'),
    Z('z');

    // Put them into a constructor so that we can access the character
    public final Character letter;
    lowerCaseLetters(Character character)
    {
        this.letter = character;
    }
}