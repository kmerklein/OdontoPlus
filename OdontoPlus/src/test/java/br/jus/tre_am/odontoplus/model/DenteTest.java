package br.jus.tre_am.odontoplus.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DenteTest {

	@Test public void testSomeLibraryMethod() {
        Dente dente = new Dente();
        dente.setTxDente("molar");
        assertTrue("dente é ", dente.getTxDente()!=null);
    }
}
