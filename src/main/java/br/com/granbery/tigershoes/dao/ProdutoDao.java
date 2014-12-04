package br.com.granbery.tigershoes.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.granbery.tigershoes.model.Produto;
import br.com.granbery.tigershoes.util.JPAUtil;

public class ProdutoDao {

	
	private static ProdutoDao instance = new ProdutoDao();
	
	public static ProdutoDao getInstace() {
		return instance;
	}
	private EntityManager em = JPAUtil.getEntityManager();
	
	public boolean persistProduto(Produto produto) {
		try{
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
		}catch(Exception ex){
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
			em.close();
		return true;		
	}
	
	public Produto getById(final Long id) {
        return em.find(Produto.class, id);
    }
	
	
	@SuppressWarnings("unchecked")
	public List<Produto> listProduto(Produto Produto){
		List<Produto> produtos;
		produtos = em.createQuery("FROM" +Produto.class.getName()).getResultList(); 
		return produtos;
	}
	
	//Faz update do produto
	public void merge(Produto produto) {
        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
	
	public void remove(Produto produto) {
        try {
            em.getTransaction().begin();
            produto = em.find(Produto.class, produto.getId());
            em.remove(produto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
	public void removeById(final Long id) {
        try {
            Produto produto = getById(id);
            remove(produto);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	

}
