package com.snehil.hotelreservation;

import com.snehil.hotelreservation.data.entity.Guest;
import com.snehil.hotelreservation.data.entity.Reservation;
import com.snehil.hotelreservation.data.entity.Room;
import com.snehil.hotelreservation.data.repository.GuestRepository;
import com.snehil.hotelreservation.data.repository.ReservationRepository;
import com.snehil.hotelreservation.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HotelReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelReservationApplication.class, args);
    }

}
