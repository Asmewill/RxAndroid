package com.rx.cn.rxandroid.Utils;

import com.rx.cn.rxandroid.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jian.shui on 2019/1/4
 */
public class DataUtils {
    public static List<Student> getStudentList(){
        List<Student> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            Student student=new Student();
            student.setName("00_"+i);
            List<String> couses=new ArrayList<>();
            for(int j=0;j<5;j++){
                couses.add("Couse_English_"+j);
            }
            student.setCourses(couses);
            list.add(student);
        }
        return  list;
    }
}
