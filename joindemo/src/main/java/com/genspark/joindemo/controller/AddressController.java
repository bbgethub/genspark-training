package com.genspark.joindemo.controller;

import com.genspark.joindemo.entity.Address;
import com.genspark.joindemo.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address/api")
@Slf4j
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("/create")
    public Address createAddress(@RequestBody Address address){
        log.info("Inside createAddress method of AddressController");
        return addressService.createAddress(address);
    }
    @GetMapping("/all")
    public List<Address> viewAllAddresses(){
        log.info("Inside viewAllAddresses method of AddressController");
        return addressService.findAllAddress();
    }

}
