package com.example.restaurant.entities;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@Data
public class Booking {
    int id;
    Date date;
    String name;
    String surname;
    String telephone;
}
