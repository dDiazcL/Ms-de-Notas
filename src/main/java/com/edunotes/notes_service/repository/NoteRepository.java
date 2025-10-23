package com.edunotes.notes_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edunotes.notes_service.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{  
}
