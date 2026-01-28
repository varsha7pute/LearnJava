package com.cg.evaluation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E3FindEmpCountInEachDept {
    public record EmpDeptInfo(String empName, String deptName ){}

    public static void main(String[] args) {
        List<EmpDeptInfo> empDeptInfoList = Arrays.asList(
                new EmpDeptInfo("aabc", "IT"),
                new EmpDeptInfo("pqr", "HR"),
                new EmpDeptInfo("xyz", "HR"),
                new EmpDeptInfo("lmn", "IT"),
                new EmpDeptInfo("Opq", "Mgmt")
        ) ;

       Map<String, Long> empCountInEachDept = empDeptInfoList.stream()
               .collect(Collectors.groupingBy(EmpDeptInfo::deptName, Collectors.counting()));
        System.out.println("Emp count in each department "+ empCountInEachDept);
    }
}
