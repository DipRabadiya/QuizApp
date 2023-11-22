package com.quizeapp.quizeapp.modal;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questions;
}
