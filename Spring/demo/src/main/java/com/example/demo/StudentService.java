package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class StudentService {
    private final Map<Integer, Student> students = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public List<Student> getAll() {
        return new ArrayList<>(students.values());
    }

    public Student getById(int id) {
        return students.get(id);
    }

    public Student create(Student student) {
        int id = idCounter.getAndIncrement();
        Student newStudent = new Student(id, student.getFirstName(), student.getLastName());
        students.put(id, newStudent);
        return newStudent;
    }

    public Student update(int id, Student student) {
        if (!students.containsKey(id))
            return null;
        Student updated = new Student(id, student.getFirstName(), student.getLastName());
        students.put(id, updated);
        return updated;
    }

    public boolean delete(int id) {
        return students.remove(id) != null;
    }
}