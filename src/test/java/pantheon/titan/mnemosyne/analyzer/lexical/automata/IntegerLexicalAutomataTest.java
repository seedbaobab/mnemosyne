package pantheon.titan.mnemosyne.analyzer.lexical.automata;

import automata.lexical.model.Symbol;
import org.junit.jupiter.api.*;

/**
 * Test class for {@link IntegerLexicalAutomata} instance.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntegerLexicalAutomataTest {

    /**
     * The IntegerLexicalAutomata instance to test.
     */
    private static final IntegerLexicalAutomata AUTOMATA = new IntegerLexicalAutomata();

    /**
     * Method for testing the extraction for integer lexical.
     */
    @Test
    @Order(1)
    @DisplayName("INTEGER LEXICAL AUTOMATA : extract()")
    public void extract() {
        Symbol extraction = AUTOMATA.extract("10a");

        Assertions.assertNotNull(extraction);
        Assertions.assertEquals("INTEGER", extraction.code);
        Assertions.assertEquals("10", extraction.symbol);
        Assertions.assertEquals(0, extraction.start);
        Assertions.assertEquals(1, extraction.end);

        Assertions.assertNull(AUTOMATA.extract("10a", 2));
    }

}
