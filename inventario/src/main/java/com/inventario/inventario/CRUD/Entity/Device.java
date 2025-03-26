package com.inventario.inventario.CRUD.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "devicetable")
public class Device {

/*******************************************************************/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String marca;

    private String tipo;

    private String modelo;

    private String anio;

    private int ram;

    private String hdd;

    private String gpu;



/*******************************************************************/

}
