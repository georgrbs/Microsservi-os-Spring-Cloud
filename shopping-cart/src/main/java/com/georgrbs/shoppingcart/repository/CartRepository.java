package com.georgrbs.shoppingcart.repository;

import com.georgrbs.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
