package com.example.stepbystep;

import com.example.stepbystep.dto.model.CandidateDto;
import com.example.stepbystep.model.Candidate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSupport {

    public static List<Candidate> generateCandidates() {
        return IntStream.range(0, 5).mapToObj(
                i -> new Candidate(
                    String.valueOf(i),
                    i + "mail.com",
                    "password" + i,
                    "firstName" + i,
                    "lastName" + i,
                    "telNo" + i)).collect(Collectors.toList());
    }

    public static List<CandidateDto> generateCandidateDtoList(List<Candidate> candidateList) {
        return candidateList.stream().map(
                from -> new CandidateDto(
                        from.getEmail(),
                        from.getFirstName(),
                        from.getLastName(),
                        from.getTelNo(),
                        null
                )).collect(Collectors.toList());
    }
}
