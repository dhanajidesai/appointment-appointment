package com.hospital.register;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepo;
	
	
	public RegisterModel newRegisteration(RegisterModel obj){
		return registerRepo.save(obj);
	}
	
	public void updateRegisteration(RegisterModel obj,String id){
		registerRepo.save(obj);
	}
	
	public List<RegisterModel> show_allRegisteration(){
		List<RegisterModel> reg = new ArrayList<>();
		registerRepo.findAll().forEach(reg::add);
		return reg;
	}
	
	public Optional<RegisterModel> show_oneRegisteration(String id){
		return registerRepo.findById(id);
	}
	
	public void deleteRegisteration(String id){
		registerRepo.deleteById(id);
	}
	
}
