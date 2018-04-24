package com.mmall.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/4/22.
 */
@Controller
@RequestMapping("/admin")
public class Test {
  public static void main(String args[]){
      for(int i=0;i<10;i++){
        System.out.println(i);
      }




  }

}
