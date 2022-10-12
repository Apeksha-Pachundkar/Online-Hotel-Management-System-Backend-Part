package com.Room;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@SpringBootTest(classes= {RoomMicroserviceApplicationTests.class})
class RoomMicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	/*
	 * @Autowired MockMvc mockMvc;
	 */
	/*
	@Mock
	RoomRepository roomRepository;

	
	public List<Room> myRooms;
	
	@InjectMocks
	RoomController roomController;
	
	@Test
	@Order(1)
	void test_getRooms() {//(getAllRooms) This test is written for getAllRooms method
		
		//Create List of type Room
		List<Room> myRooms= new ArrayList<Room>();

		//Add Room details in ArrayList
		myRooms.add(new Room(1L,"Single",LocalDate.of(2022, 06, 25),LocalDate.of(2022, 06, 27)));
		myRooms.add(new Room(2L,"Double",LocalDate.of(2022, 07, 02),LocalDate.of(2022, 07, 18)));
		myRooms.add(new Room(3L,"Single",LocalDate.of(2022, 07, 20),LocalDate.of(2022, 07, 22)));
		
		when(roomRepository.findAll()).thenReturn(myRooms);//Mocking
		
		assertEquals(3,roomController.getRooms().size());
	}
	
	@Test
	@Order(2)
	void test_getRooms1() {//(getAllRooms) This test is written for getAllRooms method
		
		//Create List of type Room
		List<Room> myRooms1= new ArrayList<Room>();

		when(roomRepository.findAll()).thenReturn(myRooms1);//Mocking
		
		assertEquals(myRooms1,roomController.getRooms());
	}
	

	
	@Test
	@Order(2)
	 void test_postRoom() {  //This test is written for postRoom method
		
		Room room = new Room(3L,"Single",LocalDate.of(2022, 07, 20),LocalDate.of(2022, 07, 22));
	    when(roomRepository.save(room)).thenReturn(room);
		assertEquals(room,roomController.postRoom(room));
	}
	
	
	@Test
	@Order(3)
	void test_postRoom1() {  //This test is written for postRoom method
		
		Room room = new Room(3L,"Single",LocalDate.of(2022, 07, 20),LocalDate.of(2022, 07, 22));
		if(room.getRoomType()==null) {
			assertEquals(null, room.getRoomType());
		
		}
		else {
	    when(roomRepository.save(room)).thenReturn(room);
	    assertEquals(room,roomController.postRoom(room));
		}
		
	}
	
	
	/*
	 * @Test
	 * 
	 * @Order(7) void test_getRoomById() throws Exception{ Room room = new
	 * Room(3L,"Single",LocalDate.of(2022, 07, 20),LocalDate.of(2022, 07, 22)); long
	 * roomId=3L;
	 * 
	 * when(roomRepository.getById(roomId)).thenReturn(room);
	 * 
	 * this.mockMvc.perform(get("/room/{roomId}",roomId))
	 * .andExpect(status().isFound())
	 * .andExpect(MockMvcResultMatchers.jsonPath(".roomId").value(3L))
	 * .andExpect(MockMvcResultMatchers.jsonPath(".roomType").value("Single"))
	 * .andExpect(MockMvcResultMatchers.jsonPath(".checkIn").value(LocalDate.of(
	 * 2022, 07, 20)))
	 * .andExpect(MockMvcResultMatchers.jsonPath(".checkOut").value(LocalDate.of(
	 * 2022, 07, 22))) .andDo(print());
	 * 
	 * }
	 */
	
	
	
	
	/*
	@Test
	@Order(4)
	void test_updateRoomDetails() { // This test is written for updateRoomDetails method
		Room room = new Room(3L,"Single",LocalDate.of(2022, 07, 20),LocalDate.of(2022, 07, 22));
		long roomId=3L;
		
		when(roomRepository.getById(roomId)).thenReturn(room);
		when(roomController.updateRoomDetails(roomId,room)).thenReturn(room);
		
		Room updatedRoomDetails = roomController.updateRoomDetails(roomId, room);
		
		assertEquals(roomId,updatedRoomDetails.getRoomId());
		assertEquals("Single",updatedRoomDetails.getRoomType());
		assertEquals(LocalDate.of(2022, 07, 20),updatedRoomDetails.getCheckIn());
		assertEquals(LocalDate.of(2022, 07, 22),updatedRoomDetails.getCheckOut());
		
		
	    
		assertEquals(room,roomController.updateRoomDetails(roomId,room));
	}
	


    
	@Test
	@Order(5)
	void test_updateRoomDetails1() { // This test is written for updateRoomDetails method
		Room room = new Room(3L,"Single",LocalDate.of(2022, 07, 20),LocalDate.of(2022, 07, 22));
		long roomId=3L;
		
		when(roomRepository.getById(roomId)).thenReturn(room);
		when(roomController.updateRoomDetails(roomId,room)).thenReturn(room);
		
		Room updatedRoomDetails = roomController.updateRoomDetails(roomId, room);
		
		assertEquals(roomId,updatedRoomDetails.getRoomId());
		
		if(updatedRoomDetails.getRoomType() != null)
		  assertEquals("Single",updatedRoomDetails.getRoomType());
		
		if(updatedRoomDetails.getCheckIn() != null)
		  assertEquals(LocalDate.of(2022, 07, 20),updatedRoomDetails.getCheckIn());
		
		if(updatedRoomDetails.getCheckOut() != null)
		  assertEquals(LocalDate.of(2022, 07, 22),updatedRoomDetails.getCheckOut());
		   
		assertEquals(room,roomController.updateRoomDetails(roomId,room));
	}
	
	
	@Test
	@Order(6)
	void test_deleteRoomById() { // This test is written for deleteRoomById method
		Room room = new Room(3L,"Single",LocalDate.of(2022, 07, 20),LocalDate.of(2022, 07, 22));
		long roomId=room.getRoomId();
		roomController.deleteRoomById(roomId);	
	    verify(roomRepository,times(1)).deleteById(roomId);//Mocking :for mocking void methods we use verify
	}
     */
}
