package com.Shops.shop.services;

import com.Shops.shop.dto.ShopDto;

public interface ShopService {
    ShopDto saveshop(ShopDto shopDto);
    ShopDto getshop(Long id);
    ShopDto updateshop(Long id,ShopDto shopDto);
}
