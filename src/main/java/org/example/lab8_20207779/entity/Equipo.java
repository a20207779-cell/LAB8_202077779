package org.example.lab8_20207779.entity;

public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EquipoID")
    private int id;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String firstname;
    private String title;
    private String titleofcourtesy;

    private String address;
    private String city;
    private String region;
    private String postalcode;
    private String country;
    private String homephone;
    private String extension;
}
