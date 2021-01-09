package com.nidal.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nidal.languages.models.Language;
import com.nidal.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
    private final LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    public Language createLanguage(Language l) {
        return languageRepository.save(l);
    }
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    public Language updateLanguage(Language l) {
    	return languageRepository.save(l);
    }
    
    public Language updateLanguage(Long id, String name, String creator, String currentVersion) {
    	Optional <Language> update = languageRepository.findById(id);
    	if(update != null) {
    		update.get().setName(name);
    		update.get().setCreator(creator);
    		update.get().setCurrentVersion(currentVersion);
    		return update.get();
    	}
    	return null;        
    }
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }
}
