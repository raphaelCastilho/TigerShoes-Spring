package br.com.granbery.tigershoes.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProdutoItem {

	@Id
	private int id;
	
	@OneToMany (cascade = CascadeType.ALL)
	private Set<Produto> produtos;
	
	@OneToMany (cascade = CascadeType.ALL)
	private Set<Item> itens;
	
}
