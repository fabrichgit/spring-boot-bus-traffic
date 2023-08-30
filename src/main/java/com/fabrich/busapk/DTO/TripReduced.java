package com.fabrich.busapk.DTO;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class TripReduced {
    private int fkIdCar;
    private int fkIdReceiver;
}
