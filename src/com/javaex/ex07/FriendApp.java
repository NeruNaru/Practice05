package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i = 0 ; i<friendArray.length ; i++) {
        	friendArray[i] = new Friend();
        	System.out.print("이름: ");
        	friendArray[i].setName(sc.next());
        	
        	System.out.print("핸드폰: ");
        	friendArray[i].setHp(sc.next());
        	
        	System.out.print("학교: ");
        	friendArray[i].setSchool(sc.next());
        	System.out.println("===============");
        }
      
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
