package com.turkcell.rentACar.entities.dtos.get;

import com.turkcell.rentACar.entities.dtos.list.CustomerListDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCardInfoDto {

    private String cardHolder;
    private String cardNumber;
    private int cvv;
    private int expirationMonth;
    private int expirationYear;
    private CustomerListDto customerListDto;
}
