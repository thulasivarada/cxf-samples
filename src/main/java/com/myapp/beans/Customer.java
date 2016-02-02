package com.myapp.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by chida on 2/2/16.
 */
@XmlRootElement(name = "customer")
public class Customer {
    private String id;
    private String name;
    private String gender;
    private String occupation;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
