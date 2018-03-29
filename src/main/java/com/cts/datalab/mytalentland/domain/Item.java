package com.cts.datalab.mytalentland.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {

    private static final long serialVersionUID = 5966526271825449518L;

    private String name;

    private String description;

    private Category category;

    private boolean visible;

    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return visible == item.visible &&
                Objects.equals(name, item.name) &&
                Objects.equals(description, item.description) &&
                category == item.category &&
                Objects.equals(owner, item.owner);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, description, category, visible, owner);
    }
}
