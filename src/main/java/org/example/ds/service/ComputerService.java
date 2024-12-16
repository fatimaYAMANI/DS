package org.example.ds.service;

import org.example.ds.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    public List<ComputerDto> getComputerByProce(String proce);
    public ComputerDto saveComputer(ComputerDto computerDto);

}
