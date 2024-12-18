package ru.kpfu.itis.bagaviev.dto;

public class UserDto {

    private Integer id;
    private String name;
    private String lastname;
    private String gender;
    private String phone;
    private String email;
    private String avatar;

    public UserDto(String name, String lastname, String gender, String phone, String email, String avatar) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.avatar = avatar;
    }

    public UserDto(Integer id, String name, String lastname, String gender, String phone, String email, String avatar) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.avatar = avatar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
