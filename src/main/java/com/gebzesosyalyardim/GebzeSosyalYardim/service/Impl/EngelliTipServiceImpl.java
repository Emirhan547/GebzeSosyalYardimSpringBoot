/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.EngelliTip;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.EngelliTipRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.EngelliTipService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author emirh
 */
@Service
public class EngelliTipServiceImpl implements EngelliTipService {
    private final EngelliTipRepository engelliTipRepository;

    @Autowired
    public EngelliTipServiceImpl(com.gebzesosyalyardim.GebzeSosyalYardim.repository.EngelliTipRepository engelliTipRepository) {
        this.engelliTipRepository = engelliTipRepository;
    }

   
    @Override
    public EngelliTip saveEngelliTip(EngelliTip engelliTip) {
        return engelliTipRepository.save(engelliTip);
    }

    @Override
    public Optional<EngelliTip> getEngelliTipById(Long id) {
        return engelliTipRepository.findById(id);
    }

    @Override
    public List<EngelliTip> getAllEngelliTips() {
        return engelliTipRepository.findAll();
    }

    @Override
    public EngelliTip updateEngelliTip(EngelliTip engelliTip) {
        return engelliTipRepository.save(engelliTip);
    }

    @Override
    public void deleteEngelliTipById(Long id) {
        engelliTipRepository.deleteById(id);
    }
}
