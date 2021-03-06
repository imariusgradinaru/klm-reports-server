CREATE TABLE suite_result
(
    id INT NOT NULL IDENTITY(1,1) PRIMARY KEY
);

CREATE TABLE test_result
(
    id                INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
    suite_result_id   INT NOT NULL,
    test_name         VARCHAR(5000),
    test_path         VARCHAR(5000),
    test_status       VARCHAR(50),
    correlation_id    VARCHAR(255),
    CONSTRAINT fk_suite_result FOREIGN KEY (suite_result_id) REFERENCES suite_result (id)
);