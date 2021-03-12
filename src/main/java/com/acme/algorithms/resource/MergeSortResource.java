package com.acme.algorithms.resource;

import com.acme.algorithms.resource.request.CarSortRequest;
import com.acme.algorithms.resource.response.CarSortResponse;
import com.acme.algorithms.service.MergeSortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "merge")
public class MergeSortResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(MergeSortResource.class);

    @Autowired
    private MergeSortService mergeSortService;

    @PostMapping(path = "sort")
    public CarSortResponse sort(@RequestBody CarSortRequest request) {
        LOGGER.info("m=sort request: {}", request);
        return mergeSortService.sort(request);
    }
}
