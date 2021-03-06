package com.klm.reports_server.repository;

import com.klm.reports_server.repository.model.SuiteResultEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReportRepository extends CrudRepository<SuiteResultEntity, Long> {

}
