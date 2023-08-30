package com.fabrich.busapk.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class car {
    private int id;
    private String identity;
    private int fkIdDriver;
    private int fkIdIdentityPlace;
}