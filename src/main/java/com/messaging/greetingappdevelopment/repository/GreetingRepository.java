package com.messaging.greetingappdevelopment.repository;

import com.messaging.greetingappdevelopment.model.GreetingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GreetingRepository extends JpaRepository<GreetingData,Long>
{

}