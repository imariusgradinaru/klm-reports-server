package com.klm.reports_server.controller;

import com.klm.reports_server.model.KlmTestReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("reports")
public class ReportController {

    private static final Logger log = LoggerFactory.getLogger(ReportController.class);

    @PostMapping
    public void addReport(@RequestBody List<KlmTestReport> executionReport) {

        log.info("Received request");

        System.out.println("executionReport = " + executionReport);
    }
}
