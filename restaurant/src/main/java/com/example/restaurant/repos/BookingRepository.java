package com.example.restaurant.repos;

import com.example.restaurant.entities.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {
    List<Booking> findAllByDate(Date date);
}
