/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.config;

import com.gebzesosyalyardim.GebzeSosyalYardim.repository.EngelliTipRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.GuvenceBirimRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.GuvenceRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.HastalikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiAskerlikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiDetayRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiEgitimDurumRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiEngelRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiHastalikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiIletisimRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiTemelRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KisiYakinlarRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KullaniciRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.KurumRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatBilgiRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatDurumRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.MuracaatYardimTalepRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.OkulRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakBorcRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakDurumRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakEvDurumRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakEvEsyalariRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakEvTipRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakGelirRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakMulkiyetRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakSosyalGuvenceRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.TutanakYakacakRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YakinlikRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YardimAltRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YardimStatuRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.repository.YardimTurRepository;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.EngelliTipService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.GuvenceBirimService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.GuvenceService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.HastalikService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiAskerlikService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiDetayService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiEgitimDurumService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiEngelService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiHastalikService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiIletisimService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiTemelService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiYakinlarService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KisiYakinlarStatuService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KullaniciService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.KurumService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatBilgiService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatDurumService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.MuracaatYardimTalepService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.OkulService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakBorcService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakDurumService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakEvDurumService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakEvEsyalariService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakEvTipService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakGelirService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakMulkiyetService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakSosyalGuvenceService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.TutanakYakacakService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YakinlikService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimAltService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimStatuService;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.YardimTurService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.EngelliTipServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.GuvenceBirimServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.GuvenceServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.HastalikServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiAskerlikServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiDetayServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiEgitimDurumServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiEngelServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiHastalikServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiIletisimServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiTemelServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiYakinlarServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KisiYakinlarStatuServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KullaniciServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.KurumServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.MuracaatBilgiServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.MuracaatDurumServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.MuracaatServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.MuracaatYardimTalepServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.OkulServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakBorcServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakDurumServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakEvDurumServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakEvEsyalariServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakEvTipServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakGelirServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakMulkiyetServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakSosyalGuvenceServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.TutanakYakacakServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.YakinlikServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.YardimAltServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.YardimStatuServiceImpl;
import com.gebzesosyalyardim.GebzeSosyalYardim.service.Impl.YardimTurServiceImpl;



/**
 *
 * @author emirh
 */
@Configuration
public class ServiceConfig {
   @Bean
    public EngelliTipService engelliTipService(EngelliTipRepository engelliTipRepository) {
        return new EngelliTipServiceImpl(engelliTipRepository);
    } 
    @Bean
    public GuvenceBirimService guvenceBirimService(GuvenceBirimRepository guvenceBirimRepository) {
        return new GuvenceBirimServiceImpl(guvenceBirimRepository);
    }
    @Bean
    public GuvenceService guvenceService(GuvenceRepository guvenceRepository) {
        return new GuvenceServiceImpl(guvenceRepository);
    }
    @Bean
    public HastalikService hastalikService(HastalikRepository hastalikRepository) {
        return new HastalikServiceImpl(hastalikRepository);
}
    @Bean
    public KisiAskerlikService kisiAskerlikService(KisiAskerlikRepository kisiAskerlikRepository) {
        return new KisiAskerlikServiceImpl(kisiAskerlikRepository);
}
    @Bean
    public KisiDetayService kisiDetayService(KisiDetayRepository kisiDetayRepository) {
        return new KisiDetayServiceImpl(kisiDetayRepository);
}
    @Bean
    public KisiEgitimDurumService kisiEgitimDurumService(KisiEgitimDurumRepository kisiEgitimdurumRepository) {
        return new KisiEgitimDurumServiceImpl(kisiEgitimdurumRepository);
}
    @Bean
    public KisiEngelService kisiEngelService(KisiEngelRepository kisiEngelRepository) {
        return new KisiEngelServiceImpl(kisiEngelRepository);
}
    @Bean
    public KisiHastalikService kisiHastalikService(KisiHastalikRepository kisiHastalikRepository) {
        return new KisiHastalikServiceImpl(kisiHastalikRepository);
}
    @Bean
    public KisiIletisimService kisiIletisimService(KisiIletisimRepository kisiIletisimRepository) {
        return new KisiIletisimServiceImpl(kisiIletisimRepository);
}
    @Bean
    public KisiTemelService kisiTemelService(KisiTemelRepository kisiTemelRepository) {
        return new KisiTemelServiceImpl(kisiTemelRepository);
}
    @Bean
    public KisiYakinlarService kisiYakinlarService(KisiYakinlarRepository kisiYakinlarRepository) {
        return new KisiYakinlarServiceImpl(kisiYakinlarRepository);
}
    @Bean
    public KisiYakinlarStatuService kisiYakinlarStatuService(KisiYakinlarRepository kisiYakinlarRepository) {
        return new KisiYakinlarStatuServiceImpl(kisiYakinlarRepository);
    }
    @Bean
    public KullaniciService kullaniciService(KullaniciRepository kullaniciRepository) {
        return new KullaniciServiceImpl(kullaniciRepository);
}
    @Bean
    public KurumService kurumService(KurumRepository kurumRepository) {
        return new KurumServiceImpl(kurumRepository);
}
    @Bean
    public MuracaatBilgiService muracaatBilgiService(MuracaatBilgiRepository muracaatBilgiRepository) {
        return new MuracaatBilgiServiceImpl(muracaatBilgiRepository);
}
    @Bean
    public MuracaatDurumService muracaatDurumService(MuracaatDurumRepository muracaatDurumRepository) {
        return new MuracaatDurumServiceImpl(muracaatDurumRepository);
}
    @Bean
    public MuracaatService muracaatService(MuracaatRepository muracaatRepository) {
        return new MuracaatServiceImpl(muracaatRepository);
}
    @Bean
    public MuracaatYardimTalepService muracaatYardimtalepService(MuracaatYardimTalepRepository muracaatYardimtalepRepository) {
        return new MuracaatYardimTalepServiceImpl(muracaatYardimtalepRepository);
}
    @Bean
    public OkulService okulService(OkulRepository okulRepository) {
        return new OkulServiceImpl(okulRepository);
}
@Bean
    public TutanakBorcService tutanakBorcService(TutanakBorcRepository tutanakBorcRepository) {
        return new TutanakBorcServiceImpl(tutanakBorcRepository);
}
    @Bean
    public TutanakDurumService tutanakDurumService(TutanakDurumRepository tutanakDurumRepository) {
        return new TutanakDurumServiceImpl(tutanakDurumRepository);
}
    @Bean
    public TutanakEvDurumService tutanakEvdurumService(TutanakEvDurumRepository tutanakEvdurumRepository) {
        return new TutanakEvDurumServiceImpl(tutanakEvdurumRepository);
}
    @Bean
    public TutanakEvEsyalariService tutanakEvesyalariService(TutanakEvEsyalariRepository tutanakEvesyalariRepository) {
        return new TutanakEvEsyalariServiceImpl(tutanakEvesyalariRepository);
}
    @Bean
    public TutanakEvTipService tutanakEvetipService(TutanakEvTipRepository tutanakEvtipRepository) {
        return new TutanakEvTipServiceImpl(tutanakEvtipRepository);
}
    @Bean
    public TutanakGelirService tutanakGelirService(TutanakGelirRepository tutanakGelirRepository) {
        return new TutanakGelirServiceImpl(tutanakGelirRepository);
}
    @Bean
    public TutanakMulkiyetService tutanakMulkiyetService(TutanakMulkiyetRepository tutanakMulkiyetRepository) {
        return new TutanakMulkiyetServiceImpl(tutanakMulkiyetRepository);
}
    @Bean
    public TutanakSosyalGuvenceService tutanakSosyalguvenceService(TutanakSosyalGuvenceRepository tutanakSosyalguvenceRepository) {
        return new TutanakSosyalGuvenceServiceImpl(tutanakSosyalguvenceRepository);
}
    @Bean
    public TutanakYakacakService tutanakYakacakService(TutanakYakacakRepository tutanakYakacakRepository) {
        return new TutanakYakacakServiceImpl(tutanakYakacakRepository);
}
    @Bean
    public YakinlikService yakinlikService(YakinlikRepository yakinlikRepository) {
        return new YakinlikServiceImpl(yakinlikRepository);
}
    @Bean
    public YardimAltService yardimAltService(YardimAltRepository yardimAltRepository) {
        return new YardimAltServiceImpl(yardimAltRepository);
}
    @Bean
    public YardimStatuService yardimStatuService(YardimStatuRepository yardimStatuRepository) {
        return new YardimStatuServiceImpl(yardimStatuRepository);
}
    @Bean
    public YardimTurService yardimTurService(YardimTurRepository yardimTurRepository) {
        return new YardimTurServiceImpl(yardimTurRepository);
}
}
