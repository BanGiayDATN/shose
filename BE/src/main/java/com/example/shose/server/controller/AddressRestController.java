package com.example.shose.server.controller;

import com.example.shose.server.dto.request.address.CreateAddressRequest;
import com.example.shose.server.dto.request.address.FindAddressRequest;
import com.example.shose.server.dto.request.address.UpdateAddressRequest;
import com.example.shose.server.service.AddressService;
import com.example.shose.server.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hào Ngô
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/admin/address")
public class AddressRestController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/list")
    public ResponseObject view(@ModelAttribute final FindAddressRequest request) {
        return new ResponseObject(addressService.findAll(request));
    }

    @GetMapping("/{id}")
    public ResponseObject getOneById(@PathVariable("id") String id) {
        return new ResponseObject(addressService.getOneById(id));
    }

    @PostMapping
    public ResponseObject add(@RequestBody CreateAddressRequest request) {
        return new ResponseObject(addressService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseObject update(@PathVariable("id") String id,
                                 @RequestBody UpdateAddressRequest request) {
        request.setId(id);
        return new ResponseObject(addressService.update(request));
    }

    @DeleteMapping("/{id}")
    public ResponseObject delete(@PathVariable("id") String id) {
        return new ResponseObject(addressService.delete(id));
    }

    @GetMapping("/simple-user")
    public ResponseObject getAllSimpleEntityEmployess() {
        return new ResponseObject(addressService.getAllSimpleEntityUser());
    }

}
