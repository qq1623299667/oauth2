package com.example.dto;

import com.example.validator.MyConstraint;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Past;
import java.util.Date;

@Setter
public class User {
    private String id;
    @MyConstraint
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
    @Past(message = "生日必须是过去的时间")
    private Date birthDay;
    public interface UserSimpleView{};
    public interface UserDetailView extends UserSimpleView{};

    @JsonView(UserDetailView.class)
    public String getPassword() {
        return password;
    }

    @JsonView(UserSimpleView.class)
    public String getId() {
        return id;
    }

    @JsonView(UserSimpleView.class)
    public Date getBirthDay() {
        return birthDay;
    }

    @JsonView(UserSimpleView.class)
    public String getUsername() {
        return username;
    }
}
