package com.genspark.joindemo.service;

import com.genspark.joindemo.entity.Address;
import com.genspark.joindemo.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    public Address createAddress(Address address){
        log.info("Inside createAddress method of AddressService");
        return addressRepository.save(address);
    }

    public List<Address> findAllAddress(){
        log.info("Inside findAllAddress method of AddressService");
        List<Address> addresses=addressRepository.findAll();
        return addresses;
    }

}
