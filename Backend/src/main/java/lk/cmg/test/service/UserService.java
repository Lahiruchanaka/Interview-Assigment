package lk.cmg.test.service;

import lk.cmg.test.dto.UserDTO;
import lk.cmg.test.entity.User;

/**
 * @author Lahiru Chanaka <chankalahiru69@gmail.com>
 * @since 12/3/2021
 */

public interface UserService {
    void registerUser(UserDTO dto);
}
