package com.company.builder;

public class User {

    private String firstName;
    private int age;
    private boolean isActive;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }

    private User(UserBuilder userBuilder){
        this.firstName=userBuilder.firstName;
        this.age=userBuilder.age;
        this.isActive =userBuilder.isActive;

    }

    public static class UserBuilder{
        private String firstName="NO NAME";
        private int age;
        private boolean isActive;

        public UserBuilder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public UserBuilder age(int age){
            this.age=age;
            return  this;
        }

        public UserBuilder isActive(boolean isActive){
            this.isActive =isActive;
            return this;
        }

        public User build(){
            User user=new User(this);
            return user;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
