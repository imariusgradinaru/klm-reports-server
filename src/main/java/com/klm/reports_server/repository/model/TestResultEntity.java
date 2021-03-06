package com.klm.reports_server.repository.model;

import com.klm.reports_server.model.ExecutionStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "test_result")
public class TestResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name="suite_result_id", nullable=false)
    public SuiteResultEntity suiteResultEntity;

    @Column
    public String testName;

    @Column
    public String testPath;

    @Column
    public String testStatus;

    @Column
    public String correlationId;
}
