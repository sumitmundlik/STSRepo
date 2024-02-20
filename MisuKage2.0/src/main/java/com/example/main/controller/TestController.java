package com.example.main.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RestController
public class TestController {
	
	@RequestMapping("/pastweather")
	public void test1() throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://ai-weather-by-meteosource.p.rapidapi.com/time_machine?date=2021-08-24&lat=37.81021&lon=-122.42282&units=auto"))
				.header("X-RapidAPI-Key", "b53b175589mshc0f33b098ca2627p14762cjsnb23eb1204228")
				.header("X-RapidAPI-Host", "ai-weather-by-meteosource.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		String t = response.body();
		System.out.println(response.body());
		
//        System.out.println("Status Code: " + statusCode);
//        System.out.println("Response Body: " + responseBody);
//        
		System.out.println(response);
	}
	
	@RequestMapping("/weather")
	public void test2() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://ai-weather-by-meteosource.p.rapidapi.com/find_places?text=fishermans%20wharf&language=en"))
				.header("X-RapidAPI-Key", "b53b175589mshc0f33b098ca2627p14762cjsnb23eb1204228")
				.header("X-RapidAPI-Host", "ai-weather-by-meteosource.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		String t = response.body();
		System.out.println(response.body());
	}
	
	@RequestMapping("/postweather")
	public void test3() throws IOException, InterruptedException {

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://ai-weather-by-meteosource.p.rapidapi.com/weather_statistics?lat=37.81021&lon=-122.42282&units=auto"))
				.header("X-RapidAPI-Key", "b53b175589mshc0f33b098ca2627p14762cjsnb23eb1204228")
				.header("X-RapidAPI-Host", "ai-weather-by-meteosource.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		String t = response.body();
		System.out.println(response.body());
		
	}
	
	
}
