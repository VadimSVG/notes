package vadimsw.notes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vadimsw.notes.models.Note;
import vadimsw.notes.repo.NoteRepository;

@Controller
public class NotesController {
    @Autowired
    private NoteRepository noteRepository;
    @GetMapping("/notes-main")
    public String notesMain(Model model){
        Iterable<Note> notes = noteRepository.findAll();
        model.addAttribute("notes", notes);
        return "notes-main";
    }
    @GetMapping("/notes-main/add")
    public String notesAdd(Model model){
        return "notes-add";
    }
    @PostMapping("/notes-main/add")
    public String notePostAdd(@RequestParam String title, @RequestParam String anons,
                              @RequestParam String full_text, Model model){
        Note note = new Note(title,anons,full_text);
        noteRepository.save(note);
        return "redirect:/notes-main";
    }


}
