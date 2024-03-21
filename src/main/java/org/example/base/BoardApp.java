package org.example.base;

import org.example.domain.controller.TextController;
import org.example.domain.model.Text;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    ArrayList<Text> text = new ArrayList<>();
    TextController textController = new TextController();

    public void run() {
        int titleNum = 4;
        while (true) {
            System.out.print("명령어를 입력해주세요 :");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                textController.add();
            } else if (cmd.equals("list")) {
                textController.list();
            } else if (cmd.equals("update")) {
                textController.update();
            } else if (cmd.equals("delete")) {
                textController.delete();
            }
            else if (cmd.equals("detail")) {
                textController.detail();
            }
        else if (cmd.equals("search")) {
               textController.search();
            }


        }

    }


}
