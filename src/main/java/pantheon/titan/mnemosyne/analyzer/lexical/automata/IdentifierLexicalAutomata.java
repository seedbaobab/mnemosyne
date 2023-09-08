package pantheon.titan.mnemosyne.analyzer.lexical.automata;

import automata.lexical.LexicalAutomata;
import automata.lexical.LexicalState;

/**
 * Lexical automata for recon an identifier.
 */
public class IdentifierLexicalAutomata extends LexicalAutomata {

    /**
     * Initialize a new instance of {@link IdentifierLexicalAutomata} class.
     */
    public IdentifierLexicalAutomata() {
        super("IDENTIFIER");
        LexicalState STATE_0 = new LexicalState(this, true, true, 0);
        LexicalState STATE_1 = new LexicalState(this, false, true, 1);

        STATE_0.addTransition("[a-zA-Z]", STATE_1);
        STATE_1.addTransition("[a-zA-Z0-9-_]", STATE_1);

        this.addState(STATE_0);
        this.addState(STATE_1);
    }
}
