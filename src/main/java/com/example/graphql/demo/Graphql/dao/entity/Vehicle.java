package com.example.graphql.demo.Graphql.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Data
@Entity
public class Vehicle implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "model_code", nullable = false)
    private String modelCode;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "launch_date")
    private LocalDate launchDate;

    private transient  String formattedDate;
    // Getter and setter
    public String getFormattedDate() {
        return getLaunchDate().toString();
    }
}
