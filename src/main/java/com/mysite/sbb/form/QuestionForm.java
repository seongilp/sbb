package com.mysite.sbb.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class QuestionForm {
    @NotEmpty(message = "제목은 필수항목입니다.")
    @Size(max=200)
    private String subject;
    @NotEmpty(message = "내용은 필수항목입니다.")
    private String content;
}
