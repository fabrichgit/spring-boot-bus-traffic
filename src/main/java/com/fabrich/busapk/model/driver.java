package com.fabrich.busapk.model;

import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class driver {
    private int id;
    private String firstname;
    private String lastname;
    private int age;
}