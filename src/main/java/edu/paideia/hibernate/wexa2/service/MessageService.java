package edu.paideia.hibernate.wexa2.service;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

import edu.paideia.hibernate.wexa2.model.Message;

@Service
public class MessageService {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	@SuppressWarnings("unchecked")
	public Collection<Message> findAll(){

		Message m1 = new Message();
		m1.setText("Mensaje1");
		Message m2 = new Message();
		m2.setText("Mensaje2");
		em.persist(m1);
		int  a = 30/0;
		em.persist(m2);
		List<Message> messages = em.createQuery("SELECT m FROM Message m").getResultList();
		return Lists.newArrayList(messages);
	}
	
	public void save(Message msg){
		em.persist(msg);
	}

}
