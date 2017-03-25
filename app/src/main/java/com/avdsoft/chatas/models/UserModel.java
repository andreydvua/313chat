package com.avdsoft.chatas.models;

import java.util.Date;

/**
 * Created by AVDSOFT on 25.03.2017;
 * project - ChatAS;
 */

public class UserModel {
    private int id;
    private String name;
    private String email;
    private String pass;
    private Date birthday;

    private String description;
    private String photo_profile;
    private boolean gender;

    public UserModel(int id, String name, String email, String pass, Date birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.birthday = birthday;
    }

    public UserModel(int id, String name, String email, String pass, Date birthday, String description, String photo_profile, boolean gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.birthday = birthday;
        this.description = description;
        this.photo_profile = photo_profile;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto_profile(String photo_profile) {
        this.photo_profile = photo_profile;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoto_profile() {
        return photo_profile;
    }

    public boolean isGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserModel userModel = (UserModel) o;

        if (id != userModel.id) return false;
        if (gender != userModel.gender) return false;
        if (!name.equals(userModel.name)) return false;
        if (!email.equals(userModel.email)) return false;
        if (!pass.equals(userModel.pass)) return false;
        if (birthday != null ? !birthday.equals(userModel.birthday) : userModel.birthday != null)
            return false;
        if (description != null ? !description.equals(userModel.description) : userModel.description != null)
            return false;
        return photo_profile != null ? photo_profile.equals(userModel.photo_profile) : userModel.photo_profile == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + pass.hashCode();
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (photo_profile != null ? photo_profile.hashCode() : 0);
        result = 31 * result + (gender ? 1 : 0);
        return result;
    }
}
