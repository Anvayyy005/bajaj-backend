package com.example.backendObjective.Controller;

import com.example.backendObjective.Entity.RequestData;
import com.example.backendObjective.Entity.ResponseData;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


class WebConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**").allowedOrigins("http:localhost:3000");
    }
}

@RestController
@RequestMapping("/bfhl")
public class APIController {
    @GetMapping
    public String getOperationCode(){
        return "{\"operation_code\":\"operation_code1\"}";
    }

    @PostMapping
    public ResponseData processData(@RequestBody RequestData requestData){
        ResponseData responseData = new ResponseData();
        List<String> data = requestData.getData();

        List<Integer> numbers = data.stream().filter(s -> s.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> alphabets = data.stream().filter(s -> s.matches("[a-zA-Z]+")).collect(Collectors.toList());

        String highestLowerCase = alphabets.stream().filter(s -> s.matches("[a-z]")).max(String::compareTo).orElse(null);
        responseData.setIsSuccess(true);

        responseData.setUserId("john_doe_17091999");
        responseData.setCollegeEmailId("john@xyz.com");
        responseData.setCollegeRollNumber("ABCD123");
        responseData.setNumbers(numbers);
        responseData.setAlphabets(alphabets);
        responseData.setHighestLowerCaseAlphabet(highestLowerCase);

        return responseData;
    }

}
