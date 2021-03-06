package com.klm.reports_server.service;

import com.klm.reports_server.model.KlmTestReport;
import com.klm.reports_server.repository.ReportRepository;
import com.klm.reports_server.repository.model.SuiteResultEntity;
import com.klm.reports_server.repository.model.TestResultEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReportService {

    private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public void saveReport(List<KlmTestReport> executionReport) {
        SuiteResultEntity suiteResultEntity = new SuiteResultEntity();

        for (KlmTestReport klmTestReport : executionReport) {
            TestResultEntity testResultEntity = new TestResultEntity();
            testResultEntity.testName = klmTestReport.testName;
            testResultEntity.testPath = klmTestReport.testPath;
            testResultEntity.testStatus = klmTestReport.testStatus.name();
            testResultEntity.correlationId = klmTestReport.correlationId;

            suiteResultEntity.testResults.add(
                    testResultEntity
            );
        }

        reportRepository.save(suiteResultEntity);
    }
}
