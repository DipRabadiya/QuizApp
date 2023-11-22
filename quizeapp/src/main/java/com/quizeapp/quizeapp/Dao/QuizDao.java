package com.quizeapp.quizeapp.Dao;

import com.quizeapp.quizeapp.modal.Question;
import com.quizeapp.quizeapp.modal.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
