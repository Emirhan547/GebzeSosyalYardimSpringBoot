/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.service;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.EngelliTip;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author emirh
 */
public interface EngelliTipService {
    EngelliTip saveEngelliTip(EngelliTip engelliTip);
    Optional<EngelliTip> getEngelliTipById(Long id);
    List<EngelliTip> getAllEngelliTips();
    EngelliTip updateEngelliTip(EngelliTip engelliTip);
    void deleteEngelliTipById(Long id);
}
