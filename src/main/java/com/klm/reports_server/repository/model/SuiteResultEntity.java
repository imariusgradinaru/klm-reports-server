package com.klm.reports_server.repository.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "suite_result")
public class SuiteResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "suite_result_id")
    public List<TestResultEntity> testResults = new ArrayList<>();
}
