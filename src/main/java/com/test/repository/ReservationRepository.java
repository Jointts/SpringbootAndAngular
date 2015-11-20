package com.test.repository;

import com.test.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by joona_000 on 18.11.2015.
 */

@RepositoryRestResource(collectionResourceRel = "reservation", path = "/reservation")
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
