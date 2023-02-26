package com.dvdev.report;

import com.dvdev.dto.LogFileDay;

import java.util.List;

public interface ReportGenerator {

    String generate(List<LogFileDay> logFileDays);
}
