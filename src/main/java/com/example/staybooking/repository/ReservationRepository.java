package com.example.staybooking.repository;

import com.example.staybooking.model.User;
import com.example.staybooking.model.Reservation;
import com.example.staybooking.model.Stay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByGuest_Username(String username);
    List<Reservation> findByStay_Id(Long stayId);
    Reservation findByIdAndGuest(Long id, User guest);
    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);

}
