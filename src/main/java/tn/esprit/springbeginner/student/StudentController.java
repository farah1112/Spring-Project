package tn.esprit.springbeginner.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<String> FindAllStudents (){
     return  List.of(
             "Farah",
             "hello sarange"
     );
    }
}
