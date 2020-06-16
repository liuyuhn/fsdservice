package com.fsd.data.entity.ChangePw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChangePwEntity {
        private String userName;
        private String passWord;
}
