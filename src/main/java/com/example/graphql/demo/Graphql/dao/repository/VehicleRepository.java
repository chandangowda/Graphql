package com.example.graphql.demo.Graphql.dao.repository;


import com.example.graphql.demo.Graphql.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository  extends JpaRepository<Vehicle, Integer> {

}