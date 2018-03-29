package com.cts.datalab.mytalentland.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Document(collection = "users")
public class TradeUser implements Serializable {

    private static final long serialVersionUID = -1871469790957140239L;

    @Id
    private Long id;

    private String name;

    private String userName;

    private String email;

    private String phone;

    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradeUser tradeUser = (TradeUser) o;
        return Objects.equals(id, tradeUser.id) &&
                Objects.equals(name, tradeUser.name) &&
                Objects.equals(userName, tradeUser.userName) &&
                Objects.equals(email, tradeUser.email) &&
                Objects.equals(phone, tradeUser.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, userName, email, phone);
    }

    @Override
    public String toString() {
        return "TradeUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
