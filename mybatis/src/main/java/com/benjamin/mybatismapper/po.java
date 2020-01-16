package com.benjamin.mybatismapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * @ClassName po
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/1/9
 **/
@Data
@Table(name = "test")
@AllArgsConstructor
@NoArgsConstructor
public class po {

    private Integer id;

    private String name;

    private Integer age;
}
