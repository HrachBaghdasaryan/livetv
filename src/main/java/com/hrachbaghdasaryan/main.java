package com.hrachbaghdasaryan;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        System.out.println("testing");
        String url = "http://livetv461.me/allupcomingsports/1/";
        try {
            Document doc = Jsoup.connect(url).timeout(0).get();
            Elements elementsByClass = doc.body().getElementsByAttributeValueContaining("cellpadding", "3").get(2).getElementsByClass("live");
            List<Element> collect = elementsByClass.stream().map(Element::parent).collect(Collectors.toList());
            String match = collect.get(1).toString();
            //System.out.println(match);
            String matchUrl = match.substring(match.indexOf("href=\"")+6, match.indexOf("\">"));
            String matchName = match.substring(match.indexOf("0__/\">")+6, match.indexOf("</a>"));
            String matchDAte = match.substring(match.indexOf("\"evdesc\">")+9, match.indexOf("<br>", match.indexOf("\"evdesc\">")));
            String matchLiga = match.substring(match.indexOf("<br>", match.indexOf("\"evdesc\">"))+6, match.indexOf(")</span>"));
            System.out.println(matchLiga);
            System.out.println(matchName);
            System.out.println(matchDAte);
            System.out.println("http://livetv461.me"+ matchUrl);
        } catch (IOException e) {
            System.out.println("error while getting data from web");
        }
    }
}
