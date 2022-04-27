package com.io;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.io.EmployeePayrollService.IOService.FILE_IO;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1, "Jeff Bezos", 10000),
                new EmployeePayrollData(2, "Bill Gates", 20000),
                new EmployeePayrollData(3, "Mark Zuckerberg", 30000)
        };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(FILE_IO);
        employeePayrollService.printData(FILE_IO);
        long entries= employeePayrollService.countEntries(FILE_IO);
        assertEquals(3,entries);

    }
}
