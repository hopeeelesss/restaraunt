package com.example.restaurant.entities;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
@Table
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    Date date;
    String name;
    String surname;
    String telephone;
    public Booking() {}

    public Booking(Date date, String name, String surname, String telephone) {
        this.date = date;
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
    }
}
