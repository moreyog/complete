package com.example.accessingdatamysql;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/users")
public class MainController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;


	@PostMapping()
	public @ResponseBody String addNewUser (@RequestBody UserDto userDto){
		UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
		userRepository.save(userEntity);
		return "Saved";
	}


	@PutMapping
	public @ResponseBody String updateUser (@RequestBody UserDto userDto){
		UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
		userRepository.save(userEntity);
		return "Updated";
	}

	@DeleteMapping
	public @ResponseBody String deleteUser (@RequestBody UserDto userDto){
		UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
		userRepository.delete(userEntity);
		return "Deleted";
	}

	@GetMapping
	public @ResponseBody Iterable<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}
}
