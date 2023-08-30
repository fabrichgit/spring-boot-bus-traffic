package com.fabrich.busapk.model;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class identityPlace {
    private int idIdentityPlace;
    private String start_place;
    private String terminus;
    private String identity;

    public static String MeaningOf(int identity){
        if(identity==1){
            return "194";
        } else if(identity==2){
            return "109";
        } else if (identity==3) {
            return "163";
        } else if(identity==4){
            return "D";
        }
        return null;
    }


    public static int ReverseMeaningOf(String meaning){
        int Identity = 0;
        if(Objects.equals(meaning, "194")){
            Identity = 1;
        } else if(Objects.equals(meaning, "109")){
            Identity = 2;
        } else if (Objects.equals(meaning, "163")) {
            Identity = 3;
        } else if(Objects.equals(meaning, "D")){
            Identity = 4;
        }
        return Identity;
    }

}
