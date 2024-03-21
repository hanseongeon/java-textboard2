package org.example.domain.controller;

import org.example.domain.model.Text;
import org.example.domain.view.TextView;
import org.example.domain.model.TextRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class TextController {
    TextRepository textRepository = new TextRepository();
    TextView textView = new TextView();
    Scanner sc = new Scanner(System.in);

    public void list() {
        ArrayList<Text> t1 = textRepository.findAll();
        textView.listText(t1);
    }

    public void add() {
        System.out.print("제목을 입력해 주세요 :");
        String title = sc.nextLine();
        System.out.print("내용을 입력해 주세요 :");
        String content = sc.nextLine();

        textRepository.saveText(title, content);
        System.out.println("게시물이 등록되었습니다.");
    }

    public void update() {
        System.out.print("수정할 게시물 번호를 입력해주세요 : ");
        int index = getParmIndex(sc.nextLine());
        Text updateText = textRepository.getTextNum(index);
        System.out.println("수정할 제목 : ");
        String updateTitle = sc.nextLine();
        System.out.println("수정할 내용 : ");
        String updateContent = sc.nextLine();
        updateText.setTitle(updateTitle);
        updateText.setContent(updateContent);
        textRepository.newTime(index);
    }

    public void delete() {
        System.out.print("삭제할 게시물의 번호를 입력해주세요 :");
        int index = getParmIndex(sc.nextLine());
        if (index == -1) {
            return;
        }
        Text deleteText = textRepository.getTextNum(index);
        if (deleteText == null) {
            System.out.println("없는 게시물 입니다.");
            return;
        }

        textRepository.deleteText(deleteText);

    }

    public void detail() {
        System.out.print("상세보기할 게시물의 번호를 입력해주세요 :");
        int index = getParmIndex(sc.nextLine());
        if (index == -1) {
            return;
        }

        Text detailText = textRepository.getTextNum(index);

        if (detailText == null) {
            System.out.println("없는 게시물 입니다.");
            return;
        }
        textView.textDetail(detailText);
    }

    public void search() {
        System.out.print("찾을 제목을 입력해주세요 :");
        String keyWord = sc.nextLine();
       ArrayList<Text> searchText = textRepository.findKeyWord(keyWord);
       textView.listText(searchText);
    }

    public int getParmIndex(String num) {
        try {
            int textNum = Integer.parseInt(num);
            return textNum;
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해 주세요.");
            return -1;
        }
    }
}

