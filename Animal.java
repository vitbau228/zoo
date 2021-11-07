/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public abstract class Animal {
    private String name;
    private int age;
    private String description;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void display() {
        System.out.println(this.toString());
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten con vat");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi cua con vat");
        this.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap mo ta cua con vat");
        this.setDescription(sc.nextLine());
    }
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", description=" + description + '}';
    }
    
    public abstract void sound();
    
    
}
