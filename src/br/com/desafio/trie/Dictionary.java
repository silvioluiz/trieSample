package br.com.desafio.trie;

import java.util.Collection;

public interface Dictionary {

	/**
	 * Método que busca pela exata ocorrência de uma palavra.
	 * @param palavra
	 * @return Null se a palavra não existir na árvore, ou a própria palavra caso ela exista.
	 */
	String search(String palavra);

	/**
	 * Método que busca o nó que contém o prefixo passado como parâmetro.
	 * @param palavra
	 * @return Null se o prefixo não existir, ou o nó que possui os nós filhos relacionados.
	 */
	TrieNode startsWith(String palavra);

	
	/**
	 * Método que insere uma nova palavra no dicionário.
	 * @param palavra
	 */
	void insert(String palavra);
	
	//TODO Pendente de implementação
	default Collection<String> getWords(TrieNode node, Collection<String> words){
		return null;
	}

}