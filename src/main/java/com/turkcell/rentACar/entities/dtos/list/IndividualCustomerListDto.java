package com.turkcell.rentACar.entities.dtos.list;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndividualCustomerListDto {

    private int userId;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
}
