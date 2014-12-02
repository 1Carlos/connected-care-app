package com.fourthsource.cc.model.dao;

import com.fourthsource.cc.domain.NoteEntity;

public interface NoteDAO {
	
	public Integer saveNote(NoteEntity entity);
    
}