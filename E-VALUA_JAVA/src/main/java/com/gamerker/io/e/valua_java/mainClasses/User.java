/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamerker.io.e.valua_java.mainClasses;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class User {
    private String username;
    private List<Result> testsHistory;
    
    public User(String username, String email) {
        this.username = username;
        this.testsHistory = new ArrayList<>();
    }
    
    public void addExamResult(Result result) {
        testsHistory.add(result);
    }
    
    public double getAverageScore() {
        if (testsHistory.isEmpty()) return 0.0;
        
        double total = 0;
        for (Result result : testsHistory) {
            total += result.getPercentage();
        }
        return total / testsHistory.size();
    }
    
    public int getExamsTaken() {
        return testsHistory.size();
    }
    
    // Getters
    public String getUsername() { return username; }
    public List<Result> getExamHistory() { return new ArrayList<>(testsHistory); }
    public String getInfo() {
        return "Usuario{username='" + username + "', examsTaken=" + testsHistory.size() + "}";
    }
    
    // Setters
    public void setUsername(String username) { this.username = username; }
}