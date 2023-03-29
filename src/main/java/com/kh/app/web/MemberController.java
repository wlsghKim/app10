package com.kh.app.web;

import com.kh.app.domain.member.svc.MemberSVC;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

  private final MemberSVC memberSVC;

  //회원가입양식
  @GetMapping("/add")
  public String joinForm(){

    return  "member/joinForm";
  }

  //회원가입처리
  @PostMapping("/add")
  public String join(){

    return  "member/joinSuccess.html";
  }

}
