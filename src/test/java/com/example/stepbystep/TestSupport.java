package com.example.stepbystep;

import com.example.stepbystep.dto.model.CandidateDto;
import com.example.stepbystep.model.Candidate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSupport {

    private static String candidateId = "123456";

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

    public static Candidate generateCandidate(String email) {
        return new Candidate(
                candidateId,
                email,
                "firstName" + candidateId,
                "lastName" + candidateId,
                "phoneNumber" + candidateId);
    }

    public static CandidateDto generateCandidateDto(String email) {
        return new CandidateDto(
                email,
                "firstName" + candidateId,
                "lastName" + candidateId,
                "phoneNumber" + candidateId,
                null);
    }
}
