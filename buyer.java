//package Ejercicio-1;

import java.util.Random;

public class buyer {
    private Random r = new Random();
    private String name;
    private String email;
    private int amount;
    private int balance;
    private boolean active;
    
    public buyer(){
        active = false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void attempt(locality l1, locality l2, locality l3) {
        int a = r.nextInt(1, 15001);
        int b = r.nextInt(1, 15001);
        int ticket = r.nextInt(1, 15001);
        if ((ticket <= a && ticket >= b) || (ticket >= a && ticket <= b)){
            int c = r.nextInt(1, 4);
            switch (c){
                case 1:
                if (l1.getSeats() >= this.amount && amount*l1.getPrice() <= balance){
                    l1.setSeats(l1.getSeats() - amount);
                    //l1.setBought(l1.getBought() + amount);
                }
                break;
                case 2:
                if (l2.getSeats() >= this.amount && amount*l2.getPrice() <= balance){
                    l2.setSeats(l2.getSeats() - amount);
                    //l2.setBought(l2.getBought() + amount);
                }
                break;
                case 3:
                if (l3.getSeats() >= this.amount && amount*l2.getPrice() <= balance){
                    l3.setSeats(l3.getSeats() - amount);
                    //l3.setBought(l3.getBought() + amount);
                }
                break;
                
            }
        }
        
    }
    
    
}
