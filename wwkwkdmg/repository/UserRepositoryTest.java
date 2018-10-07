package com.sda.chatappserver.wwkwkdmg.repository;

import com.sda.chatappserver.wwkwkdmg.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void shouldFindUserByNickAndPassword() {

        // Arrange
        String nick = "Bobek";
        String password = "123";

        // Act
        User result = userRepository.findUserByNickAndPassword(nick, password);

        // Assert
        assertThat(result.getId(), is(10l));
        assertThat(result.getNick(), is(nick));
        assertThat(result.getPassword(), is(password));
    }

    @Test
    public void shouldSaveUserToDbAndReturnHimFromIt() {

        String nick = "Harry";
        User user = new User();
        user.setNick(nick);
        user.setPassword("123");
        user.setId(10L);
        userRepository.save(user);

        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(usr -> userList.add(usr));

        assertThat(userList.size(), is(3));
        assertThat(userList.get(0).getNick(), is(nick));
        assertThat(userList.get(0).getPassword(), is("123"));
        assertThat(userList.get(0).getId(), is(10L));
    }
}

