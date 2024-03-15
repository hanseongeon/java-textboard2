package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    ArrayList<Text> text = new ArrayList<>();

    public void run() {
        int titleNum = 1;

        while (true) {
            System.out.print("명령어를 입력해주세요 :");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                System.out.print("제목을 입력해 주세요 :");
                String title = sc.nextLine();
                System.out.print("내용을 입력해 주세요 :");
                String content = sc.nextLine();
                Text t1 = new Text();
                t1.setTitle(title);
                t1.setContent(content);
                t1.setTitleNum(titleNum);
                text.add(t1);
                titleNum++;
                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                for (Text t1 : text) {
                    System.out.println("===========");
                    System.out.println("번호 :" + t1.getTitleNum());
                    System.out.println("제목 :" + t1.getTitle());
                    System.out.println("===========");
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물의 번호를 입력해주세요 :");
                int textNum = Integer.parseInt(sc.nextLine());
                int index = getIndexNum(textNum);
                if (index == -1) {
                    System.out.print("존재하지 않는 게시물 입니다.");
                }
                System.out.print("수정할 제목을 입력해 주세요 :");
                String updateTitle = sc.nextLine();
                System.out.print("수정할 내용을 입력해 주세요 :");
                String updateContent = sc.nextLine();
                text.get(index).setTitle(updateTitle);
                text.get(index).setContent(updateContent);

            }else if(cmd.equals("delete")){

            }

        }
    }

    public int getIndexNum(int num) {
        for (int i = 0; i <= text.size(); i++) {
            Text t1 = text.get(i);
            if (t1.getTitleNum() == num) {
                return i;
            }
        }
        return -1;
    }
}
