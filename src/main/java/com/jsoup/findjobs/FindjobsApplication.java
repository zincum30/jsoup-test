package com.jsoup.findjobs;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class FindjobsApplication {

	public static void main(String[] args) throws Exception {

		String url = "https://www.wanted.co.kr/wd/142762";
		Document document = Jsoup.connect(url).get();
		Elements elements = document.getElementsByClass(".JobContent_descriptionWrapper__SM4UD");

		for (Element element : elements) {
			System.out.println(element.text());
		}

	}
}
