package com.genspark.joindemo.controller;

import com.genspark.joindemo.entity.Address;
import com.genspark.joindemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address/api")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("/create")
    public Address createAddress(@RequestBody Address address){
      return addressService.createAddress(address);
    }
    @GetMapping("/all")
    public List<Address> viewAllAddresses(){
        return addressService.findAllAddress();
    }

}
