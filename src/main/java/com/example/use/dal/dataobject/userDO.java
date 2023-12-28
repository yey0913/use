package com.example.use.dal.dataobject;

import lombok.*;

/**
 * @author yey
 * @date 2023/12/28 11:56
 */
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
class userDO {

    private Long id;

    private String name;

    private Long age;

    private String sex;
}



