package br.com.granbery.tigershoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id @GeneratedValue
	private int id;
	
	@ManyToOne
	private ProdutoItem produtoItem;
	
	private int quantidade;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProdutoItem getProdutoItem() {
		return produtoItem;
	}

	public void setProdutoItem(ProdutoItem produtoItem) {
		this.produtoItem = produtoItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
