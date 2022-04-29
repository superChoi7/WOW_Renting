package com.wow.rent.service;

import com.wow.rent.entry.CustomerEntry;

public interface CustomerService {

    CustomerEntry findCustomerById(long custId);

    int addNewCustomer(String custType, String email, String phone, int addrId);

    int findCustomerByInfo(String custType, String email, String phone);

    int addIndividualCustomer(long custId, String lName, String fName, String licenseNum, String insName, String insNum);

    int addCorpCustomer(long custId, String corpName, String regNum, String empId);
}
