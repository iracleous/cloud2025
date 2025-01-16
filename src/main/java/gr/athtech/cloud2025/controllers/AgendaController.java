package gr.athtech.cloud2025.controllers;


import gr.athtech.cloud2025.models.Meeting;
import gr.athtech.cloud2025.repositories.MeetingRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class AgendaController {
    private final MeetingRepository meetingRepository;

    @GetMapping
    public List<Meeting> getAllMeetings() {
        return meetingRepository.findAll();
    }

    @PostMapping
    public Meeting addMeeting(@RequestBody Meeting meeting) {
        return meetingRepository.save(meeting);
    }


    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint.";
    }

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "This is a secure endpoint.";
    }

}
