package com.dtlim.threejointest.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_tables")
@Data
public class RestaurantTable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "table_number")
    private String tableNumber;

    @Column(name = "capacity")
    private int capacity;
}
