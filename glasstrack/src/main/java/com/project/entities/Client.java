package com.project.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @Column
    public String address;

    @Column
    public String phone;

    @Column
    public String mail;

    @Column
    public int supplierId;

    public Client() {
        this.id = 0L;
        this.name = "";
        this.address = "";
        this.phone = "";
        this.mail = "";
        this.supplierId = 0;

    }

    public Client(Long id, String name, String address, String phone, String mail, int supplierId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
        this.supplierId = supplierId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public Client id(Long id) {
        setId(id);
        return this;
    }

    public Client name(String name) {
        setName(name);
        return this;
    }

    public Client address(String address) {
        setAddress(address);
        return this;
    }

    public Client phone(String phone) {
        setPhone(phone);
        return this;
    }

    public Client mail(String mail) {
        setMail(mail);
        return this;
    }

    public Client supplierId(int supplierId) {
        setSupplierId(supplierId);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", address='" + getAddress() + "'" +
                ", phone='" + getPhone() + "'" +
                ", mail='" + getMail() + "'" +
                ", supplierId='" + getSupplierId() + "'" +
                "}";
    }

}
