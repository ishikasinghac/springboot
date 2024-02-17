package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
//adding service layer
    CloudVendorService cloudVendorService;
//constructor
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

//    read specific cloud vendor details
        @GetMapping("{vendorId}")
        public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
        }
// read all cloud vendor details
        @GetMapping()
        public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendors();
        }
        @PostMapping
        public String createCloudVendor(@RequestBody CloudVendor  cloudVendor){
                cloudVendorService.createCloudVendor(cloudVendor);
                return "cloud vendor created successfully";
        }

        @PutMapping
        public String updateCloudVendor(@RequestBody CloudVendor  cloudVendor){
            cloudVendorService.updateCloudVendor(cloudVendor);
            return "cloud vendor updated successfully";
        }

        @DeleteMapping("{vendorId}")
        public String deleteCloudVendor(@PathVariable String vendorId){
            cloudVendorService.deleteCloudVendor(vendorId);
            return "cloud vendor deleted successfully";
        }
}
