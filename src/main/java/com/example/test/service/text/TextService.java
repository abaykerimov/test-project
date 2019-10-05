package com.example.test.service.text;

import com.example.test.domain.Text;
import java.util.List;

public interface TextService {

    public Text addText(Text text);

    public List<Text> getAll();

    public Text getText(long textId);
}
