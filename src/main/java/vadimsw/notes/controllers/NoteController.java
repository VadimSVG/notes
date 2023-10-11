package vadimsw.notes.controllers;

import org.springframework.web.bind.annotation.*;
import vadimsw.notes.models.Note;
import vadimsw.notes.repo.NoteRepository;

import java.util.List;

@RestController
public class NoteController {
    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping("/rest/getAll")
    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    @PostMapping("/rest/note")
    Note newEmployee(@RequestBody Note newNote) {
        return noteRepository.save(newNote);
    }

    @GetMapping("/rest/{id}")
    Note one(@PathVariable Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id.toString()));
    }

    @PutMapping("/rest/{id}")
    Note replaceEmployee(@RequestBody Note newNote, @PathVariable Long id) {

        return noteRepository.findById(id)
                .map(employee -> {
                    employee.setTitle(newNote.getTitle());
                    employee.setFull_text(newNote.getFull_text());
                    return noteRepository.save(employee);
                })
                .orElseGet(() -> {
                    newNote.setId(id);
                    return noteRepository.save(newNote);
                });
    }

    @DeleteMapping("/note/{id}")
    void deleteNote(@PathVariable Long id) {
        noteRepository.deleteById(id);
    }
}
