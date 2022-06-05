package com.dmdev.homework.week5.studentsStreams;

import java.util.List;
import java.util.Map;

public class Statistic {

    private List<StudentBasic> studentsBasic;
    private double averageGrade;

    public Statistic(List<StudentBasic> studentsBasic, double averageGrade) {
        this.studentsBasic = studentsBasic;
        this.averageGrade = averageGrade;
    }

    public Statistic(Map<Year, List<StudentBasic>> studentBasicInfo, Map<Year, Double> gradesByYear) {
    }

    public List<StudentBasic> getStudentsBasic() {
        return studentsBasic;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
