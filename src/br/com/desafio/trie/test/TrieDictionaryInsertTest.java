package br.com.desafio.trie.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.desafio.trie.TrieDictionary;

public class TrieDictionaryInsertTest {
	
	private TrieDictionary dict = new TrieDictionary();
	
	@Before
	public void setup() {
		dict = new TrieDictionary();
	}
	
	@Test
	public void testInsertAndSearch() {
		String busca = "desafio";
		dict.insert(busca);
		assertEquals(busca, dict.search(busca));
	}

}
