package com.luv4code.beerinventoryservice.web.mappers;

import com.luv4code.beerinventoryservice.domain.BeerInventory;
import com.luv4code.beerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}