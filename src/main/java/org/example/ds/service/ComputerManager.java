package org.example.ds.service;

import lombok.AllArgsConstructor;
import org.example.ds.dao.entities.Computer;
import org.example.ds.dao.repositories.ComputerRepository;
import org.example.ds.dto.ComputerDto;
import org.example.ds.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{
    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;
    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for(Computer computer : computers){
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return  computerDtos;
    }



    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return computerDto;
    }


}
