package com.home.miscellaneous;

public class StaticCount {

    public static class Employee {
        private final String name;
        private final Long id;
        private static int counter;

        public Employee(String name, Long id) {
            this.name = name;
            this.id = id;
            counter++;
        }

        public void getId(){
            counter++;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", counter=" + counter +
                    '}';
        }
    }
    public static void main(String[] args) {

        Employee employee = new Employee("a", 1L);
        Employee employee2 = new Employee("a2", 2L);

        employee2.getId();
        System.out.println(employee2);


    }
}
