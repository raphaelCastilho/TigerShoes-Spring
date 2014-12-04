package br.com.granbery.tigershoes.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.granbery.tigershoes.model.Cliente;
import br.com.granbery.tigershoes.util.JPAUtil;


public class ClienteDAO {
	
	private static ClienteDAO instance = new ClienteDAO();
	
	public static ClienteDAO getInstace() {
		return instance;
	}
	private EntityManager em = JPAUtil.getEntityManager();
	
	public boolean persistCliente(Cliente cliente) {
		try{
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		}catch(Exception ex){
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
			em.close();
		return true;		
	}
	
	public Cliente getById(final Long id) {
        return em.find(Cliente.class, id);
    }
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listClient(Object object){
		List<Cliente> clientes;
		clientes = em.createQuery("FROM" +Cliente.class.getName()).getResultList(); 
		return clientes;
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
	
	public void remove(Cliente cliente) {
        try {
            em.getTransaction().begin();
            cliente = em.find(Cliente.class, cliente.getId());
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }
	public void removeById(final Long id) {
        try {
            Cliente cliente = getById(id);
            remove(cliente);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
}
