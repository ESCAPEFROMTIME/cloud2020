package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2022- 03-02-10:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private long id;
    private String serial;



}
