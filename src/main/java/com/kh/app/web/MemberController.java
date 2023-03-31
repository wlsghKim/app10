package com.kh.app.web;

<<<<<<< HEAD
import com.kh.app.domain.common.util.CommonCode;
import com.kh.app.domain.entity.Code;
=======
>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
import com.kh.app.domain.entity.Member;
import com.kh.app.domain.member.svc.MemberSVC;
import com.kh.app.web.common.CodeDecode;
import com.kh.app.web.form.member.JoinForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

  private final MemberSVC memberSVC;
<<<<<<< HEAD
  private final CommonCode commonCode;
=======
>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862

  @ModelAttribute("hobbies")
  public List<CodeDecode> hobbies(){
    List<CodeDecode> codes = new ArrayList<>();
<<<<<<< HEAD
//    codes.add(new CodeDecode("독서","독서"));
//    codes.add(new CodeDecode("수영","수영"));
//    codes.add(new CodeDecode("등산","등산"));
//    codes.add(new CodeDecode("골프","골프"));
    List<Code> findedCodes = commonCode.findCodesByPcodeId("A01");
    //case1)
    //  findedCodes.stream()
    //    .forEach(ele->codes.add(new CodeDecode(ele.getCodeId(),ele.getDecode())));
    //case2)
    for(Code code : findedCodes){
      codes.add(new CodeDecode(code.getCodeId(),code.getDecode()));
    }
=======
    codes.add(new CodeDecode("독서", "독서"));
    codes.add(new CodeDecode("수영", "수영"));
    codes.add(new CodeDecode("등산", "등산"));
    codes.add(new CodeDecode("골프", "골프"));
>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
    return codes;
  }

  @ModelAttribute("regions")
  public List<CodeDecode> regions(){
    List<CodeDecode> codes = new ArrayList<>();
<<<<<<< HEAD
//    codes.add(new CodeDecode("서울","서울"));
//    codes.add(new CodeDecode("부산","부산"));
//    codes.add(new CodeDecode("대구","대구"));
//    codes.add(new CodeDecode("울산","울산"));

    List<Code> findedCodes = commonCode.findCodesByPcodeId("A02");
    findedCodes.stream()
        .forEach(ele->codes.add(new CodeDecode(ele.getCodeId(),ele.getDecode())));
    return codes;
  }



=======
    codes.add(new CodeDecode("서울", "서울"));
    codes.add(new CodeDecode("부산", "부산"));
    codes.add(new CodeDecode("대구", "대구"));
    codes.add(new CodeDecode("울산", "울산"));
    return codes;
  }

>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
  //회원가입양식
  @GetMapping("/add")
  public String joinForm(Model model){
    model.addAttribute("joinForm", new JoinForm());
<<<<<<< HEAD
    return "member/joinForm";
=======
    return  "member/joinForm";
>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
  }

  //회원가입처리
  @PostMapping("/add")
  public String join(@Valid @ModelAttribute JoinForm joinForm, BindingResult bindingResult){
<<<<<<< HEAD
    log.info("joinForm={}",joinForm);
    if(bindingResult.hasErrors()){
      log.info("bindingResult={}",bindingResult);
=======
    log.info("joinForm={}", joinForm);
    if(bindingResult.hasErrors()){
      log.info("bindingResult={}", bindingResult);
>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
      return "member/joinForm";
    }

    //비밀번호 체크
    if(!joinForm.getPasswd().equals(joinForm.getPasswdchk())) {
<<<<<<< HEAD
      bindingResult.reject("passwd","비밀번호가 동일하지 않습니다.");
      log.info("bindingResult={}",bindingResult);
      return "member/joinForm";
    }
=======
      bindingResult.reject("passwd", "비밀번호가 일치하지 않습니다.");
     log.info("bindingResult={}", bindingResult);
      return "member/joinForm";
    }

>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
    Member member = new Member();
    member.setEmail(joinForm.getEmail());
    member.setPasswd(joinForm.getPasswd());
    member.setNickname(joinForm.getNickname());
    member.setGender(joinForm.getGender());
    member.setHobby(hobbyToString(joinForm.getHobby()));
    member.setRegion(joinForm.getRegion());

    memberSVC.save(member);
<<<<<<< HEAD
    return "member/joinSuccess";
  }


  private String hobbyToString(List<String> hobby) {
    return StringUtils.join(hobby,",");
=======
    return  "member/joinSuccess.html";
  }
  private String hobbyToString(List<String> hobby) {
    return StringUtils.join(hobby, ",");
>>>>>>> 320f499fe8426c809f00d8409f1ae643963ff862
  }
}
