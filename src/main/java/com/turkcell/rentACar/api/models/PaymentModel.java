package com.turkcell.rentACar.api.models;

import com.turkcell.rentACar.entities.requests.create.CreateCardInfoRequest;
import com.turkcell.rentACar.entities.requests.create.CreateRentalRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentModel {

    @Valid
    private CreateRentalRequest createRentalRequest;

    @Valid
    private CreateCardInfoRequest createCardInfoRequest;

    @NotNull
    @Min(0)
    @Max(1)
    private int saveIt;
}
