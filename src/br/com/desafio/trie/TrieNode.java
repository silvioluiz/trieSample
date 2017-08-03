package br.com.desafio.trie;

import java.util.HashMap;

/**
 * Classe que representa a estrutura de uma árvore Trie.
 * @author silvio
 */
public class TrieNode {
	
	/**
	 * Valor armazenado no nó caso o mesmo represente uma palavra. 
	 */
	private String value; 
	
	/**
	 * Mapa de nós filhos do corrente nó. 
	 */
	private HashMap<Character, TrieNode> nodes;
	
	/**
	 * Verificação usada para determinar se um nó representa ou não uma palavra. 
	 */
	private Boolean word;
	
	public TrieNode() {
		super();
		this.nodes = new HashMap<Character,TrieNode>();
		this.word= Boolean.FALSE;
		this.value = null;
	}

	public HashMap<Character, TrieNode> getNodes() {
		return nodes;
	}

	public void setNodes(HashMap<Character, TrieNode> nodes) {
		this.nodes = nodes;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String palavra) {
		this.value = palavra;
	}

	public Boolean isWord() {
		return word;
	}

	public void setWord(Boolean word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "TrieNode [palavra=" + value + "]";//+", nodes=" + nodes.values() + ", isWord?" + word + "]\n";
	}
	
	
	
}
