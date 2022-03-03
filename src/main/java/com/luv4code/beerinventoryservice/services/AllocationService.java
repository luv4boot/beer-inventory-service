package com.luv4code.beerinventoryservice.services;

import com.lfc.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);

//    void deallocateOrder(BeerOrderDto beerOrderDto);
}