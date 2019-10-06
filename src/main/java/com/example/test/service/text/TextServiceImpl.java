package com.example.test.service.text;

import com.example.test.domain.Text;
import com.example.test.repos.TextRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextServiceImpl implements TextService {

    private final TextRepo textRepo;

    @Autowired
    public TextServiceImpl(TextRepo textRepo) {
        this.textRepo = textRepo;
    }

    public Text addText(Text text) {
        textRepo.insert(text);
        long id = text.getId();
        return getText(id);
    }

    public List<Text> getAll() {
        return textRepo.findAll();
    }

    public Text getText(long textId) {
        return textRepo.findById(textId);
    }
}
