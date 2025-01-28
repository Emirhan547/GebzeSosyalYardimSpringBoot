/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller;

import com.gebzesosyalyardim.GebzeSosyalYardim.entities.EngelliTip;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.EngelliTipService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emirh
 */
@RestController
@RequestMapping("/api/engellitip")
public class EngelliTipController {
    private final EngelliTipService engelliTipService;

    public EngelliTipController(EngelliTipService engelliTipService) {
        this.engelliTipService = engelliTipService;
    }

    @PostMapping
    public ResponseEntity<EngelliTip> createEngelliTip(@RequestBody EngelliTip engelliTip) {
        return ResponseEntity.ok(engelliTipService.saveEngelliTip(engelliTip));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EngelliTip> getEngelliTipById(@PathVariable Long id) {
        return engelliTipService.getEngelliTipById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<EngelliTip>> getAllEngelliTips() {
        return ResponseEntity.ok(engelliTipService.getAllEngelliTips());
    }

    @PutMapping
    public ResponseEntity<EngelliTip> updateEngelliTip(@RequestBody EngelliTip engelliTip) {
        return ResponseEntity.ok(engelliTipService.updateEngelliTip(engelliTip));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEngelliTip(@PathVariable Long id) {
        engelliTipService.deleteEngelliTipById(id);
        return ResponseEntity.noContent().build();
    }
}
