package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        //sc라는 변수를  this.sc라는 변수에 지정한다.or 담는다.
        this.sc = sc;
    }

    public void attack() {
        //참일경우 반복적으로 실행한다.
        while (true){
            //명령어를 담아야한다.
            System.out.println("공격해바");;
            String commande = sc.nextLine(); //sc라는 변수를 커맨드라는 명령어로 담는다.
            //그다음은 조건을 적용한다. 어떻게? if로
            if (commande.equals("공격")){
                System.out.println("공격합니다");
                break;
            }else {
                System.out.println("해당기능을 수행할수없습니다.");
                System.out.println("올바른 명령을 입력하시오");
            }
        }
        System.out.println("종료");
    }
}
