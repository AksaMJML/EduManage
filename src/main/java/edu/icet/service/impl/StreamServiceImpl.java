package edu.icet.service.impl;

import edu.icet.model.dto.StreamDTO;
import edu.icet.model.entity.StreamEntity;
import edu.icet.repositery.StreamRepositery;
import edu.icet.service.StreamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StreamServiceImpl implements StreamService {

    final StreamRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addStream(StreamDTO streamDTO) {
        repositery.save(mapper.map(streamDTO , StreamEntity.class));
    }

    @Override
    public void updateStream(StreamDTO streamDTO) {
        repositery.save(mapper.map(streamDTO , StreamEntity.class));
    }

    @Override
    public void deleteStream(int id) {
        repositery.deleteById(id);
    }

    @Override
    public StreamDTO searchById(int id) {
        StreamEntity streamEntity = repositery.findById(id).get();
        StreamDTO streamDTO = mapper.map(streamEntity, StreamDTO.class);
        return streamDTO;
    }

    @Override
    public List<StreamDTO> getAllStreams() {
        List<StreamEntity> streamEntities = repositery.findAll();
        ArrayList<StreamDTO> streamDTOArrayList = new ArrayList<>();
        streamEntities.forEach(streamEntity -> {
            StreamDTO streamDTO = mapper.map(streamEntity, StreamDTO.class);
            streamDTOArrayList.add(streamDTO);
        });
        return streamDTOArrayList;
    }
}
