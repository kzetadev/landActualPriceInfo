package com.example.demo.http;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static java.net.http.HttpResponse.BodyHandlers.ofString;
public class RequestSender {
	public static Object get(String url) {
		HttpResponse response = null;
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.build();
		try {
			response = client.send(request, ofString());			
		} catch (Exception e) {
			System.out.println(e);
		}
		return response.body();
	}
}
