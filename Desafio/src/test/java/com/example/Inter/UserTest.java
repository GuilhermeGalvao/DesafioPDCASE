package com.example.Inter;

import com.example.Desafio.entities.User;
import com.example.Desafio.repositories.UserRepository;
import com.example.Desafio.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class UserTest {

    @InjectMocks
    private  UserService userService;

    @Mock
    private UserRepository userRepositorie;


    @Before
    public void setup(){
        User user = new User();
        user.setId(1);
        user.setName("Guilherme Galvao");
        user.setEmail("guigalv@hotmail.com");
        Mockito.when(userRepositorie.findById(1)).thenReturn(Optional.of(user));



    }

    @Test
    public void testPositiveGetUser() {

        User newUser = userService.get(1);
        assertTrue(newUser.getName() != null );
        assertEquals( newUser.getName(),"Guilherme Galvao");
        assertTrue(newUser.getEmail() != null );
        assertEquals(newUser.getEmail(), "guigalv@hotmail.com");
    }

    @Test
    public void testNegativeGetUser() {

        User newUser = userService.get(1);
        assertFalse(newUser.getName() == null );
        assertNotEquals( newUser.getName(),"joao Pedro");
        assertFalse(newUser.getEmail() == null );
        assertNotEquals(newUser.getEmail(), "joao@hotmail.com");
    }

    @Test
    public void insertPositiveNewUser(){
        User user = new User();
        user.setId(1);
        user.setName("Guilherme Galvao");
        user.setEmail("guigalv@hotmail.com");

        Mockito.when(userRepositorie.saveAndFlush(user)).thenReturn(user);
        User userResult = userService.save(user);
        assertTrue(userResult.getId() != null);
    }

    @Test(expected = DateTimeParseException.class)
    public void insertNegativeNewUser(){
        User user = new User();
        user.setId(1);
        user.setName("Guilherme Galvao");
        user.setEmail("guigalv@hotmail.com");

        Mockito.when(userRepositorie.saveAndFlush(user)).thenThrow(DateTimeParseException.class);
        User userResult = userService.save(user);

    }

    @Test
    public void getAllUsers(){
        List<User>  users = new ArrayList<>();
        Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            User newUser = new User();
            newUser.setName(name);
            newUser.setEmail(name+"@mail.com");
            newUser.setUsername("User "+name);
            newUser.setSurname(name + " " + name);
            newUser.setIsEnable(true);
            newUser.setPassword(name + "123");
            newUser.setPhone("31912345678");
            newUser.setRegisterDate(new Date());
            users.add(newUser);
        });
        Mockito.when(userRepositorie.findAll()).thenReturn(users);

        List<User> systemUsers = userRepositorie.findAll();

        assertEquals(systemUsers, users);
        assertTrue(systemUsers.get(1).getName() == "Julie");
        assertFalse(systemUsers.get(0).getName() == "Helen");
    }

    @Test
    public void allUsersReturnNothing(){
        List<User>  users = new ArrayList<>();
        Mockito.when(userRepositorie.findAll()).thenReturn(users);

        List<User> systemUsers = userRepositorie.findAll();

        assertTrue(systemUsers.size() == 0);
    }


    @Test
    public void updateUser(){

        User updatedUser = new User();
        updatedUser.setId(1);
        updatedUser.setName("Guilherme Galvao Teste");
        updatedUser.setEmail("guigalv@hotmail.com");


        User newUserUpdated = userService.update(1, updatedUser);
        assertTrue(newUserUpdated.getId() != null );
        assertTrue(newUserUpdated.getName() != null );
        assertEquals( "Guilherme Galvao Teste" , newUserUpdated.getName());
        assertTrue(newUserUpdated.getEmail() != null );
        assertEquals("guigalv@hotmail.com", newUserUpdated.getEmail());

    }

    @Test
    public void deleteUser(){
        Mockito.doNothing().when(userRepositorie).deleteById(1);
        assertEquals("Deleted", userService.delete(1));
        Mockito.verify(userRepositorie).deleteById(1);

    }
}
