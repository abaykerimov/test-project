package com.example.test;

import com.example.test.domain.Text;
import com.example.test.service.text.TextService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	@Autowired
	private TextService textService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAllTexts() {
		List<Text> texts = textService.getAll();
		assertNotNull(texts);
		assertFalse(texts.isEmpty());
	}

	@Test
	public void getText() {
		Text text = textService.getText(1);
		assertNotNull(text);
	}

	@Test
	public void addText() {
		Text text = new Text((long) 100, "test test");
		textService.addText(text);
		assertEquals("test test", text.getText());
	}
}
