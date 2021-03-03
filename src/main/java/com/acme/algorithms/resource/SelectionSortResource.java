package com.acme.algorithms.resource;

import com.acme.algorithms.resource.request.CarSortRequest;
import com.acme.algorithms.resource.response.CarSortResponse;
import com.acme.algorithms.service.SelectionSortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "selection")
public class SelectionSortResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(SelectionSortResource.class);

    @Autowired
    private SelectionSortService selectionSortService;

    @PostMapping(path = "sort")
    public CarSortResponse sort (@RequestBody CarSortRequest request) {
        LOGGER.info("m=sort request: {}", request);
        return selectionSortService.sort(request);
    }
}
