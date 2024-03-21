package org.example.domain.model;

import org.example.base.CommonUtil;

import java.util.ArrayList;

public class TextRepository {
    ArrayList<Text> text = new ArrayList<>();
    CommonUtil commonUtil = new CommonUtil();
    int textNum = 4;

   public TextRepository() {
        makeTestList();
    }

    public void makeTestList() {
        Text t1 = new Text("안녕하세여", "반갑습니다", 1);
        text.add(t1);
        Text t2 = new Text("자바공부", "어렵나요", 2);
        text.add(t2);
        Text t3 = new Text("요즘날씨", "추워용", 3);
        text.add(t3);
    }

    public Text getTextNum(int num) {
        for (int i = 0; i < text.size(); i++) {
            Text t1 = text.get(i);
            if (t1.getTitleNum() == num) {
                return t1;
            }
        }
        return null;
    }


    public void saveText(String title, String content) {
        Text t1 = new Text();
        t1.setTitle(title);
        t1.setContent(content);
        t1.setTitleNum(textNum);
        t1.setRegDate(commonUtil.getCurrentDateTime());
        text.add(t1);
        textNum++;
    }

    public void deleteText(Text t1) {
        text.remove(t1);
    }

    public void newTime(int i) {
        text.get(i).setRegDate(commonUtil.getCurrentDateTime());
    }

    public ArrayList<Text> findKeyWord(String keyWord) {
        ArrayList<Text> keyText = new ArrayList<>();
        for (Text t1 : text) {
            if (t1.getTitle().contains(keyWord)) {
                keyText.add(t1);
            }
        }
        return keyText;
    }

    public ArrayList<Text> findAll() {
        return text;
    }
}

