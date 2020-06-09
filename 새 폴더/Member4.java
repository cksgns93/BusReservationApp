package Pr;

import java.util.*;

public class Member4 {
   private String name;
   private String id;
   private String pw;
   private String birth;
   private String email;
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getID() {
      return id;
   }

   public void setID(String iD) {
      id = iD;
   }

   public String getPW() {
      return pw;
   }

   public void setPW(String PW) {
      pw = PW;
   }

   public String getBirth() {
      return birth;
   }

   public void setBirth(String BIRTH) {
      birth = BIRTH;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   
   public Member4() {
      this("홍길동", "가나다라", "000000", "000000", "wdaiw@nacw.cai");
   }
   
   public Member4(String name, String ID, String PW, String Birth, String email) {
      this.name=name;
      this.id=ID;
      this.pw=PW;
      this.birth=Birth;
      this.email=email;
   }
   
   @Override
   public boolean equals(Object ob) {
      if (ob instanceof Member4) {
         Member4 user=(Member4)ob;
         boolean b=(user.name.equals(this.name))&&(user.id==this.id)&&(user.pw==this.pw)
               &&(user.birth==this.birth)&&(user.email==this.email);
         //&&연산자 : 둘다 트루일때 트루, 그외에는 모두 펄스
         return b;
      }else {
         return false;
      }
      
   }
}    