package pantheon.titan.mnemosyne.analyzer.lexical;

import automata.lexical.LexicalAutomata;
import automata.lexical.model.Symbol;
import pantheon.titan.mnemosyne.analyzer.lexical.automata.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The lexical analyzer class.
 */
public class LexicalAnalyzer {

    /**
     *
     */
    private final ArrayList<LexicalAutomata> lexical = new ArrayList<>();

    /**
     * Initialize a new instance of {@link LexicalAnalyzer} class.
     */
    public LexicalAnalyzer() {
        this.lexical.add(new CloseParenthesisLexicalAutomata());
        this.lexical.add(new CommaLexicalAutomata());
        this.lexical.add(new IdentifierLexicalAutomata());
        this.lexical.add(new IntegerLexicalAutomata());
        this.lexical.add(new OpenParenthesisLexicalAutomata());
        this.lexical.add(new PointLexicalAutomata());
    }

    public List<Symbol> analyze(String value) {
        return null;
    }
}
