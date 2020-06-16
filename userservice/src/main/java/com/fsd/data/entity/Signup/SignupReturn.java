package com.fsd.data.entity.Signup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SignupReturn {
//    private String token;
    private String msg;
    private String status;

}
