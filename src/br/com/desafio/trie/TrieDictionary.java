package br.com.desafio.trie;

public class TrieDictionary implements Dictionary {
	
	private TrieNode root;

	public TrieDictionary() {
		this.root = new TrieNode();
	}
	
	public TrieNode getRoot() {
		return root;
	}

	public void setRoot(TrieNode root) {
		this.root = root;
	}
	
	/* (non-Javadoc)
	 * @see br.com.desafio.trie.Dictionary#insert(java.lang.String)
	 */
	@Override
	public void insert(String busca) {
		if (busca != null && !busca.isEmpty()) {
			root = insert(root, busca, 0);
		}
	}

	/* (non-Javadoc)
	 * @see br.com.desafio.trie.Dictionary#search(java.lang.String)
	 */
	@Override
	public String search(String busca) {
		String result = null;
		if (busca == null || busca.isEmpty()) {
			return result;
		}
		TrieNode searchResult = search(root, busca.toLowerCase(), 0);
		if (searchResult!= null) {
			result = searchResult.getValue();
		}
		return result;
		
	}
	
	/* (non-Javadoc)
	 * @see br.com.desafio.trie.Dictionary#startsWith(java.lang.String)
	 */
	@Override
	public TrieNode startsWith(String busca) {
		TrieNode searchResult = null;
		if (busca == null || busca.isEmpty()) {
			return searchResult;
		}
		searchResult = search(root, busca.toLowerCase(), 0);
		return searchResult;
	}
	/**
	 * Método interno responsável por buscar um TrieNode de acordo com a exata palavra passada como parâmetro. 
	 * Caso não seja encontrado retorna-se null.
	 * @param node
	 * @param busca
	 * @param index
	 * @return
	 */
	private TrieNode search(TrieNode node, String busca, Integer index) {
		if (node == null) {
			return null;
		}
		
		if (index == busca.length()) {
			return node;
		}
		Character searchCharAt = busca.charAt(index);
		return search(node.getNodes().get(searchCharAt), busca, index+1);
	}

	
	/**
	 * Método responsável por inserir uma palavra no Dicionário.
	 * @param node
	 * @param palavra
	 * @param index
	 * @return
	 */
	private TrieNode insert(TrieNode node, String palavra, Integer index) {
		if (node == null) {	
			node = new TrieNode();
		}
		if (index == palavra.length()){
			node.setValue(palavra.toLowerCase());
			node.setWord(Boolean.TRUE);
			return node;
		}
		
		char charKey = palavra.charAt(index);
		node.getNodes().put(charKey, insert(node.getNodes().get(charKey), palavra, index+1));
		return node;
	}

}
