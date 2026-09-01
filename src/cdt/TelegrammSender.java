package cdt;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class TelegrammSender {

	private static final String BOT_TOKEN = System.getenv("TELEGRAM_BOT_TOKEN");

	private static final String CHAT_ID = System.getenv("TELEGRAM_CHAT_ID");

	private static final HttpClient HTTP_CLIENT = HttpClient.newHttpClient();

	public static void main(String[] args) {

		String messageText = "Test notification";

		try {
			// to stop here:
			sendMessage(messageText);
		} catch (IOException e) {
			System.out.println("Fehler beim Senden.");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Fehler");
		}

	}

	public static void sendMessage(String text) throws IOException, InterruptedException {

		if (BOT_TOKEN == null || BOT_TOKEN.isBlank()) {
			throw new IllegalStateException("Environment variable TELEGRAM_BOT_TOKEN is missing");
		}

		if (CHAT_ID == null || CHAT_ID.isBlank()) {
			throw new IllegalStateException("Environment variable TELEGRAM_CHAT_ID is missing");
		}

		String url = "https://api.telegram.org/bot" + BOT_TOKEN + "/sendMessage";

		String body = "chat_id=" + URLEncoder.encode(CHAT_ID, StandardCharsets.UTF_8) + "&text="
				+ URLEncoder.encode(text, StandardCharsets.UTF_8);

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
				.header("Content-Type", "application/x-www-form-urlencoded")
				.POST(HttpRequest.BodyPublishers.ofString(body)).build();

		HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println("Telegram HTTP Status: " + response.statusCode());

	}
}
