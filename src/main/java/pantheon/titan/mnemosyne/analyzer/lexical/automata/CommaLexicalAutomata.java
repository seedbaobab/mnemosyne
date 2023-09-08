package pantheon.titan.mnemosyne.analyzer.lexical.automata;

import automata.lexical.LexicalAutomata;
import automata.lexical.LexicalState;

/**
 * Lexical automata for recon a comma.
 */
public class CommaLexicalAutomata extends LexicalAutomata {

    /**
     * Initialize a new instance of {@link CommaLexicalAutomata} class.
     */
    public CommaLexicalAutomata() {
        super("CLOSE PARENTHESIS");
        LexicalState STATE_0 = new LexicalState(this, true, false, 0);
        LexicalState STATE_1 = new LexicalState(this, false, true, 0);

        STATE_0.addTransition(",", STATE_1);

        this.addState(STATE_0);
        this.addState(STATE_1);
    }
}

