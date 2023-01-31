package com.genspark.joindemo.service;

import com.genspark.joindemo.entity.Address;
import com.genspark.joindemo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    public Address createAddress(Address address){
        return addressRepository.save(address);
    }

    public List<Address> findAllAddress(){
        List<Address> addresses=addressRepository.findAll();
        return addresses;
    }

}
