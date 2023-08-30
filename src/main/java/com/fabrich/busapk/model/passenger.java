package com.fabrich.busapk.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class passenger {
    private int id;
    private int fkIdPeople;
    private int fkIdTrip;
}
