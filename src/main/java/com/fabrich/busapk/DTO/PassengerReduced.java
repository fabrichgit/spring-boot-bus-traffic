package com.fabrich.busapk.DTO;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PassengerReduced {
    private int fkIdPeople;
    private int fkIdTrip;
}

