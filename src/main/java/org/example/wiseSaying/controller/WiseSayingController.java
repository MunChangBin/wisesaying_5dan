package org.example.wiseSaying.controller;

import org.example.WiseSaying;

import java.util.ArrayList;
import java.util.Scanner;

public class WiseSayingController {

    private final Scanner sc; //파이널이란 경우 한번 세팅하면 수정하지않겟다는 의미
    long lastWiseSayingId = 0;
    ArrayList<WiseSaying> WiseSayings = new ArrayList<>(); //명언들 이라고 명언5단계 시 새로 선언 // 어레이 리스트 안엔 새로운 객체 WiseSaying 를 선언
    // 기존에 어레이 리스트는 wiseSaying 클래스에있는 run 메소드에 있엇으나 컨틀롤러 로  옮김

    public WiseSayingController(Scanner sc) {
        this.sc = sc;
    }
}

    public void write() {
        long id = lastWiseSayingId + 1;

        System.out.println("명언:");
        String content = sc.nextLine().trim();//sc.nextLine 메소드를 weisesaying 으루 담는다.
        System.out.println("작가:");
        String authorName = sc.nextLine().trim(); //sc.nextLine 메소드를 authorName 으루 담는다.
        WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
        WiseSayings.add(wiseSaying);

        System.out.printf("%d 번이 등록되었습니다", lastWiseSayingId);//문자열을 출력하기 위해 프린트ln 이 아닌 f를 사용
        lastWiseSayingId = id;// 갱신된값을 id값을 증강값으로 변경
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-".repeat(30));

        for (int i = WiseSayings.size() -1 ; i >=0 ; i--) {
            WiseSaying wiseSaying = WiseSayings.get(i);
            System.out.printf("%d / %s /%s\n", wiseSaying.getId(), wiseSaying.getContent(),wiseSaying.getAuthorName());
        }
        System.out.println("총 등록갯수 :" + WiseSayings.size());

    }

