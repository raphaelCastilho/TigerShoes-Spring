package br.com.granbery.tigershoes.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.granbery.tigershoes.model.Cliente;
import br.com.granbery.tigershoes.util.JPAUtil;


public class ClienteDAO {
	
	private static ClienteDAO instance = new ClienteDAO();
	
	public static ClienteDAO getInstace() {
		return instance;
	}
	
	public boolean persistCliente(Object object) {
		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Cliente cliente = (Cliente) object;
		
		tx.begin();
		em.persist(cliente);
		tx.commit();
		
		em.close();
		return true;		
	}
}
