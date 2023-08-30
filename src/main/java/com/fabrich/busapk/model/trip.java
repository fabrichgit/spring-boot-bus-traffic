package com.fabrich.busapk.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class trip {
    private int id;
    private int fkIdCar;
    private int fkIdReceiver;
    private String dateOfGoing;
}