import org.example.App;

import java.util.Scanner;
//명령이 공격이면 공격합니다 출력하고  프로그램 종료 그리고 잘못입력하면 (공격이 아니면 해당기능을 수행할수없습니다.)
//올바른 명령을 입력하시오.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //app 클래스 안에. 메서드 어택을 지정한다.

        new App(sc).attack();


    }
}