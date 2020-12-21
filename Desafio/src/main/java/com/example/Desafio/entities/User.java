package com.example.Desafio.entities;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

//    @ApiModelProperty(notes = "Id of the User",name="id",required=true,value="test id")
//    @Id
//    @GeneratedValue(generator="system-uuid")
//    @GenericGenerator(name="system-uuid", strategy = "uuid")
//    private String  id;
    @Id
    @GeneratedValue
    private Integer id;

    @ApiModelProperty(notes = "Username of the User",name="username ",required=true,value="test name")
    private String username ;

    @ApiModelProperty(notes = "password of the User",name="password ",required=true,value="test password")
    private String password;

    @ApiModelProperty(notes = "If user isEnable",name="isEnable ",required=true,value="true")
    private boolean isEnable;

    @ApiModelProperty(notes = "Register date of user",name="registerDate ",required=true,value="23/11/2015")
    private Date registerDate;

    @ApiModelProperty(notes = "Name of user",name="name ",required=true,value="test user")
    private String name;

    @ApiModelProperty(notes = "Surname of user",name="surname ",required=true,value="test surname")
    private String surname;

    @ApiModelProperty(notes = "Email of the User",name="email",required=true,value="test email")
    private String email;

    @ApiModelProperty(notes = "Phone of user",name="phone ",required=true,value="(31)912345678")
    private String phone;

    public User(){ }

    public void setId(Integer value) {
        this.id = value;
    }
    public Integer getId() {
        return id;
    }

    @Column(name="userName")
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){this.username = username;}

    @Column(name="password")
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){this.password = password;}

    @Column(name="isEnable", nullable = false)
    public boolean getIsEnable(){
        return isEnable;
    }
    public void setIsEnable(boolean isEnable){
        this.isEnable = isEnable;
    }

    @Column(name="registerDate")
    public Date getRegisterDate(){
        return this.registerDate;
    }

    public void setRegisterDate(Date registerDate){
        this.registerDate = registerDate;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="surName")
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
