package com.example.test;

import com.example.test.domain.Text;
import com.example.test.service.text.TextService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	@MockBean
	private TextService textService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAllTexts() {
		List<Text> textList = new ArrayList<Text>();
		Text text1 = new Text((long) 1, "Hello World!");
		Text text2 = new Text((long) 2, "Welcome!");
		textList.add(text1);
		textList.add(text2);

		Mockito.when(textService.getAll()).thenReturn(textList);

		List<Text> texts = textService.getAll();
		assertNotNull(texts);
		assertEquals(2, texts.size());

		Mockito.verify(textService, Mockito.times(1)).getAll();
	}

	@Test
	public void getText() {
		Mockito.when(textService.getText(1)).thenReturn(new Text((long) 1, "Hello World!"));

		Text text = textService.getText(1);
		assertNotNull(text);
		assertEquals("Hello World!", text.getText());
	}

	@Test
	public void addText() {
		Text text = new Text((long) 100, "test test");
		textService.addText(text);
		Mockito.verify(textService, Mockito.times(1)).addText(text);
	}
}
