package com.example.demo.controller;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.CusDetEntity;
import com.example.demo.service.CusDetService;

@SpringBootApplication
@Controller
public class CusDetController {

	@Autowired
	private CusDetService cusdetService;
	
	
	@GetMapping("housing/CustomerDetailsS09/{id}")
	public String displayView(@PathVariable Long id, Model model) {
		CusDetEntity cusEntity = cusdetService.findById(id);
		model.addAttribute("userData", cusEntity);
		return "housing/CustomerDetailsS09";
	}
	
	
	
		/**
		* ファイルダウンロード処理
		* @param id ID
		* @param response HttpServletResponse
		* @return 画面遷移先(nullを返す)
		* @throws IOException
		*/
	@RequestMapping("/housing/CustomerDetailsS09/download")
	public String download(@RequestParam("id") Long id,HttpServletResponse response) throws IOException {

	//ファイルデータテーブル(file_data)を全件取得
	CusDetEntity list = cusdetService.findById(id);

	// ファイル名の設定
	String fileName = "test.csv";
	
	String filePath = System.getProperty("java.io.tmpdir");

	//出力先を作成する
	/*try {*/
	FileOutputStream fos = new FileOutputStream(filePath + fileName);
    OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
    BufferedWriter bw = new BufferedWriter(osw);
    PrintWriter pw = new PrintWriter(bw);



	pw.println("顧客ID,顧客名,住所,電話番号,メールアドレス,作成日時,更新日時");
	pw.print(list.getId() + ",");
	pw.print(list.getName() + ",");
	pw.print(list.getAddress() + ",");
	pw.print(list.getPhone() + ",");
	pw.print(list.getEmail() + ",");
	pw.print(list.getCreateDate() + ",");
	pw.print(list.getUpdateDate());
	pw.println();

	pw.close();;

	//ファイルダウンロードの設定を実施
	//ファイルの種類は指定しない
	response.setContentType("application/octet-stream");
	response.setHeader("Cache-Control", "private");
	response.setHeader("Pragma", "");
	response.setHeader("Content-Disposition",
	"attachment;filename=\"" + getFileName(filePath + fileName) + "\"");

	InputStream in = new FileInputStream(filePath + fileName);
	ServletOutputStream out = response.getOutputStream();

	int len = 0;

	byte[] buf = new byte[1024];

	while ((len = in.read(buf)) != -1) {

	out.write(buf, 0, len);

	}

	in.close();

	File file = new File(filePath + fileName);

	file.delete();

	//画面遷移先はnullを指定
	return null;
	}

	/**
	* ファイルパスからファイル名を取得する
	* @param filePath ファイルパス
	* @return ファイル名
	*/
	private String getFileName(String filePath) {
	String fileName = "";
	if (filePath != null && !"".equals(filePath)) {
	try {
	//ファイル名をUTF-8でエンコードして指定
	fileName = URLEncoder.encode(new File(filePath).getName(), "UTF-8");
	} catch (Exception e) {
	System.err.println(e);
	return "";
	}
	}
	return fileName;
	}
	
}