package com.example.backendObjective.Entity;

import java.util.List;

public class ResponseData {

    private boolean isSuccess;
    private String userId;
    private String collegeEmailId;
    private String collegeRollNumber;
    private List<Integer> numbers;
    private List<String> alphabets;
    private String highestLowerCaseAlphabet;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCollegeEmailId() {
        return collegeEmailId;
    }

    public void setCollegeEmailId(String collegeEmailId) {
        this.collegeEmailId = collegeEmailId;
    }

    public String getCollegeRollNumber() {
        return collegeRollNumber;
    }

    public void setCollegeRollNumber(String collegeRollNumber) {
        this.collegeRollNumber = collegeRollNumber;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public String getHighestLowerCaseAlphabet() {
        return highestLowerCaseAlphabet;
    }

    public void setHighestLowerCaseAlphabet(String highestLowerCaseAlphabet) {
        this.highestLowerCaseAlphabet = highestLowerCaseAlphabet;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
