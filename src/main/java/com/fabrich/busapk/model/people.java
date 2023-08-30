package com.fabrich.busapk.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class people {
    private int id;
    private String firstname;
    private String lastname;
    private int age;
}
