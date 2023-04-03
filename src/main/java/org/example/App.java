package org.example;

import org.example.system.controller.SystemController;
import org.example.wiseSaying.controller.WiseSayingController;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        long lastWiseSayingId = 0;
        ArrayList<WiseSaying> WiseSayings = new ArrayList<>(); //명언들 이라고 명언5단계 시 새로 선언 // 어레이 리스트 안엔 새로운 객체 WiseSaying 를 선언
        SystemController systemController = new SystemController();//시스템 컨트롤러 를 부를 메소드 선언
        WiseSayingController wiseSayingController = new WiseSayingController(sc);// WiseSaying컨트롤러를 부를 메소드 선언.

        System.out.println("==Wise_ying_App==");//시작 호출명으로 출력한다.
        while (true) {//와일문 반복문  실행할때 true를 넣음으로써 참일시. 로직을 타게 만든다.
            String commande = sc.nextLine().trim();// sc를 commande에 넣어줌으로써. 한줄 단위로입력되며 trim으루 공백을없앤다.
            if (commande.equals("종료")) {//equals 값비교하기/ "종료"라는것 문자를 실행할시비교한다
                System.out.println("==END==");//위에 조건문이 실행이되엇을시 END라는 문자열을 출력.
                systemController.exit();


                break; //브레이크를 걸어줌으로써 종료
            } else if (commande.equals("등록")) {// "등록"이라는 문자를 실행할시 비교 하여 실행
                wiseSayingController.write(); //WiseSayingController에 부를 메소드 선언.
                long id = lastWiseSayingId + 1;

                System.out.println("명언:");
                String content = sc.nextLine().trim();//sc.nextLine 메소드를 weisesaying 으루 담는다.
                System.out.println("작가:");
                String authorName = sc.nextLine().trim(); //sc.nextLine 메소드를 authorName 으루 담는다.
                WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
                WiseSayings.add(wiseSaying);

                System.out.printf("%d 번이 등록되었습니다", lastWiseSayingId);//문자열을 출력하기 위해 프린트ln 이 아닌 f를 사용
                lastWiseSayingId = id;// 갱신된값을 id값을 증강값으로 변경

            } else if (commande.equals("목록")) {
                wiseSayingController.list();//wisesayingcontroller에 부를 메소드 선언


                System.out.println("총 등록갯수 :" + WiseSayings.size());
            } else {
                System.out.println("==똑바로입력하세요==");
            }
        }


    }
}
