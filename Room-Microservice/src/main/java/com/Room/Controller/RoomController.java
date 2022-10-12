package com.Room.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Room.Models.Room;
import com.Room.Models.RoomList;

import com.Room.Service.Roomservice;
import com.Room.Service.RoomserviceImpl;

import io.swagger.annotations.ApiOperation;


@RestController
public class RoomController {

	@Autowired
	Roomservice roomService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}

//	public RoomController(RoomserviceImpl roomservice) {
//		this.roomService = roomservice;
//	}

	// add room details
	@ApiOperation(value = "Post the room", response = Room.class)
	@PostMapping("/addRoom")
	public Room addRoom(@RequestBody Room room) {
		return this.roomService.addRoom(room);
	}

	// get all room details
	@ApiOperation(value = "Fetch all the rooms", response = Room.class)
	@GetMapping("/findAllRoom")
	public RoomList getAllRoom() {

		RoomList list = new RoomList();
		list.setAllRoom(this.roomService.getAllRoom());

		return list;
	}

	// get room details by room id
	@ApiOperation(value = "Fetch room by room id", 
			      notes = "Provide an id of the room and fetch the room details", 
			      response = Room.class)
	@GetMapping("/findById/{id}")
	public Optional<Room> getRoom(@PathVariable("id") String id) {
		return this.roomService.getRoom(Long.parseLong(id));
	}

	// update room details
	@ApiOperation(value = "Update room", 
			      notes = "Update the room details", 
			      response = Room.class)
	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room) {
		return this.roomService.updateRoom(room);
	}

	// delete room details by room id
	@ApiOperation(value = "Delete room by room id", 
			      notes = "Provide an id of the room and delete the room details", 
			      response = Room.class)
	@DeleteMapping("/delete/{id}")
	public String deleteRoom(@PathVariable("id") String id) {
		return this.roomService.deleteRoom(Long.parseLong(id));
	}

	// check availability of room
//	@GetMapping("/findRoomAvl")
//	public RoomList getRoomAvl() {
//		return this.roomService.getRoomAvl();
//	}

}