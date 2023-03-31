package com.kh.app.web.form.member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class JoinForm {
  @Email
  private String email;
  @NotBlank
<<<<<<< HEAD
  @Size(min=4,max=12)
  private String passwd;
  @NotBlank
  @Size(min=4,max=12)
  private String passwdchk;

  @Size(max=10)
  private String nickname;
=======
  @Size(min = 4, max = 12)
  private String passwd;
  @NotBlank
  @Size(min = 4, max = 12)
  private String passwdchk;
  @Size(max = 10)
  private String nickname;

>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
  private String gender;
  private List<String> hobby;
  private String region;
}
<<<<<<< HEAD

=======
>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
