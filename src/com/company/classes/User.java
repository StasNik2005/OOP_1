package com.company.classes;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class User {
    private String name;
    private String login;
    private String password;
    private Date birthday;
    private int height;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        System.out.println((new Date().getMonth()));
        System.out.println((birthday.getMonth()));
        if (birthday.getYear()<=(new Date().getYear())&& (birthday.getMonth()<=(new Date().getMonth()))&&(birthday.getDay()<=(new Date().getDay())))
            this.birthday = birthday;
        else
            this.birthday = new Date();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 30 && height <= 272){
            this.height = height;
        }
        else{
            this.height = -1;
        }
    }

    public void setName(String name)
    {
        if(Character.isUpperCase(name.charAt(0))){
            this.name = name;
        }
        else{
            System.out.println("Incorrect name");
        }

    }
    public String getName(){
        return this.name;
    }

    public void setLogin(String login){
        if(login.length()>0){
            this.login = login;
        }
        else{
            System.out.println("Incorrect login");
        }
    }
    public String getLogin(){
        return this.login;
    }
    public void setPassword(String password){
        if(password.length()>=8){
            this.password = password;
        }
        else {
            System.out.println("Incorrect password.Try again!");
        }
    }
    public String getPassword(){
        return this.password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday.toLocaleString() +
                ", height=" + height +
                '}';
    }

    public void generatePassword(int length)
    {
        Random random = new Random();
        char[] password=new char[length];
        Arrays.fill(password,' ');
        for(int i = 0;i <= 100;i++){
            password[random.nextInt(password.length)] = ((char)(random.nextInt(27)+65));
            password[random.nextInt(password.length)] = ((char)(random.nextInt(27)+97));
            password[random.nextInt(password.length)] = ((char)(random.nextInt(11)+48));
            password[random.nextInt(password.length)] = ((char)(random.nextInt(15)+33));
            password[random.nextInt(password.length)] = ((char)(random.nextInt(7)+58));
            password[random.nextInt(password.length)] = ((char)(random.nextInt(6)+91));
            password[random.nextInt(password.length)] = ((char)(random.nextInt(5)+123));
        }

        String str ="";
        for (char c: password) {
            str+=c;
        }
        this.setPassword(str);
    }
}
