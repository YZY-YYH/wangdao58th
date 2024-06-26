package com.cskaoyan.th58.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer id;

    private String name;

    private String password;

    private Integer gender;

    private Integer age;

    private String school;

}
