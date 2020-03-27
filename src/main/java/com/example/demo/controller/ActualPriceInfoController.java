package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.http.RequestSender;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

@RestController
public class ActualPriceInfoController {
	private final String service_url = "http://openapi.seoul.go.kr:8088/";
	private final String service_key = "4c4655564d6c6f6b33376a44456171";
	private String request_Type = "json";
	private final String service_name = "landActualPriceInfo";
	private int start_idx = 0;
	private int end_idx = 0;
	
	@RequestMapping(value="/getActualPriceInfoAll", produces="application/json; charset=utf-8")
	public String getActualPriceInfoAll(String stIdx, String edIdx) {
		String str = "";
//		start_idx = 1;
//		end_idx = 100;
		int start = Integer.parseInt(stIdx);
		int end = Integer.parseInt(edIdx);
		String requestUrl = service_url + service_key + "/" + request_Type + "/" + service_name
				+ "/" + start + "/" + end + "/";
		Object obj = RequestSender.get(requestUrl);
		str = (new Gson()).toJson(obj.toString());
		return str;
	}
}
