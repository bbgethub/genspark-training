package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.entity.Candidate;
import com.genspark.CareerCenter.service.CandidateService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
class CandidateControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Mock
    CandidateService service;
    @InjectMocks
    CandidateController candidateController;

    @AfterEach
    void tearDown() {
    }
    @Test
    void testCreateCandidate() throws Exception
    {


        MockMultipartFile file = new MockMultipartFile("file", "NameOfTheFile", "multipart/form-data", "inputFile".getBytes());
       // MockMultipartFile file=new MockMultipartFile("String1","")
        Candidate mockCandidate=new Candidate(1L,"Kim","file".getBytes());
        Mockito.when(service.createCandidate(Mockito.any(String.class),Mockito.any(MultipartFile.class))).thenReturn(mockCandidate);
        Candidate candidate=service.createCandidate("Kkk",file);
        assertEquals(candidate,mockCandidate);
    }
    @Test
    void testReadCandidates()
    {
        Candidate mockCandidate=new Candidate(2L,"sss","hjk".getBytes());
        Mockito.when(service.findCandidateById(Mockito.anyLong())).thenReturn(mockCandidate);
        Candidate candidate=service.findCandidateById(2L);
        assertEquals(candidate,mockCandidate);
    }
}