package br.com.desafio.trie.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TrieDictionarySearchTest.class , TrieDictionaryInsertTest.class, TrieDictionaryStartsWithTest.class})
public class AllTests {

	public static void setup() {
	}

	
}
