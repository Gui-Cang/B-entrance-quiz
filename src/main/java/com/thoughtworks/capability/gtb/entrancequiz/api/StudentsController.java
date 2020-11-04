package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODO GTB-完成度: - 只实现了查询学员和创建学员的 API
//TODO GTB-综合: * 整体实现很少，不能给出更多有效 comments
@RestController
public class StudentsController {
    //TODO GTB-工程实践: - 没有提取 service
    private List<Student> studentList = initStudents();

    private List<Student> initStudents() {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("成吉思汗", 1));
        studentsList.add(new Student("鲁班七号", 2));
        studentsList.add(new Student("太乙真人", 3));
        studentsList.add(new Student("钟无艳", 4));
        studentsList.add(new Student("花木兰", 5));
        studentsList.add(new Student("雅典娜", 6));
        studentsList.add(new Student("芈月", 7));
        studentsList.add(new Student("白起", 8));
        studentsList.add(new Student("刘禅", 9));
        studentsList.add(new Student("庄周", 10));
        studentsList.add(new Student("马超", 11));
        studentsList.add(new Student("刘备", 12));
        studentsList.add(new Student("哪吒", 13));
        studentsList.add(new Student("大乔", 14));
        studentsList.add(new Student("蔡文姬", 15));
        return studentsList;
    }

    @GetMapping("/students")
    public List<Student> getStudentsList() {
        Collections.shuffle(studentList);
        return studentList;
    }

    @PostMapping("/students/add")
    public List<Student> addStudent(@RequestBody Student student) {
        //TODO GTB-完成度: - 学员 id 不应由前端（客户端）决定
        studentList.add(new Student(student.getName(), student.getNumber()));
        return studentList;
    }

}
