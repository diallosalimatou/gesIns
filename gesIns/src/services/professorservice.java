package  com.mycompany.gesIns.services.ProfessorService;

public class professorservice {
    package com.mycompany.gesIns.services;

import com.mycompany.gesIns.entities.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {
    private List<Professor> professors = new ArrayList<>();

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public List<Professor> listProfessors() {
        return professors;
    }
}

}
