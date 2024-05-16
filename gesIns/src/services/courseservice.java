package JAVA.gesIns.src.services;

public class courseservice {
package com.mycompany.gesIns.src.services;
import com.mycompany.gesIns.entities.Course;
import com.mycompany.gesIns.entities.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> listCourses() {
        return courses;
    }

    public List<Course> listCoursesByProfessor(Professor professor) {
        return courses.stream()
                      .filter(course -> course.getProfessor().equals(professor))
                      .collect(Collectors.toList());
    }
}
}
