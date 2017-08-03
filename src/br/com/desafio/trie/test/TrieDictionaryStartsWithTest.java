package br.com.desafio.trie.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import br.com.desafio.trie.TrieDictionary;

public class TrieDictionaryStartsWithTest {
	
	private TrieDictionary dict = new TrieDictionary();
	
	@Before
	public void setup() {
		dict.insert("deu");
		dict.insert("a");
		dict.insert("ab");
		dict.insert("abc");
		dict.insert("acd");
		dict.insert("desespero");
		dict.insert("despacitos");
	}
	
	@Test
	public void testStartsWithComParametroVazio() {
		assertNull(dict.startsWith(""));
		assertNull(dict.startsWith(" "));
	}
	
	@Test
	public void testStartsWithComParametroNull() {
		assertNull(dict.startsWith(null));
	}
	
	@Test
	public void testStartsWithNodeNaoEncontrado() {
		assertNull(dict.startsWith("xpto"));
		assertNull(dict.startsWith("az"));
		assertNull(dict.startsWith("azc"));
		assertNull(dict.startsWith("abd"));
		assertNull(dict.startsWith("despacitossss"));
	}
	
	@Test
	public void testStartsWithNodePorPalavraQueContemPrefixo() {
		assertNull(dict.startsWith("despacitossss"));
		assertNull(dict.startsWith("deu  certo"));
		assertNull(dict.startsWith(" deu  certo"));
	}
	
	@Test
	public void testStartsWithNodePorPalavraComEspacos() {
		assertNull(dict.startsWith("  da  bahia  "));
		assertNull(dict.startsWith("da  bahia  "));
		assertNull(dict.startsWith("  da  bahia"));
	}
	
	@Test
	public void testStartsWithNodeEncontrado() {
		assertEquals("a",dict.startsWith("a").getValue());
		assertEquals("deu",dict.startsWith("deu").getValue());
		assertEquals("ab",dict.startsWith("ab").getValue());
		assertEquals("abc",dict.startsWith("abc").getValue());
		assertEquals("acd",dict.startsWith("acd").getValue());
		assertEquals("desespero",dict.startsWith("desespero").getValue());
		assertEquals("despacitos",dict.startsWith("despacitos").getValue());
		
	}

	@Test
	public void testStartsWith() {
		//fail("Not yet implemented");
	}

}
