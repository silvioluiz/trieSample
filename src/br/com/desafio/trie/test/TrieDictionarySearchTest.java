package br.com.desafio.trie.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import br.com.desafio.trie.TrieDictionary;

public class TrieDictionarySearchTest {
	
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
	public void testSearchComParametroVazio() {
		assertNull(dict.search(""));
		assertNull(dict.search(" "));
	}
	
	@Test
	public void testSearchComParametroNull() {
		assertNull(dict.search(null));
	}
	
	@Test
	public void testSearchNodeNaoEncontrado() {
		assertNull(dict.search("xpto"));
		assertNull(dict.search("az"));
		assertNull(dict.search("azc"));
		assertNull(dict.search("abd"));
		assertNull(dict.search("despacitossss"));
	}
	
	@Test
	public void testSearchNodePorPalavraQueContemPrefixo() {
		assertNull(dict.search("despacitossss"));
		assertNull(dict.search("deu  certo"));
		assertNull(dict.search(" deu  certo"));
	}
	
	@Test
	public void testSearchNodePorPalavraComEspacos() {
		assertNull(dict.search("  da  bahia  "));
		assertNull(dict.search("da  bahia  "));
		assertNull(dict.search("  da  bahia"));
	}
	
	@Test
	public void testSearchNodeEncontrado() {
		assertEquals("a",dict.search("a"));
		assertEquals("deu",dict.search("deu"));
		assertEquals("ab",dict.search("ab"));
		assertEquals("abc",dict.search("abc"));
		assertEquals("acd",dict.search("acd"));
		assertEquals("desespero",dict.search("desespero"));
		assertEquals("despacitos",dict.search("despacitos"));
		
	}

}
