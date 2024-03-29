package br.com.granbery.tigershoes.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.granbery.tigershoes.model.Cliente;
import br.com.granbery.tigershoes.model.Item;
import br.com.granbery.tigershoes.util.JPAUtil;

public class ItemDAO {


	
	private static ItemDAO instance = new ItemDAO();
	
	public static ItemDAO getInstace() {
		return instance;
	}
	private EntityManager em = JPAUtil.getEntityManager();
	
	public boolean persistProduto(Item item) {
		try{
			em.getTransaction().begin();
			em.persist(item);
			em.getTransaction().commit();
		}catch(Exception ex){
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
			em.close();
		return true;		
	}
	
	public Item getById(final Long id) {
        return em.find(Item.class, id);
    }
	
	
	@SuppressWarnings("unchecked")
	public List<Item> listItem(Item item){
		List<Item> itens;
		itens = em.createQuery("FROM" +Cliente.class.getName()).getResultList(); 
		return itens;
	}
	
	//Faz update do cliente
	public void merge(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
	
	public void remove(Item item) {
        try {
            em.getTransaction().begin();
            item = em.find(Item.class, item.getId());
            em.remove(item);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
	public void removeById(final Long id) {
        try {
            Item item = getById(id);
            remove(item);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
