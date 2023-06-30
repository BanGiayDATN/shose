package com.example.shose.server.service;

import com.example.shose.server.request.bill.BillRequest;
import com.example.shose.server.response.BillResponse;

import java.util.List;

/**
 * @author thangdt
 */
public interface BillService {

    List<BillResponse> getAll(BillRequest request);

}