package org.example;

public class WiseSaying {
    private long id; //클래스 내부에서만 호출 할수 있도록 private를 사용

    private  String content;//클래스 내부에서만 호출 할수 있도록 private를 사용

    private  String authorName; //클래스 내부에서만 호출 할수 있도록 private를 사용


    public WiseSaying(long id , String content , String authorName){ // 해당 메소드에  this을 호출 할수 있도록 선언
        this.id = id;
        this.content =content;
        this.authorName = authorName;
    }

    public long getId() { //객체 지향 get으로  변수값 id 를 반환 할수있도록 리턴 선언
        return id;
    }

    public String getContent() {//객체 지향 get으로  변수값 content 를 반환 할수있도록 리턴 선언
        return content;
    }

    public String getAuthorName() {//객체 지향 get으로  변수값 content 를 반환 할수있도록 리턴 선언
        return authorName;
    }
}

