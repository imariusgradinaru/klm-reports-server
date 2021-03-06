CREATE TABLE test_execution
(
    id INT NOT_NULL IDENTITY(1,1) PRIMARY KEY
);

CREATE TABLE test_reports
(
    id                INT NOT_NULL IDENTITY(1,1) PRIMARY KEY,
    test_execution_id INT NOT_NULL,
    test_name         VARCHAR(5000),
    test_path         VARCHAR(5000),
    test_status       VARCHAR(50),
    correlation_id    VARCHAR(255),
    CONSTRAINT fk_reports_execution FOREIGN KEY (test_execution_id) REFERENCES test_execution (id)
);