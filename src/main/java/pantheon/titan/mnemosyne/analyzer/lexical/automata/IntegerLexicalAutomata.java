package pantheon.titan.mnemosyne.analyzer.lexical.automata;

import automata.lexical.LexicalAutomata;
import automata.lexical.LexicalState;

/**
 * Lexical automata for recon an integer.
 */
public class IntegerLexicalAutomata extends LexicalAutomata {

    /**
     * Initialize a new instance of {@link IntegerLexicalAutomata} class.
     */
    public IntegerLexicalAutomata() {
        super("INTEGER");
        LexicalState STATE_0 = new LexicalState(this, true, true, 0);
        STATE_0.addTransition("\\d", STATE_0);
        this.addState(STATE_0);
    }
}
