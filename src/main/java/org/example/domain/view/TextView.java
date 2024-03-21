package org.example.domain.view;

import org.example.domain.model.Text;

import java.util.ArrayList;

public class TextView {
    public void listText(ArrayList<Text> text){
        for(Text t1 : text){
            System.out.println("번호 : "+t1.getTitleNum());
            System.out.println("제목 : "+t1.getTitle());
        }
    }
    public void textDetail(Text text){
        System.out.println("번호 :" + text.getTitleNum());
        System.out.println("제목 : " + text.getTitle());
        System.out.println("내용 : " + text.getContent());
    }
}
