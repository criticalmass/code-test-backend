package com.cm;

import org.junit.Test;

import com.cm.pojo.CMResponse;
import com.cm.pojo.Posts;
import com.cm.service.impl.JsonService;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	@Test
	public void testPostModify() {

		String url = "http://jsonplaceholder.typicode.com/posts";
 
		JsonService service = new JsonService();

		CMResponse response = null;
		try {
			response = service.parseJson(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int postCount = 0;
		for (Posts post : response.getPosts()) {

			if (postCount == 3) {
				assertTrue(post.getBody().equalsIgnoreCase("CriticalMass") && post.getTitle().equalsIgnoreCase("CriticalMass"));
			}
			postCount = postCount + 1;
		}
	}

	@Test
	public void testUserCount() {

		String url = "http://jsonplaceholder.typicode.com/posts";

		JsonService service = new JsonService();

		CMResponse response = null;
		try {
			response = service.parseJson(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(response.getUserCount() == 10);

	}
}
