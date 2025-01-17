/*
package com.ecommerce.productservice.controller;

import com.ecommerce.productservice.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cache")
public class RedisCacheController {

  @Autowired
  private RedisCacheService redisCacheService;

  @PostMapping("/addProduct")
  public String addItem(@RequestParam String key, @RequestParam String value, @RequestParam long ttl) {
    redisCacheService.addItem(key, value, ttl);
    return "Item added successfully!";
  }

  @GetMapping("/{id}")
  public String getItem(@RequestParam String key) {
    String value = redisCacheService.getItem(key);
    return value != null ? value : "Item not found!";
  }
}
*/
