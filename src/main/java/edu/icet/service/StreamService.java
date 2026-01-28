package edu.icet.service;

import edu.icet.model.dto.StreamDTO;

import java.util.List;

public interface StreamService {
    void addStream(StreamDTO streamDTO);
    void updateStream(StreamDTO streamDTO);
    void deleteStream(int id);
    StreamDTO searchById(int id);
    List<StreamDTO> getAllStreams();
}
