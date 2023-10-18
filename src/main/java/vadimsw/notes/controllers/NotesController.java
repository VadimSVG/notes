package vadimsw.notes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vadimsw.notes.models.Note;
import vadimsw.notes.repo.NoteRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

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
    @GetMapping("/notes-main/{id}")
    public String notesDetails(@PathVariable(value = "id") long id, Model model){
        if (!noteRepository.existsById(id)){
            return "redirect:/notes-main";
        }
       Optional<Note> note = noteRepository.findById(id);
        ArrayList<Note> res = new ArrayList<>();
        note.ifPresent(res::add);
       model.addAttribute("note", res);
        return "notes-details";
    }
    @GetMapping("/notes-main/{id}/edit")
    public String notesEdit(@PathVariable(value = "id") long id, Model model){
        if (!noteRepository.existsById(id)){
            return "redirect:/notes-main";
        }
        Optional<Note> note = noteRepository.findById(id);
        ArrayList<Note> res = new ArrayList<>();
        note.ifPresent(res::add);
        model.addAttribute("note", res);
        return "notes-edit";
    }
    @PostMapping("/notes-main/{id}/edit")
    public String notePostUpdate(@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam String anons,
                              @RequestParam String full_text, Model model){
        Note note = noteRepository.findById(id).orElseThrow();
        note.setTitle(title);
        note.setAnons(anons);
        note.setFull_text(full_text);
        noteRepository.save(note);
        return "redirect:/notes-main";
    }
    @PostMapping("/notes-main/{id}/remove")
    public String notePostDelete(@PathVariable(value = "id") long id, Model model){
        Note note = noteRepository.findById(id).orElseThrow();
        noteRepository.delete(note);
        return "redirect:/notes-main";
    }


}
