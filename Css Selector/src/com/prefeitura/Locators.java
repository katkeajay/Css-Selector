package com.prefeitura;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Locators{
	public static void main(String args[]) {
		try {
			Document doc= Jsoup.connect("https://prefeitura.pbh.gov.br/saude/licitacao/pregao-eletronico-151-2020").userAgent("Mozilla/17.0").get();
			
			Elements Pub_Date = doc.select("body.layout-no-sidebars.not-preloader.path-node.node--type-licitacao:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(2) div.body-page div.main.main-page:nth-child(6) div.content.content-full div.container div.content-main-inner div.row div.main-content.col-xs-12.col-md-8.col-md-push-4.sb-l div.main-content-inner div.content-main div.views-element-container.block.block-views.block-views-blockview-noticia-pbh-block-5.no-title:nth-child(3) div.content.block-content div.js-view-dom-id-0560f8d656e496d7f3ad1499e4e7eaeb1b00dfa8c53db2146c8f5ec4dcad1593 div.view-content-wrap div.item div.views-field.views-field-nothing:nth-child(2) span.field-content span.col-sm-6.lbl-licitacao:nth-child(1) span:nth-child(1) font:nth-child(1) > font:nth-child(1)");
			Elements Bidding_Date = doc.select("\r\n"+"body.layout-no-sidebars.not-preloader.path-node.node--type-licitacao:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(2) div.body-page div.main.main-page:nth-child(6) div.content.content-full div.container div.content-main-inner div.row div.main-content.col-xs-12.col-md-8.col-md-push-4.sb-l div.main-content-inner div.content-main div.views-element-container.block.block-views.block-views-blockview-noticia-pbh-block-5.no-title:nth-child(3) div.content.block-content div.js-view-dom-id-0560f8d656e496d7f3ad1499e4e7eaeb1b00dfa8c53db2146c8f5ec4dcad1593 div.view-content-wrap div.item div.views-field.views-field-nothing:nth-child(2) span.field-content > span.col-sm-6.lbl-licitacao:nth-child(19)\r\n"+ "");
			Elements Object = doc.select("\r\n"+ "body.layout-no-sidebars.not-preloader.path-node.node--type-licitacao:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(2) div.body-page div.main.main-page:nth-child(6) div.content.content-full div.container div.content-main-inner div.row div.main-content.col-xs-12.col-md-8.col-md-push-4.sb-l div.main-content-inner div.content-main div.views-element-container.block.block-views.block-views-blockview-noticia-pbh-block-5.no-title:nth-child(3) div.content.block-content div.js-view-dom-id-0560f8d656e496d7f3ad1499e4e7eaeb1b00dfa8c53db2146c8f5ec4dcad1593 div.view-content-wrap div.item div.views-field.views-field-nothing:nth-child(2) span.field-content span.lbl-licitacao:nth-child(4) span:nth-child(1) font:nth-child(1) > font:nth-child(1)\r\n"+ "");
				
			System.out.println(Pub_Date);
			System.out.println(Bidding_Date);
			System.out.println(Object);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
