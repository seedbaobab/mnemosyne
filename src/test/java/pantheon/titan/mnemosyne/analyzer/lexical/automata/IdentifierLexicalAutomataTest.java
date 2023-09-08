package pantheon.titan.mnemosyne.analyzer.lexical.automata;

import automata.lexical.model.Symbol;
import org.junit.jupiter.api.*;

/**
 * Test class for {@link IdentifierLexicalAutomata} instance.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IdentifierLexicalAutomataTest {

    /**
     * The IntegerLexicalAutomata instance to test.
     */
    private static final IdentifierLexicalAutomata AUTOMATA = new IdentifierLexicalAutomata();

    /**
     * Method for testing the extraction for identifier lexical.
     */
    @Test
    @Order(1)
    @DisplayName("IDENTIFIER LEXICAL AUTOMATA : extract()")
    public void extract() {
        Symbol extraction = AUTOMATA.extract("id_entity_1");

        Assertions.assertNotNull(extraction);
        Assertions.assertEquals("IDENTIFIER", extraction.code);
        Assertions.assertEquals("id_entity_1", extraction.symbol);
        Assertions.assertEquals(0, extraction.start);
        Assertions.assertEquals(11, extraction.length);
        Assertions.assertEquals(10, extraction.end);

        extraction = AUTOMATA.extract("10a");
        Assertions.assertNull(extraction);

        extraction = AUTOMATA.extract("10a", 2);
        Assertions.assertEquals("IDENTIFIER", extraction.code);
        Assertions.assertEquals("a", extraction.symbol);
        Assertions.assertEquals(2, extraction.start);
        Assertions.assertEquals(1, extraction.length);
        Assertions.assertEquals(2, extraction.end);
    }

}
