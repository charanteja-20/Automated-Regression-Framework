package com.example.test_management_api.dtos;

import com.example.test_management_api.model.enums.TestRunStatus;
import lombok.Data;

/**
 * This DTO receives the *result* of a test run from the worker.
 */
@Data
public class TestRunUpdateDto {
    private TestRunStatus status;
    private String reportUrl;
    private String errorMessage;
    private String errorDetails;
    private Integer failedTestCount;
    private String screenshotPath;
}