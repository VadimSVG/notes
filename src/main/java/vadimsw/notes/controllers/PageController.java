package vadimsw.notes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vadimsw.notes.models.Note;
import vadimsw.notes.repo.NoteRepository;

@Controller
public class PageController {

    private NoteRepository noteRepository;

    public PageController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/notes")
    public String notesMain (Model model){
        Iterable<Note> posts = noteRepository.findAll();
        model.addAttribute("posts", posts);
        return "notes-main";
    }
}
