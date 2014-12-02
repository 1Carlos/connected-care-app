package com.fourthsource.cc.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.cc.domain.NoteEntity;
import com.fourthsource.cc.model.dao.NoteDAO;

@Service
public class NoteManagerImpl implements NoteManager {
	
	@Autowired
    private NoteDAO noteDAO;

	@Override
	@Transactional
	public Integer saveNote(NoteEntity entity) {
		return noteDAO.saveNote(entity);
	}
	
}
