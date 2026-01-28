package com.cg.evaluation;


import java.util.HashSet;
import java.util.Objects;

class Student {

        private String name;

        private int id;

        public Student(String name, int id) {

            this.name = name;

            this.id = id;

        }

        public void setName(String name) {

            this.name = name;

        }

        public void setId(int id) {

            this.id = id;

        }

        @Override

        public boolean equals(Object o) {

            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            return id == student.id && name.equals(student.name);

        }

        @Override

        public int hashCode() {

            return Objects.hashCode(id);

        }

    }


    public class MorganEvaPolimorphism {

        public static void main(String[] args) {

            HashSet<Student> students = new HashSet<>();

            Student st1=new Student("Alice", 1);

            Student st2=new Student("Bob", 2);

            Student st3=new Student("Alice", 3);

            st1.setId(2);

            students.add(st1);

            students.add(st2);

            students.add(st3);

            System.out.println("Print StudentList size  " +students.size());

        }

    }

