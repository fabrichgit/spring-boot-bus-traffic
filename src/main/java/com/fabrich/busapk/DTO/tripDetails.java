package com.fabrich.busapk.DTO;

import com.fabrich.busapk.model.receiver;
import com.fabrich.busapk.model.driver;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class tripDetails {
    private driver driver;
    private receiver receiver;
    private String date;
    private String identity;
}
