package org.example.OOPTraining.AnimalOOPDemo;

import java.util.List;

public class Animal implements AnimalBehaviour {
    private Integer id;
    private String type;
    private List<String> foodItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id > 0) {
            this.id = id;
        } else {
            IO.println("Invalid Id");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<String> foodItems) {
        this.foodItems = foodItems;
    }

    @Override
    public void eat() {
        IO.println(this.type + " Eats");
    }

    @Override
    public void sleep() {
        IO.println(this.type + " Sleeps");
    }

    @Override
    public void run() {
        IO.println(this.type + " Runs");

    }

    @Override
    public void makeSound() {
        IO.println(this.type + " Sounds ");

    }

    @Override
    public void printAllValue() {
        IO.println("Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", foodItems=" + foodItems +
                '}');
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", foodItems=" + foodItems +
                '}';
    }
}
