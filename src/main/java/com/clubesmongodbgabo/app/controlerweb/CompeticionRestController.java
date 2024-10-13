package com.clubesmongodbgabo.app.controlerweb;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.clubesmongodbgabo.app.NotFoundException.NotFoundException;
import com.clubesmongodbgabo.app.repository.CompeticionRepositorio;
import com.clubesmongodbgabo.app.variables.Competicion;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/competiciones")
public class CompeticionRestController {
	
	 @Autowired
	    private CompeticionRepositorio competicionRepository;
	 
	 @GetMapping("/")
	    public List<Competicion> getAllCompeticions() {
	        return competicionRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public Competicion getCompeticionById(@PathVariable String id) {
	        return competicionRepository.findById(id).orElseThrow(() -> new NotFoundException("Competicion no encontrado"));
	    }

	    @PostMapping("/")
	    public Competicion saveCompeticion(@RequestBody Map<String, Object> body) {
	        ObjectMapper mapper = new ObjectMapper();
	        Competicion competicion = mapper.convertValue(body, Competicion.class);
	        return competicionRepository.save(competicion);
	    }

	    @PutMapping("/{id}")
	    public Competicion updateCompeticion(@PathVariable String id, @RequestBody Map<String, Object> body) {
	        ObjectMapper mapper = new ObjectMapper();
	        Competicion competicion = mapper.convertValue(body, Competicion.class);
	        competicion.setId(id);
	        return competicionRepository.save(competicion);
	    }

	    @DeleteMapping("/{id}")
	    public Competicion deleteCompeticion(@PathVariable String id) {
	        Competicion competicion = competicionRepository.findById(id).orElseThrow(() -> new NotFoundException("Competicion no encontrado"));
	        competicionRepository.deleteById(id);
	        return competicion;
	    }	 

}
