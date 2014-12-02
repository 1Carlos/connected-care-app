package com.fourthsource.cc.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fourthsource.cc.domain.NoteEntity;

@Repository
public class NoteDAOImpl implements NoteDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public Integer saveNote(NoteEntity entity) {
		return (Integer)sessionFactory.getCurrentSession().save(entity);
	}
	
}
